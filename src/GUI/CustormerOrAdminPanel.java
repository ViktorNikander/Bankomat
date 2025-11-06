package GUI;

import javax.swing.*;
import java.awt.*;

public class CustormerOrAdminPanel extends JFrame {

    JPanel mainPanel = new JPanel();
    JPanel adminPanel = new JPanel();
    JLabel welcomeLabel = new JLabel("Welcome to the bank");
    JPanel buttonPanel = new JPanel();
    JButton customerButton = new JButton("Customer");
    JButton adminButton = new JButton("Admin");

    public CustormerOrAdminPanel() {
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        mainPanel.setLayout(new GridLayout(3, 1));

        add(mainPanel);
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(welcomeLabel);


        mainPanel.add(adminPanel);
        mainPanel.add(buttonPanel);
        buttonPanel.setLayout(new GridLayout(1, 2));
        buttonPanel.add(customerButton);
        buttonPanel.add(adminButton);

        customerButton.addActionListener(e -> {
            CustomerPanel customerPanel = new CustomerPanel();
            setContentPane(customerPanel);
            revalidate();
            repaint();
        });

        adminButton.addActionListener(e -> {
            AdminPanel adminPanel = new AdminPanel(mainPanel);
            setContentPane(adminPanel);
            revalidate();
            repaint();
        });


    }

}
