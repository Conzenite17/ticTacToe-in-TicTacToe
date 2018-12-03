package cjrobbertse.java;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Tic Tac Toe in Tic Tac Toe Game!");
        JFrame frame = new JFrame("Tic Tac Toe in Tic Tac Toe Game");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        panel.setLayout(null);


        JLabel lblTurn = new JLabel("X's Turn");
        JButton button1 = new JButton("Button1");
        panel.add(button1);

        frame.add(panel);




        frame.setVisible(true);
    }
}
