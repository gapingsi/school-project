package view;
import javax.swing.*;
import java.awt.*;
public class View extends JFrame {

    public View(){

        JButton jButtonA = new JButton();
        jButtonA.setText("Register a student");
        jButtonA.setForeground(new Color(51,100,155));

        JButton jButtonS = new JButton();
        jButtonS.setText("Register an Exam");
        jButtonS.setForeground(new Color(51,100,155));

        JButton jButtonM = new JButton();
        jButtonM.setText("Register marks");
        jButtonM.setForeground(new Color(51,100,155));

        JPanel JPanelButton = new JPanel();
        JPanelButton.setLayout(new GridLayout(3,1, 10,10));
        JPanelButton.add(jButtonA);
        JPanelButton.add(jButtonS);
        JPanelButton.add(jButtonM);
        JPanelButton.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));


        this.setLocation(500,300);
        this.setSize(500,300);
        this.setTitle("School App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1,1 ));
        this.setBackground(Color.blue);
        this.add(JPanelButton);
    }
}


