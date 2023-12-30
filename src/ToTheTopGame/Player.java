/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToTheTopGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author Xvariable
 */
public class Player extends Character {

    private int key;
    // hero with key 1-3, hero and weapon with key 4-6.
    private ImageIcon[] img = {
        new ImageIcon("src\\img_character\\hero1.png"),
        new ImageIcon("src\\img_character\\hero2.png"),
        new ImageIcon("src\\img_character\\hero3.png"),
        new ImageIcon("src\\img_character\\heroWeapon1.png"),
        new ImageIcon("src\\img_character\\heroWeapon2.png"),
        new ImageIcon("src\\img_character\\heroWeapon3.png")
    };

    /**
     *
     * @param x
     * @param y
     * @param score
     * @param key
     */
    public Player(int x, int y, int score, int key) {
        super(x, y, score);
        this.key = key;

    }

    /**
     *
     * @param key
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
     * @return hitBox - override this method because don't want this hitBox
     * collision with multiple hitBox.
     */
    @Override
    public Rectangle getHitbox() {
        Rectangle hb = super.getHitbox();
        hb.setSize(30, 30);
        return hb;
    }

    /**
     *
     * @param g2d - draw player that use with paint method
     *
     */
    @Override
    public void drawCharacter(Graphics2D g2d) {
        g2d.drawImage(img[key].getImage(), this.getX(), this.getY(), null);
        g2d.setPaint(Color.RED);
        g2d.setFont(new Font("Tahoma", Font.BOLD, 10));
        g2d.drawString(this.getScore() + "", this.getX() + 20, this.getY() + 50);

    }

}
