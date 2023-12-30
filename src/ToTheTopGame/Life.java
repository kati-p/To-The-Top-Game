/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToTheTopGame;

import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Xvariable
 */
public class Life {

    private int x, startX, y;
    private ArrayList<ImageIcon> hp = new ArrayList<>();
    private ImageIcon heart = new ImageIcon("src\\img_character\\heart.png");

    /**
     *
     * @param x
     * @param y
     * @param numberLife
     */
    public Life(int x, int y, int numberLife) {
        this.x = x;
        startX = x;
        this.y = y;
        for (int i = 0; i < numberLife; i++) {
            hp.add(heart);
        }
    }

    /**
     *
     * @return number of hp
     */
    public int getHp() {
        return hp.size();
    }

    /**
     *
     * @return true if hp is not 0;
     */
    public boolean hasHp() {
        return !hp.isEmpty();
    }

    /**
     * hp - 1
     */
    public void loseHP() {
        if (!hp.isEmpty()) {
            hp.remove(0);
        }
    }

    /**
     *
     * @param g2d - draw hp that use with paint method
     *
     */
    public void drawLife(Graphics2D g2d) {
        x = startX;
        for (int i = 0; i < hp.size(); i++) {
            g2d.drawImage(hp.get(i).getImage(), x, y, 35, 35, null);
            x += 50;
        }
    }
}
