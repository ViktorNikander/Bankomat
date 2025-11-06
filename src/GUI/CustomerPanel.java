package GUI;

import javax.swing.*;
import java.awt.*;

public class CustomerPanel extends JPanel {

    JLabel welcomeLabel = new  JLabel("Welcome to the bank, please login.");

    JPanel personalNumberPanel = new JPanel();
    JLabel personalNumberLabel = new JLabel("Enter your personal number:");
    JTextField personalNumberTextField = new JTextField(12);

    CustomerPanel() {
        setLayout(new BorderLayout());
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        add(welcomeLabel, BorderLayout.NORTH);
        add(personalNumberPanel, BorderLayout.CENTER);
        personalNumberPanel.add(personalNumberLabel);
        personalNumberPanel.add(personalNumberTextField);
    }
}
