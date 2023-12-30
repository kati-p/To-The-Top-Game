/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ToTheTopGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

/**
 *
 * @author Xvariable
 */
public class ResultPage extends JPanel implements ActionListener {

    private String result;
    private JButton restart;
    private JButton home;

    /**
     *
     * @param result - String that will show in this JPanel
     */
    public ResultPage(String result) {
        this.result = result;
        //set panel
        this.setLayout(null);
        this.setBounds(0, 0, Main.WIDTH, Main.WIDTH);
        if (result.equals("You Win")) {
            this.setBackground(Color.CYAN);
        } else {
            this.setBackground(Color.YELLOW);
        }
        this.setOpaque(true);

        //String result
        JLabel text = new JLabel();
        text.setBounds(250, 150, 500, 50);
        text.setFont(new Font("Tahoma", Font.BOLD, 40));
        text.setText(result);
        this.add(text);

        //button new Game
        restart = new JButton();
        restart.setBounds(240, 250, 200, 75);
        restart.addActionListener(this);
        restart.setFont(new Font("Tahoma", Font.BOLD, 24));
        restart.setBackground(Color.LIGHT_GRAY);
        restart.setBorder(BorderFactory.createEtchedBorder());
        restart.setText("Try Again");
        this.add(restart);

        //button back Home
        home = new JButton();
        home.setBounds(630, 10, 50, 50);
        home.addActionListener(this);
        home.setIcon(new ImageIcon("src\\img_bg\\home.png"));
        home.setBackground(Color.WHITE);
        home.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        this.add(home);

    }

    /**
     *
     * @param e - restart game or back home
     *
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == restart) {
            Main.newGame();
        }
        if (e.getSource() == home) {
            Main.backHome();
        }
    }
}
