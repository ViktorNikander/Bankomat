package GUI;

import Person.Employee;

import javax.swing.*;

public class AdminPanel extends JPanel {



    Employee loggedInEmployee;
    JLabel welcomeLabel = new JLabel("Welcome " + loggedInEmployee.getName());

    AdminPanel(JPanel previousPanel, Employee loggedInEmployee) {
        this.loggedInEmployee = loggedInEmployee;

        add(welcomeLabel);
        setVisible(true);


    }

}
