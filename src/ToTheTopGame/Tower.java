/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToTheTopGame;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Xvariable
 */
public class Tower {

    private ArrayList<Room> levels = new ArrayList<>();
    private ArrayList<Character> characters = new ArrayList<>();
    private int x, y, startX, startY, key, level;
    private boolean hasTower;

    /**
     *
     * @param x
     * @param y
     * @param key
     * @param level
     */
    public Tower(int x, int y, int key, int level) {
        this.x = x;
        startX = x;
        this.y = y;
        startY = y;
        this.key = key;
        this.level = level;
        hasTower = true;
        //create room
        for (int i = 0; i < level; i++) {
            Room room = new Room(this.x, this.y, key);
            levels.add(room);
            this.y -= 50;
        }
    }

    /**
     * - create enemies in all level
     */
    public void createEnemy() {
        y = startY;
        for (int i = 0; i < level; i++) {
            Enemy en = new Enemy(x, y, 0, key);
            characters.add(en);
            this.y -= 50;
        }
    }

    /**
     *
     * @return level
     */
    public int getLevel() {
        return level;
    }

    /**
     *
     * @return levels
     */
    public ArrayList<Room> getLevels() {
        return levels;
    }

    /**
     *
     * @return ArrayList character
     */
    public ArrayList<Character> getCharacters() {
        return characters;
    }

    /**
     *
     * @return true if tower has been
     */
    public boolean hasTower() {
        return hasTower;
    }

    /**
     * - remove tower
     */
    public void removeTower() {
        hasTower = false;
        levels.removeAll(levels);
        characters.removeAll(characters);
    }

    /**
     * - fall tower that use with Timer class. when it out of bound, remove that
     * level. And if all levels has gone, it will not to have tower.
     */
    public void fallTower() {
        for (int i = 0; i < levels.size(); i++) {
            levels.get(i).setY(levels.get(i).getY() + 10);
            if (levels.get(i).getY() > 480) {
                levels.remove(i);
            }
        }
        if (levels.isEmpty()) {
            hasTower = false;
        }
    }

    /**
     * - set all characters in tower to set started x
     */
    public void setStartXAllCharacter() {
        for (int i = 0; i < characters.size(); i++) {
            characters.get(i).setX(startX);
        }
    }

    /**
     * - shuffle all characters in tower with Random class
     */
    public void shuffleCharacter() {
        Random rnd = new Random();

        for (int i = 0; i < level; i++) {
            int rndIndex = rnd.nextInt(level);
            int temp1 = characters.get(i).getY();
            int temp2 = characters.get(rndIndex).getY();
            characters.get(i).setY(temp2);
            characters.get(rndIndex).setY(temp1);
            Character ch1 = characters.get(i);
            Character ch2 = characters.get(rndIndex);
            characters.set(i, ch2);
            characters.set(rndIndex, ch1);

        }
    }

    /**
     * - shuffle characters to bound in tower with Random class
     *
     * @param bound
     */
    public void shuffleCharacter(int bound) {
        Random rnd = new Random();

        for (int i = 0; i < bound; i++) {
            int rndIndex = rnd.nextInt(bound);
            int temp1 = characters.get(i).getY();
            int temp2 = characters.get(rndIndex).getY();
            characters.get(i).setY(temp2);
            characters.get(rndIndex).setY(temp1);
            Character ch1 = characters.get(i);
            Character ch2 = characters.get(rndIndex);
            characters.set(i, ch2);
            characters.set(rndIndex, ch1);

        }
    }

    /**
     *
     * @param g2d - draw tower that use with paint method
     */
    public void drawTower(Graphics2D g2d) {
        for (int i = 0; i < levels.size(); i++) {
            levels.get(i).drawRoom(g2d);
        }
        for (int i = 0; i < characters.size(); i++) {
            characters.get(i).drawCharacter(g2d);
        }
    }
}
