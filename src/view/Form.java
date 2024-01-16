package view;
import javax.swing.*;
import javax.swing.table.*;

import java.awt.*;
public class Form extends JFrame {

    public Form(){
        JPanel firstF = new JPanel();
        JLabel titleT = new JLabel("Fill the form to register a student");
        firstF.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
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
        String[] columnNames = new String[5];
        columnNames[0] = "NAME";
        columnNames[1] = "SEX";
        columnNames[2] = "Class";
        columnNames[3] = "DOB";
        columnNames[4] = "ACTION";


        String[][] data = new String[1][5];
        data[0][0] = "NAME";
        data[0][1] = "SEX";
        data[0][2] = "CLASS";
        data[0][3] = "DOB";



        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.add(table);

        table.setRowHeight(30);
        table.setTableHeader(new JTableHeader());
        table.setForeground(Color.BLUE);


        secondchild.add(table);
        secondchild.add(scrollPane);
        secondchild.setLayout(new GridLayout(2,1));

        secondF.setBackground(Color.cyan);
        secondF.add(firstchild);
        secondF.add(secondchild);
        secondF.setLayout(new GridLayout(1,2));

        this.pack();
        this.setLayout(new BorderLayout());
        this.add(firstF, BorderLayout.PAGE_START);
        this.add(secondF, BorderLayout.CENTER);
        this.setLocation(800,500);
        this.setSize(1000,400);
        this.setTitle("Registration Form");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    ////////////////////////////////////////////////
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Form().setVisible(true);
        });
    }
    ///////////////////////////////////////////////
}
