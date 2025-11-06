package GUI;

import javax.swing.*;
import java.awt.*;

public class CustormerOrAdminPanel extends JFrame {

    JLabel welcomeLabel = new JLabel("Welcome to the bank");
    JPanel buttonPanel = new JPanel();
    JButton customerButton = new JButton("Customer");
    JButton adminButton = new JButton("Admin");

    public CustormerOrAdminPanel() {
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new BorderLayout());
        buttonPanel.setLayout(new GridLayout(1,2));
        add(welcomeLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.add(customerButton);
        buttonPanel.add(adminButton);

        customerButton.addActionListener(e -> {
           CustomerPanel customerPanel = new CustomerPanel();
           setContentPane(customerPanel);
           revalidate();
           repaint();
        });

        adminButton.addActionListener(e -> {
//           setContentPane(n);
        });


    }

}
