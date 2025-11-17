package GUI;

import Person.Employee;

import javax.swing.*;
import java.awt.*;

public class AdminPanel extends JPanel {



    Employee loggedInEmployee;
    JLabel welcomeLabel = new JLabel("Welcome ");

    JPanel buttonPanel = new JPanel();
    JButton listAccounts = new JButton("List Accounts");
    JButton listCustomers = new JButton("List Customers");
    JButton createAccount = new JButton("Create Account");
    JButton createCustomer = new JButton("Create Customer");

    JButton logoutButton = new JButton("Logout");


    AdminPanel(JPanel previousPanel, Employee loggedInEmployee) {
        this.loggedInEmployee = loggedInEmployee;

        setLayout(new BorderLayout());
        welcomeLabel.setText("Welcome " + loggedInEmployee.getName());
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        add(welcomeLabel, BorderLayout.NORTH);

        buttonPanel.setLayout(new GridLayout(2,2));
        buttonPanel.add(listAccounts);
        buttonPanel.add(listCustomers);
        buttonPanel.add(createAccount);
        buttonPanel.add(createCustomer);
        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);

        add(logoutButton, BorderLayout.SOUTH);

    }

}
