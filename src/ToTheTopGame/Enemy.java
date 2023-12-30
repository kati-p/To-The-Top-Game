/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToTheTopGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;

/**
 *
 * @author Xvariable
 */
public class Enemy extends Character {

    private int key;
    private boolean visible = true;

    // enemy with key 1-3, boss with key 4-6.
    private ImageIcon[] img = {
        new ImageIcon("src\\img_character\\enemy1.png"),
        new ImageIcon("src\\img_character\\enemy2.png"),
        new ImageIcon("src\\img_character\\enemy3.png"),
        new ImageIcon("src\\img_character\\boss1.png"),
        new ImageIcon("src\\img_character\\boss2.png"),
        new ImageIcon("src\\img_character\\boss3.png")
    };

    /**
     *
     * @param x
     * @param y
     * @param score
     * @param key
     */
    public Enemy(int x, int y, int score, int key) {
        super(x, y, score);
        this.key = key;
    }

    /**
     *
     * @param key - set key
     */
    public void setKey(int key) {
        this.key = key;
    }

    /**
     *
     * @return key
     */
    public int getKey() {
        return key;
    }

    // not used
    /**
     *
     * @param tf true if want to visible
     */
    public void setVisible(boolean tf) {
        visible = tf;
    }

    /**
     *
     * @param g2d - draw enemy that use with paint method
     */
    @Override
    public void drawCharacter(Graphics2D g2d) {
        if (visible) {
            g2d.drawImage(img[key].getImage(), this.getX(), this.getY(), null);
        }
        g2d.setPaint(Color.RED);
        g2d.setFont(new Font("Tahoma", Font.BOLD, 10));
        g2d.drawString(this.getScore() + "", this.getX() + 30, this.getY() + 50);
    }
}
