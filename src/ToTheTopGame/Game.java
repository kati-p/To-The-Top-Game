/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToTheTopGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Xvariable
 */
public class Game extends JPanel implements ActionListener {

    private Player player;
    private Room rp;
    private Tower tower1, tower2, tower3;
    private Life hp;
    private Animation ani;
    private JButton home;
    private int key, playerScore, prevScore, startScore;
    private boolean win = false, lose = false;
    private Timer timer;
    private ImageIcon[] background = {
        new ImageIcon("src\\img_bg\\bg1.png"),
        new ImageIcon("src\\img_bg\\bg2.png"),
        new ImageIcon("src\\img_bg\\bg3.png")
    };

    public Game() {
        //set Panel
        this.setPreferredSize(new Dimension(Main.WIDTH, Main.HEIGHT));
        this.setLayout(null);

        //set home button
        home = new JButton();
        home.setBounds(630, 10, 50, 50);
        home.addActionListener(this);
        home.setIcon(new ImageIcon("src\\img_bg\\home.png"));
        home.setBackground(Color.WHITE);
        home.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(home);

        //random key
        Random rnd = new Random();
        key = rnd.nextInt(3);

        //Game
        ani = new Animation();
        hp = new Life(10, 10, 3);
        playerScore = rnd.nextInt(6) + 1;
        startScore = playerScore;
        player = new Player(100, 382, playerScore, key);
        rp = new Room(100, 382, key);
        tower1 = new Tower(250, 382, key, rnd.nextInt(4) + 3);
        tower1.createEnemy();
        tower2 = new Tower(400, 382, key, rnd.nextInt(4) + 3);
        tower2.createEnemy();
        tower3 = new Tower(550, 382, key, 6);
        tower3.createEnemy();

        //random score tower1
        prevScore = rnd.nextInt(10) + 1;
        ArrayList<Character> ct1 = tower1.getCharacters();
        for (int i = 0; i < tower1.getLevel(); i++) {
            if (i == 0) {
                Weapon w = new Weapon(0, 0, 0, key);
                w.clone(ct1.get(i));
                ct1.set(i, w);
            }
            ct1.get(i).setScore(prevScore);
            playerScore = playerScore + prevScore;
            if (i == 0 && playerScore - prevScore >= prevScore) {
                prevScore = playerScore - prevScore + 1;
            }
            if (playerScore - prevScore == 0) {
            } else {
                prevScore = prevScore + rnd.nextInt(playerScore - prevScore);
            }
        }
        tower1.shuffleCharacter();

        //random score tower2
        ArrayList<Character> ct2 = tower2.getCharacters();
        for (int i = 0; i < tower2.getLevel(); i++) {
            ct2.get(i).setScore(prevScore);
            playerScore = playerScore + prevScore;
            if (playerScore - prevScore == 0) {
            } else {
                prevScore = prevScore + rnd.nextInt(playerScore - prevScore);
            }
        }
        tower2.shuffleCharacter();

        //random score tower3
        ArrayList<Character> ct3 = tower3.getCharacters();
        for (int i = 0; i < tower3.getLevel(); i++) {
            if (i == tower3.getLevel() - 1) {
                Enemy b = (Enemy) ct3.get(i);
                b.setKey(b.getKey() + 3);
                ct3.set(i, b);
            }
            ct3.get(i).setScore(prevScore);
            playerScore = playerScore + prevScore;
            if (playerScore - prevScore == 0) {
            } else {
                prevScore = prevScore + rnd.nextInt(playerScore - prevScore);
            }
        }
        tower3.shuffleCharacter(tower3.getLevel() - 1);

        //add
        this.addMouseMotionListener(new MouseInput(player));
        this.addMouseListener(new MouseInput(player));

        //start timer
        timer = new Timer(10, this);
        timer.start();
    }

    /**
     * check when player is collision a character in tower
     *
     * @param t
     */
    public void checkCollision(Tower t) {
        for (int i = 0; i < t.getCharacters().size(); i++) {
            //if collision
            if (player.getHitbox().intersects(t.getCharacters().get(i).getHitbox())) {
                int x = t.getCharacters().get(i).getX();
                int y = t.getCharacters().get(i).getY();
                //compare enemy
                if (t.getCharacters().get(i) instanceof Enemy) {
                    Enemy en = (Enemy) t.getCharacters().get(i);    //check enemy or boss
                    //player win boss
                    if (en.getKey() > 2
                            && player.getScore() >= t.getCharacters().get(i).getScore()) {
                        player.setScore(player.getScore() + t.getCharacters().get(i).getScore());
                        t.getCharacters().remove(i);
                        timer.setDelay(100);
                        ani.startAnimation(x, y, "HvsB", key);
                        win = true;
                    } //player lose boss 
                    else if (en.getKey() > 2 && player.getScore() < t.getCharacters().get(i).getScore()
                            && hp.hasHp()) {
                        t.getCharacters().get(i).setX(850); // set enemy x because not visible
                        timer.setDelay(100);
                        ani.startAnimation(x, y, "BvsH", key);
                        hp.loseHP();
                    } //player win enemy
                    else if (player.getScore() >= t.getCharacters().get(i).getScore()) {
                        player.setScore(player.getScore() + t.getCharacters().get(i).getScore());
                        t.getCharacters().remove(i);
                        timer.setDelay(100);
                        ani.startAnimation(x, y, "HvsE", key);
                    } // player with not has weapon lose but has health
                    else if (player.getScore() == startScore
                            && player.getScore() < t.getCharacters().get(i).getScore()
                            && hp.hasHp()) {
                        hp.loseHP();
                    }//player lose enemy but has health
                    else if (player.getScore() < t.getCharacters().get(i).getScore()
                            && hp.hasHp()) {
                        t.getCharacters().get(i).setX(850); // set enemy x because not visible
                        timer.setDelay(100);
                        ani.startAnimation(x, y, "EvsH", key);
                        hp.loseHP();
                    }//player lose boss
                    else if (en.getKey() > 2) {
                        t.getCharacters().get(i).setX(850); // set enemy x because not visible
                        timer.setDelay(100);
                        ani.startAnimation(x, y, "BvsH", key);
                        lose = true;
                    }// player with not has weapon lose
                    else if (player.getScore() == startScore
                            && player.getScore() < t.getCharacters().get(i).getScore()) {
                        Main.loseGame();
                    }//lose enemy
                    else {
                        t.getCharacters().get(i).setX(850); // set enemy x because not visible
                        timer.setDelay(100);
                        ani.startAnimation(x, y, "EvsH", key);
                        lose = true;
                    }
                } //compare weapon
                else if (t.getCharacters().get(i) instanceof Weapon) {
                    player.setScore(player.getScore() + t.getCharacters().get(i).getScore());
                    player.setKey(player.getKey() + 3);
                    t.getCharacters().remove(i);
                }
                break;  //break because don't want this to multiple collision
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //draw background
        g2d.drawImage(background[key].getImage(), 0, 0, null);
        //draw room
        rp.drawRoom(g2d);
        //draw tower
        tower1.drawTower(g2d);
        tower2.drawTower(g2d);
        tower3.drawTower(g2d);
        //draw player
        player.drawCharacter(g2d);
        //draw hp
        hp.drawLife(g2d);
        //draw animation if animating
        if (ani.isAnimating()) {
            ani.drawAnimation(g2d);
        }
        //draw home button?
        g2d.setPaint(Color.WHITE);
        g2d.fillRect(630, 10, 50, 50);
        g2d.drawImage(new ImageIcon("src\\img_bg\\home.png").getImage(), 630, 10, null);
        g2d.setPaint(Color.BLACK);
        g2d.drawRect(630, 10, 50, 50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //JButton home event
        if (e.getSource() == home) {
            Main.backHome();
        }
        //Timer event
        if (ani.isAnimating()) {
            player.setX(850);   // set x player to 850 because not visible
            ani.changeAnimation();
            //when animation end
            if (!ani.isAnimating()) {
                //set player to started x because visible
                player.setX(player.getStartX());
                //set all enemys to started x
                if (tower1.hasTower()) {
                    tower1.setStartXAllCharacter();
                }
                if (tower2.hasTower()) {
                    tower2.setStartXAllCharacter();
                }
                if (tower3.hasTower()) {
                    tower3.setStartXAllCharacter();
                }
                //if win
                if (win) {
                    Main.winGame();
                }
                //if lose
                if (lose) {
                    Main.loseGame();
                }
                timer.setDelay(10);
            }
        } else { 
            //if tower is empty, tower will fall
            if (tower1.getCharacters().isEmpty()) {
                tower1.fallTower();
            }
            if (tower2.getCharacters().isEmpty()) {
                tower2.fallTower();
            }
            if (tower3.getCharacters().isEmpty()) {
                tower3.fallTower();
            }
        }
        this.repaint(); //repaint
    }

    //Mouse input
    public class MouseInput extends MouseMotionAdapter implements MouseListener {

        Player p;

        /**
         *
         * @param p
         */
        public MouseInput(Player p) {
            this.p = p;
        }

        /**
         *
         * @param e
         */
        @Override
        public void mouseDragged(MouseEvent e) {
            if (e.getX() >= p.getX()
                    && e.getX() <= p.getX() + 50
                    && e.getY() >= p.getY()
                    && e.getY() <= p.getY() + 50) {
                p.setX(e.getX() - 25);
                p.setY(e.getY() - 25);
            }

        }

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        /**
         *
         * @param e
         */
        @Override
        public void mouseReleased(MouseEvent e) {
            //when mouse released, check collision
            if (tower1.hasTower()) {
                checkCollision(tower1);
            } else if (tower2.hasTower()) {
                checkCollision(tower2);
            } else if (tower3.hasTower()) {
                checkCollision(tower3);
            }
            //set player to started x
            p.setX(p.getStartX());
            p.setY(p.getStartY());
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

    }
}
