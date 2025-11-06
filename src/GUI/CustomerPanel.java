package GUI;

import javax.swing.*;
import java.awt.*;

public class CustomerPanel extends JPanel {

    JLabel welcomeLabel = new  JLabel("Welcome to the bank, please login.");

    JPanel personalNumberPanel = new JPanel();
    JLabel personalNumberLabel = new JLabel("Enter your personal number:");
    JTextField personalNumberTextField = new JTextField(12);

    JPanel buttonPanel = new JPanel();
    JButton loginButton = new JButton("Login");
    JButton backButton = new JButton("Back");

    CustomerPanel() {

        setLayout(new GridLayout(3,1));

        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        add(welcomeLabel);

        personalNumberPanel.setLayout(new GridLayout(1,2));
        add(personalNumberPanel);
        personalNumberPanel.add(personalNumberLabel);
        personalNumberPanel.add(personalNumberTextField);

        buttonPanel.setLayout(new GridLayout(1,2));
        add(buttonPanel);
        buttonPanel.add(loginButton);
        buttonPanel.add(backButton);

    }
}
