package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class View extends JFrame implements ActionListener {


    JButton JbtnA, JbtnS, JbtnM;
    public View() {

        JbtnA = new JButton();
        JbtnA.setText("Register a Student");
        JbtnA.setForeground(new Color(52, 100, 155));
        JbtnA.addActionListener(this);

        JbtnS = new JButton();
        JbtnS.setText("Register an Exam");
        JbtnS.setForeground(new Color(52, 100, 155));
        JbtnS.addActionListener(this);

        JbtnM = new JButton();
        JbtnM.setText("Register Marks");
        JbtnM.setForeground(new Color(52, 100, 155));
        JbtnM.addActionListener(this);


        JPanel JPanelButton = new JPanel();
        JPanelButton.setLayout(new GridLayout(3, 1, 10, 10));
        JPanelButton.add(JbtnA);
        JPanelButton.add(JbtnS);
        JPanelButton.add(JbtnM);
        JPanelButton.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));



        this.setSize(500, 300);
        this.setTitle("School App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1, 1));
        this.add(JPanelButton);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.blue);
    }


    /**INVOKE ACTION WHEN IT OCCURS*/


    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == JbtnA) {
            this.dispose();
            Form Studentform = new Form();
        }
        else
        { this.dispose();
          View homeview = new View();
        }

    }}
