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
public class Weapon extends Character {

    private int key;
    private ImageIcon[] img = {
        new ImageIcon("src\\img_character\\weapon1.png"),
        new ImageIcon("src\\img_character\\weapon2.png"),
        new ImageIcon("src\\img_character\\weapon3.png")
    };

    /**
     *
     * @param x
     * @param y
     * @param score
     * @param key
     */
    public Weapon(int x, int y, int score, int key) {
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

    /**
     *
     * @param g2d - draw character that use with paint method
     */
    @Override
    public void drawCharacter(Graphics2D g2d) {
        g2d.drawImage(img[key].getImage(), this.getX(), this.getY(), null);
        g2d.setPaint(Color.RED);
        g2d.setFont(new Font("Tahoma", Font.BOLD, 10));
        g2d.drawString(this.getScore() + "", this.getX() + 20, this.getY() + 50);
    }
}
