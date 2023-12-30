/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ToTheTopGame;

import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Xvariable
 */
public class Main {

    private static JFrame frame;
    public static final int WIDTH = 720;
    public static final int HEIGHT = 480;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crate frame
        frame = new JFrame();
        ImageIcon icon = new ImageIcon("src\\img_bg\\flagIcon.jpg");
        frame.setTitle("To the Top");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setIconImage(icon.getImage());
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        //new home
        frame.add(new Home());

        //set visible
        frame.setVisible(true);

        //open bgm
        try {
            new BGM();
        } catch (UnsupportedAudioFileException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * start new Game
     */
    public static void newGame() {
        frame.getContentPane().removeAll();
        frame.add(new Game());
        frame.repaint();
        frame.setVisible(true);
    }

    /**
     * go to ResultPage with "You Lose"
     */
    public static void loseGame() {
        frame.getContentPane().removeAll();
        frame.add(new ResultPage("You Lose"));
        frame.repaint();
        frame.setVisible(true);
    }

    /**
     * go to ResultPage with "You Win"
     */
    public static void winGame() {
        frame.getContentPane().removeAll();
        frame.add(new ResultPage("You Win"));
        frame.repaint();
        frame.setVisible(true);
    }

    /**
     * back to home
     */
    public static void backHome() {
        frame.getContentPane().removeAll();
        frame.add(new Home());
        frame.repaint();
        frame.setVisible(true);
    }

}
