package GUI;

import Person.Employee;

import javax.swing.*;

public class AdminPanel extends JPanel {



    Employee loggedInEmployee;
    JLabel welcomeLabel = new JLabel("Welcome ");

    AdminPanel(JPanel previousPanel, Employee loggedInEmployee) {
        this.loggedInEmployee = loggedInEmployee;

        welcomeLabel.setText("Welcome " + loggedInEmployee.getName());
        add(welcomeLabel);
        setVisible(true);


    }

}
