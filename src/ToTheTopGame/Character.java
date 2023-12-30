package ToTheTopGame;

import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author Xvariable
 */
public abstract class Character {

    private int x, y, startX, startY, score;
    protected static final int WIDTH = 50;
    protected static final int HEIGHT = 50;

    /**
     *
     * @param x
     * @param y
     * @param score
     */
    public Character(int x, int y, int score) {
        this.x = x;
        this.y = y;
        startX = x;
        startY = y;
        this.score = score;
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
     * @param score - set score
     */
    public void setScore(int score) {
        this.score = score;
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
     * @return started x
     */
    public int getStartX() {
        return startX;
    }

    /**
     *
     * @return started y
     */
    public int getStartY() {
        return startY;
    }

    /**
     *
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     *
     * @param c - clone x, y, score, startX and startY
     */
    public void clone(Character c) {
        x = c.getX();
        y = c.getY();
        score = c.getScore();
        startX = c.getStartX();
        startY = c.getStartY();
    }

    /**
     *
     * @return HitBox of this character
     */
    public Rectangle getHitbox() {
        Rectangle hb = new Rectangle(this.getX(), this.getY(), 50, 50);
        return hb;
    }

    /**
     *
     * @param g2d - draw character here
     */
    public abstract void drawCharacter(Graphics2D g2d);
}
