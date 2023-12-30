/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToTheTopGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Xvariable
 */
public class Home extends JPanel implements ActionListener, MouseListener {

    Timer timer;
    boolean c = true;

    public Home() {
        //set Panel
        this.setPreferredSize(new Dimension(Main.WIDTH, Main.HEIGHT));
        this.setLayout(null);
        //add
        this.addMouseListener(this);
        //start timer
        timer = new Timer(1000, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        ImageIcon imgBg = new ImageIcon("src\\img_bg\\ToTheTop.png");
        g2d.drawImage(imgBg.getImage(), 0, 0, null);
        drawStartGame(g2d);

    }

    /**
     *
     * @param g2d - draw String that can change color
     */
    public void drawStartGame(Graphics2D g2d) {
        if (c) {
            g2d.setPaint(Color.BLACK);
            g2d.setFont(new Font("Tahoma", Font.BOLD, 22));
            g2d.drawString(">>> Click to Start Game <<<", 280, 285);
            c = false;
        } else {
            g2d.setPaint(Color.LIGHT_GRAY);
            g2d.setFont(new Font("Tahoma", Font.BOLD, 22));
            g2d.drawString(">>> Click to Start Game <<<", 282, 287);
            c = true;
        }
    }

    /**
     *
     * @param e - repaint when timer come
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        this.repaint();
    }

    /**
     *
     * @param e - when mouse click, this will start Game
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        Main.newGame();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
