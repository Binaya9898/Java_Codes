// import javax.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;

public class SwingForm extends JFrame{
        public SwingForm(){
            setSize(300,400);
            setLayout(new FlowLayout());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel namelabel=new JLabel("Name");
            JTextField Jtext=new JTextField(20);
            JLabel gradeLabel=new JLabel("Grade");
            JTextField Jgradetext=new JTextField(20);
            JLabel gradeContact=new JLabel("Contact");
            JTextField Jcontacttext=new JTextField(20);
            JButton btn=new JButton("Submit");

            add(namelabel);
            add(Jtext);
            add(gradeLabel);
            add(Jgradetext);
            add(gradeContact);
            add(Jcontacttext);
            add(btn);


            setVisible(true);
        }
        public static void main(String[] args) {
            new SwingForm();
        }
}