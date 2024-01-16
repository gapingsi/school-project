package view;
import javax.swing.*;
import javax.swing.table.*;
import  java.awt.GridBagConstraints;
import  java.awt.GridBagLayout;

import java.awt.*;
public class Form extends JFrame {


    public Form(){

        GridBagConstraints gbc = new GridBagConstraints();

        JPanel firstF = new JPanel();
        gbc.gridx = 1;
        gbc.gridy = 1;
//        gbc.gridheight = 9;
        JLabel titleT = new JLabel("fill the form to register a student");
//        firstF.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        titleT.setFont(new Font("sanserif", Font.BOLD, 13));
        firstF.add(titleT);


///////////////////////////////////////////// end of first container
///////////////////////////////////////////// end of first container
///////////////////////////////////////////// end of first container


        JPanel secondF = new JPanel();
        JPanel firstchild = new JPanel();
        firstchild.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 10));

        JPanel firstchild1 = new JPanel();
        firstchild1.setLayout(new GridLayout(1,2,2,2));
        JLabel Fname = new JLabel("First Name");
        JTextField FIname = new JTextField();
        firstchild1.add(Fname);
        firstchild1.add(FIname);


        JPanel firstchild2 = new JPanel();
        firstchild2.setLayout(new GridLayout(1,2,2,2));
        JLabel Sname = new JLabel("last Name");
        JTextField SIname = new JTextField();
        firstchild2.add(Sname);
        firstchild2.add(SIname);

        JPanel firstchild3 = new JPanel();
        firstchild3.setLayout(new GridLayout(1,3,2,2));
        JLabel sex = new JLabel("Sex");
        JRadioButton Fsex = new JRadioButton("F");
        JRadioButton Msex = new JRadioButton("M");
        firstchild3.add(sex);
        firstchild3.add(Fsex);
        firstchild3.add(Msex);

        JPanel firstchild4 = new JPanel();
        firstchild4.setLayout(new GridLayout(1,2,2,2));
        JLabel classF = new JLabel("Class");

        JComboBox<String> classB = new JComboBox<>();
        String[] items = {"Item 1", "Item 2", "Item 3"};
        classB.addItem("Choose a class");  // Optional default item
        for (String item : items) {
            classB.addItem(item);
        }

        firstchild4.add(classF);
        firstchild4.add(classB);

        JPanel firstchild5 = new JPanel();
        firstchild5.setLayout(new GridLayout(1,2,2,2));
        JLabel dob = new JLabel("DOB");
        JTextField Tdob = new JTextField();
        firstchild5.add(dob);
        firstchild5.add(Tdob);



        JPanel firstchild6 = new JPanel();
        firstchild6.setLayout(new GridLayout(1,2,2,2));
        JButton cancel = new JButton("Cancel");
        cancel.setForeground(new Color(51,50,155));

        JButton submit = new JButton("Submit");
        submit.setForeground(new Color(51,50,155));
        firstchild6.add(cancel);
        firstchild6.add(submit);

        firstchild.add(firstchild1);
        firstchild.add(firstchild2);
        firstchild.add(firstchild5);
        firstchild.add(firstchild4);
        firstchild.add(firstchild3);
        firstchild.add(firstchild6);
        firstchild.setLayout(new GridLayout(6,1));

        JPanel secondchild = new JPanel();
        secondchild.setBackground(Color.green);





        secondF.setBackground(Color.cyan);
        gbc.gridy = 1;
//        gbc.gridheight = 4;
        secondF.add(firstchild);
        secondF.add(secondchild);
        secondF.setLayout(new GridLayout(1,2));

        JPanel mainbox = new JPanel();
        mainbox.setLayout(new GridBagLayout());
        mainbox.add(firstF,gbc);
        mainbox.add(secondF,gbc);

        this.add(mainbox);
        this.setLocation(800,500);
        this.setSize(500,300);
        this.setTitle("Registration Form");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1,1));





    }
}
