/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToTheTopGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;

/**
 *
 * @author Xvariable
 */
public class Room {

    private int x, y, key;
    private ImageIcon[] img = {
        new ImageIcon("src\\img_bg\\room1.png"),
        new ImageIcon("src\\img_bg\\room2.png"),
        new ImageIcon("src\\img_bg\\room3.png")
    };

    /**
     * - no parameter to set all 0
     */
    public Room() {
        x = 0;
        y = 0;
        key = 0;
    }

    /**
     *
     * @param x
     * @param y
     * @param key
     */
    public Room(int x, int y, int key) {
        this.x = x;
        this.y = y;
        this.key = key;
    }

    /**
     *
     * @param x - set x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @param y - set y
     */
    public void setY(int y) {
        this.y = y;
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
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @return y
     */
    public int getY() {
        return y;
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
     * @param r - clone x, y and key
     */
    public void clone(Room r) {
        x = r.getX();
        y = r.getY();
        key = r.getKey();
    }

    /**
     *
     * @param g2d - draw room that use with paint method
     *
     */
    public void drawRoom(Graphics2D g2d) {
        g2d.drawImage(img[key].getImage(), x, y, null);
        g2d.setPaint(Color.WHITE);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawRect(x, y, 50, 50);
    }
}
