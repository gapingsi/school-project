package view;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private JButton jButtonA, jButtonS, jButtonM;


    public View(){

        JButton jButtonA = new JButton();
        jButtonA.setText("Register a student");
        jButtonA.setForeground(new Color(51,100,155));
        jButtonA.addActionListener(this);

        JButton jButtonS = new JButton();
        jButtonS.setText("Register an Exam");
        jButtonS.setForeground(new Color(51,100,155));
        jButtonS.addActionListener(this);

        JButton jButtonM = new JButton();
        jButtonM.setText("Register marks");
        jButtonM.setForeground(new Color(51,100,155));
        jButtonM.addActionListener(this);





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
        this.add(JPanelButton);
        this.setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(@org.jetbrains.annotations.NotNull ActionEvent e) {


            if (e.getSource() == jButtonA) {
                this.dispose();
                Form Studentform = new Form();
            }

            else if (e.getSource() == jButtonS) {
                this.dispose();
                Form Studentform1 = new Form();

            }
//            else if (e.getSource() == jButtonM) {
//                this.dispose();
//                Form Studentform2 = new Form();

            }




    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            new Form().setVisible(true);
//        });
//    }







