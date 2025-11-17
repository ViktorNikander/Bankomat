package GUI;

import Person.Employee;

import javax.swing.*;
import java.awt.*;

public class AdminLoginPanel extends JPanel {

    JLabel adminPanelLabel =  new JLabel("Admin Panel");

    JPanel loginCredentialsPanel = new JPanel();
    JLabel employeeIdLabel = new JLabel("Person.Employee ID: ");
    JTextField employeeIDTextField = new JTextField(12);

    JPanel buttonPanel = new JPanel();
    JButton loginButton = new JButton("Login");
    JButton backButton = new JButton("Back");
    JPanel previousPanel;
    Employee loggedInEmployee;

    public AdminLoginPanel(JPanel previousPanel) {
    this.previousPanel = previousPanel;
        setLayout(new GridLayout(3,1));
        adminPanelLabel.setHorizontalAlignment(JLabel.CENTER);
        add(adminPanelLabel);

        loginCredentialsPanel.setLayout(new GridLayout(1,2));
        add(loginCredentialsPanel);
        loginCredentialsPanel.add(employeeIdLabel);
        loginCredentialsPanel.add(employeeIDTextField);

        buttonPanel.setLayout(new GridLayout(1,2));
        add(buttonPanel);
        buttonPanel.add(loginButton);
        buttonPanel.add(backButton);

        loginButton.addActionListener(e -> {
            loggedInEmployee = loggedInEmployee.findEmployeeBasedOnSocialSecurityNumber(employeeIDTextField.getText());
            //for test purposes
            if(inputEmployeeID.equals("admin")){
                new AdminPanel(this,loggedInEmployee);
            }
        });

        backButton.addActionListener(e -> {
            JFrame frame = (JFrame) SwingUtilities.windowForComponent(this);
            frame.setContentPane(previousPanel);
            frame.revalidate();
            frame.repaint();
        });

    }


}

