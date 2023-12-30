/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToTheTopGame;

import java.awt.Graphics2D;
import javax.swing.ImageIcon;

/**
 *
 * @author Xvariable
 */
public class Animation {

    // Hero win Enemy with key1
    private ImageIcon[] HvsE_key1 = {
        new ImageIcon("src\\img_animation\\HvsE1_an1.png"),
        new ImageIcon("src\\img_animation\\HvsE1_an2.png"),
        new ImageIcon("src\\img_animation\\HvsE1_an3.png"),
        new ImageIcon("src\\img_animation\\HvsE1_an4.png"),
        new ImageIcon("src\\img_animation\\HvsE1_an5.png"),
        new ImageIcon("src\\img_animation\\HvsE1_an6.png"),
        new ImageIcon("src\\img_animation\\HvsE1_an7.png"),
        new ImageIcon("src\\img_animation\\HvsE1_an8.png"),
        new ImageIcon("src\\img_animation\\HvsE1_an9.png"),
        new ImageIcon("src\\img_animation\\HvsE1_an10.png")
    };

    // Enemy win Hero with key1
    private ImageIcon[] EvsH_key1 = {
        new ImageIcon("src\\img_animation\\EvsH1_an1.png"),
        new ImageIcon("src\\img_animation\\EvsH1_an2.png"),
        new ImageIcon("src\\img_animation\\EvsH1_an3.png"),
        new ImageIcon("src\\img_animation\\EvsH1_an4.png"),
        new ImageIcon("src\\img_animation\\EvsH1_an5.png"),
        new ImageIcon("src\\img_animation\\EvsH1_an6.png"),
        new ImageIcon("src\\img_animation\\EvsH1_an7.png"),
        new ImageIcon("src\\img_animation\\EvsH1_an8.png"),
        new ImageIcon("src\\img_animation\\EvsH1_an9.png"),
        new ImageIcon("src\\img_animation\\EvsH1_an10.png")
    };

    // Hero win Boss with key1
    private ImageIcon[] HvsB_key1 = {
        new ImageIcon("src\\img_animation\\HvsB1_an1.png"),
        new ImageIcon("src\\img_animation\\HvsB1_an2.png"),
        new ImageIcon("src\\img_animation\\HvsB1_an3.png"),
        new ImageIcon("src\\img_animation\\HvsB1_an4.png"),
        new ImageIcon("src\\img_animation\\HvsB1_an5.png"),
        new ImageIcon("src\\img_animation\\HvsB1_an6.png"),
        new ImageIcon("src\\img_animation\\HvsB1_an7.png"),
        new ImageIcon("src\\img_animation\\HvsB1_an8.png"),
        new ImageIcon("src\\img_animation\\HvsB1_an9.png"),
        new ImageIcon("src\\img_animation\\HvsB1_an10.png")
    };

    // Boss win Hero with key1
    private ImageIcon[] BvsH_key1 = {
        new ImageIcon("src\\img_animation\\BvsH1_an1.png"),
        new ImageIcon("src\\img_animation\\BvsH1_an2.png"),
        new ImageIcon("src\\img_animation\\BvsH1_an3.png"),
        new ImageIcon("src\\img_animation\\BvsH1_an4.png"),
        new ImageIcon("src\\img_animation\\BvsH1_an5.png"),
        new ImageIcon("src\\img_animation\\BvsH1_an6.png"),
        new ImageIcon("src\\img_animation\\BvsH1_an7.png"),
        new ImageIcon("src\\img_animation\\BvsH1_an8.png"),
        new ImageIcon("src\\img_animation\\BvsH1_an9.png"),
        new ImageIcon("src\\img_animation\\BvsH1_an10.png")
    };

    // Hero win Enemy with key2
    private ImageIcon[] HvsE_key2 = {
        new ImageIcon("src\\img_animation\\HvsE2_ani1.png"),
        new ImageIcon("src\\img_animation\\HvsE2_ani2.png"),
        new ImageIcon("src\\img_animation\\HvsE2_ani3.png"),
        new ImageIcon("src\\img_animation\\HvsE2_ani4.png"),
        new ImageIcon("src\\img_animation\\HvsE2_ani5.png"),
        new ImageIcon("src\\img_animation\\HvsE2_ani6.png"),
        new ImageIcon("src\\img_animation\\HvsE2_ani7.png"),
        new ImageIcon("src\\img_animation\\HvsE2_ani8.png"),
        new ImageIcon("src\\img_animation\\HvsE2_ani9.png"),
        new ImageIcon("src\\img_animation\\HvsE2_ani10.png")
    };

    // Enemy win Hero with key2
    private ImageIcon[] EvsH_key2 = {
        new ImageIcon("src\\img_animation\\EvsH2_ani1.png"),
        new ImageIcon("src\\img_animation\\EvsH2_ani2.png"),
        new ImageIcon("src\\img_animation\\EvsH2_ani3.png"),
        new ImageIcon("src\\img_animation\\EvsH2_ani4.png"),
        new ImageIcon("src\\img_animation\\EvsH2_ani5.png"),
        new ImageIcon("src\\img_animation\\EvsH2_ani6.png"),
        new ImageIcon("src\\img_animation\\EvsH2_ani7.png"),
        new ImageIcon("src\\img_animation\\EvsH2_ani8.png"),
        new ImageIcon("src\\img_animation\\EvsH2_ani9.png"),
        new ImageIcon("src\\img_animation\\EvsH2_ani10.png")
    };

    // Hero win Boss with key2
    private ImageIcon[] HvsB_key2 = {
        new ImageIcon("src\\img_animation\\HvsB2_ani1.png"),
        new ImageIcon("src\\img_animation\\HvsB2_ani2.png"),
        new ImageIcon("src\\img_animation\\HvsB2_ani3.png"),
        new ImageIcon("src\\img_animation\\HvsB2_ani4.png"),
        new ImageIcon("src\\img_animation\\HvsB2_ani5.png"),
        new ImageIcon("src\\img_animation\\HvsB2_ani6.png"),
        new ImageIcon("src\\img_animation\\HvsB2_ani7.png"),
        new ImageIcon("src\\img_animation\\HvsB2_ani8.png"),
        new ImageIcon("src\\img_animation\\HvsB2_ani9.png"),
        new ImageIcon("src\\img_animation\\HvsB2_ani10.png")
    };

    // Boss win Hero with key2
    private ImageIcon[] BvsH_key2 = {
        new ImageIcon("src\\img_animation\\BvsH2_ani1.png"),
        new ImageIcon("src\\img_animation\\BvsH2_ani2.png"),
        new ImageIcon("src\\img_animation\\BvsH2_ani3.png"),
        new ImageIcon("src\\img_animation\\BvsH2_ani4.png"),
        new ImageIcon("src\\img_animation\\BvsH2_ani5.png"),
        new ImageIcon("src\\img_animation\\BvsH2_ani6.png"),
        new ImageIcon("src\\img_animation\\BvsH2_ani7.png"),
        new ImageIcon("src\\img_animation\\BvsH2_ani8.png"),
        new ImageIcon("src\\img_animation\\BvsH2_ani9.png"),
        new ImageIcon("src\\img_animation\\BvsH2_ani10.png")
    };

    // Hero win Enemy with key3
    private ImageIcon[] HvsE_key3 = {
        new ImageIcon("src\\img_animation\\HvsE3_an1.png"),
        new ImageIcon("src\\img_animation\\HvsE3_an2.png"),
        new ImageIcon("src\\img_animation\\HvsE3_an3.png"),
        new ImageIcon("src\\img_animation\\HvsE3_an4.png"),
        new ImageIcon("src\\img_animation\\HvsE3_an5.png"),
        new ImageIcon("src\\img_animation\\HvsE3_an6.png"),
        new ImageIcon("src\\img_animation\\HvsE3_an7.png"),
        new ImageIcon("src\\img_animation\\HvsE3_an8.png"),
        new ImageIcon("src\\img_animation\\HvsE3_an9.png"),
        new ImageIcon("src\\img_animation\\HvsE3_an10.png")
    };

    // Enemy win Hero with key3
    private ImageIcon[] EvsH_key3 = {
        new ImageIcon("src\\img_animation\\EvsH3_an1.png"),
        new ImageIcon("src\\img_animation\\EvsH3_an2.png"),
        new ImageIcon("src\\img_animation\\EvsH3_an3.png"),
        new ImageIcon("src\\img_animation\\EvsH3_an4.png"),
        new ImageIcon("src\\img_animation\\EvsH3_an5.png"),
        new ImageIcon("src\\img_animation\\EvsH3_an6.png"),
        new ImageIcon("src\\img_animation\\EvsH3_an7.png"),
        new ImageIcon("src\\img_animation\\EvsH3_an8.png"),
        new ImageIcon("src\\img_animation\\EvsH3_an9.png"),
        new ImageIcon("src\\img_animation\\EvsH3_an10.png")
    };

    // Hero win Boss with key3
    private ImageIcon[] HvsB_key3 = {
        new ImageIcon("src\\img_animation\\HvsB3_an1.png"),
        new ImageIcon("src\\img_animation\\HvsB3_an2.png"),
        new ImageIcon("src\\img_animation\\HvsB3_an3.png"),
        new ImageIcon("src\\img_animation\\HvsB3_an4.png"),
        new ImageIcon("src\\img_animation\\HvsB3_an5.png"),
        new ImageIcon("src\\img_animation\\HvsB3_an6.png"),
        new ImageIcon("src\\img_animation\\HvsB3_an7.png"),
        new ImageIcon("src\\img_animation\\HvsB3_an8.png"),
        new ImageIcon("src\\img_animation\\HvsB3_an9.png"),
        new ImageIcon("src\\img_animation\\HvsB3_an10.png")
    };

    // Boss win Hero with key3
    private ImageIcon[] BvsH_key3 = {
        new ImageIcon("src\\img_animation\\BvsH3_an1.png"),
        new ImageIcon("src\\img_animation\\BvsH3_an2.png"),
        new ImageIcon("src\\img_animation\\BvsH3_an3.png"),
        new ImageIcon("src\\img_animation\\BvsH3_an4.png"),
        new ImageIcon("src\\img_animation\\BvsH3_an5.png"),
        new ImageIcon("src\\img_animation\\BvsH3_an6.png"),
        new ImageIcon("src\\img_animation\\BvsH3_an7.png"),
        new ImageIcon("src\\img_animation\\BvsH3_an8.png"),
        new ImageIcon("src\\img_animation\\BvsH3_an9.png"),
        new ImageIcon("src\\img_animation\\BvsH3_an10.png")
    };

    private int x, y, key, index;
    private String key_animation;
    private boolean animating;

    /**
     * no parameter set animating to false
     */
    public Animation() {
        animating = false;
    }

    /**
     *
     * @param x
     * @param y
     * @param vs - key that you want to play which animations are "HvsE",
     * "EvsH", "HvsB", and "BvsH"
     * @param key
     *
     * - play animation, set animating to true. set index to 0.
     */
    public void startAnimation(int x, int y, String vs, int key) {
        this.x = x;
        this.y = y;
        this.key = key + 1;
        key_animation = vs + this.key;
        index = 0;
        animating = true;
    }

    /**
     *
     * @return true if it has started animation
     */
    public boolean isAnimating() {
        return animating;
    }

    /**
     * - change index of animation that use with Timer class
     *
     */
    public void changeAnimation() {
        index++;
        if (index == 9) {
            animating = false;
        }
    }

    /**
     *
     * @param g2d - draw animation that use with paint method
     *
     */
    public void drawAnimation(Graphics2D g2d) {
        switch (key_animation) {
            case "HvsE1":
                g2d.drawImage(HvsE_key1[index].getImage(), x, y, null);
                break;
            case "EvsH1":
                g2d.drawImage(EvsH_key1[index].getImage(), x, y, null);
                break;
            case "HvsB1":
                g2d.drawImage(HvsB_key1[index].getImage(), x, y, null);
                break;
            case "BvsH1":
                g2d.drawImage(BvsH_key1[index].getImage(), x, y, null);
                break;
            case "HvsE2":
                g2d.drawImage(HvsE_key2[index].getImage(), x, y, null);
                break;
            case "EvsH2":
                g2d.drawImage(EvsH_key2[index].getImage(), x, y, null);
                break;
            case "HvsB2":
                g2d.drawImage(HvsB_key2[index].getImage(), x, y, null);
                break;
            case "BvsH2":
                g2d.drawImage(BvsH_key2[index].getImage(), x, y, null);
                break;
            case "HvsE3":
                g2d.drawImage(HvsE_key3[index].getImage(), x, y, null);
                break;
            case "EvsH3":
                g2d.drawImage(EvsH_key3[index].getImage(), x, y, null);
                break;
            case "HvsB3":
                g2d.drawImage(HvsB_key3[index].getImage(), x, y, null);
                break;
            case "BvsH3":
                g2d.drawImage(BvsH_key3[index].getImage(), x, y, null);
                break;
            default:
                break;
        }

    }
}
