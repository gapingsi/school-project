package view;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.*;

import java.awt.*;
public class Form {
     JFrame frame = new JFrame();
    public Form(){
        JPanel firstF = new JPanel();
        JLabel titleT = new JLabel("Fill the form to register a student");
        firstF.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        titleT.setFont(new Font("sanserif", Font.BOLD, 13));
        firstF.add(titleT);

        ///////////////////////////////////////////// end of first container
        ///////////////////////////////////////////// end of first container
        ///////////////////////////////////////////// end of first container

        JPanel secondF = new JPanel();
        JPanel firstchild = new JPanel();
        firstchild.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 5));

        JPanel firstchild1 = new JPanel();
        firstchild1.setLayout(new GridLayout(1,2,2,2));
        JLabel Fname = new JLabel("First Name");
        JTextField FIname = new JTextField();
        firstchild1.add(Fname);
        firstchild1.add(FIname);

        JPanel firstchild2 = new JPanel();
        firstchild2.setLayout(new GridLayout(1,2,2,2));
        JLabel Sname = new JLabel("Last Name");
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
        String[][] data = {
                { "", "", "","","" }, { "", "", "", "", "" }, { "", "", "", "", "" }, { "", "", "", "", "" }, { "", "", "", "", "" }, { "", "", "", "", "" }, { "", "", "", "", "" }, { "", "", "", "", "" }, { "", "", "", "", "" }, { "", "", "", "", "" }, { "", "", "", "", "" }, { "", "", "", "", "" },
        };
        String[] columnNames = { "NAME", "SEX", "CLASS" ," DOB", " ACTION" };
        JTable table = new JTable(data, columnNames);




        JScrollPane sp = new JScrollPane(table);



        secondchild.add(sp);






        secondF.setBackground(Color.cyan);
        secondF.add(firstchild);
        secondF.add(secondchild);
        secondF.setLayout(new GridLayout(1,2));

        frame.pack();
        frame.setLayout(new BorderLayout());
        frame.add(firstF, BorderLayout.PAGE_START);
        frame.add(secondF, BorderLayout.CENTER);
        frame.setLocation(800,500);
        frame.setSize(1000,300);
        frame.setTitle("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    ////////////////////////////////////////////////
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            new Form().setVisible(true);
//        });
//    }
//    ///////////////////////////////////////////////
}
