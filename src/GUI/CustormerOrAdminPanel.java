package GUI;

import javax.swing.*;
import java.awt.*;

public class CustormerOrAdminPanel extends JFrame {

    JLabel welcomeLabel = new JLabel("Welcome to the bank");
    JPanel buttonPanel = new JPanel();
    JButton customerButton = new JButton("Customer");
    JButton adminButton = new JButton("Admin");

    CustormerOrAdminPanel() {
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(new BorderLayout());
        add(welcomeLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.add(customerButton);
        buttonPanel.add(adminButton);

        customerButton.addActionListener(e -> {
//           setContentPane(customerPanel);
        });

        adminButton.addActionListener(e -> {
//           setContentPane(adminPanel);
        });


    }

}
