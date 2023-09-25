import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Registration extends JFrame implements ActionListener
{
JFrame f= new JFrame();
     JLabel l1,l2,l3,l4,l5,l6,l7,l8;
     JLabel title;
     JTextField tf1,tf2,tf3,tf4,tf5,tf6;
     JTextArea t1,t2;
     JButton b1;
    
    public Registration()
    {
      
     

     f.setTitle("Registration Form");
     f.setBounds(300, 90, 900, 600);
     f.setDefaultCloseOperation(EXIT_ON_CLOSE);
     f.setSize(900,900);
     

        JPanel p1 = new JPanel();
        p1.setLayout(null);

     title = new JLabel("Registration Form");
	 title.setFont(new Font("Arial", Font.PLAIN, 30));
     title.setBounds(300, 30,300, 30);
     p1.add(title);

     //First Name

     l1 = new JLabel("First Name:");
     l1.setBounds(100, 100,100,20);
     p1.add(l1);
     

     tf1 = new JTextField();
     tf1.setBounds(200, 100,190,20);
     p1.add(tf1);

     //Last Name

     l2 = new JLabel("Last Name:");
     l2.setBounds(100, 150,100,20);
     p1.add(l2);

     tf2 = new JTextField();
     tf2.setBounds(200, 150,150,20);
     p1.add(tf2);

     //Reg No

        l3 = new JLabel("Reg No:");
        l3.setBounds(100, 200,100,20);
        p1.add(l3);

        tf3 = new JTextField();
        tf3.setBounds(200, 200,150,20);
        p1.add(tf3);

     //Gender

        l4 = new JLabel("Gender:");
        l4.setBounds(100, 250,100,20);
        p1.add(l4);

        tf4 = new JTextField();
        tf4.setBounds(200, 250,150,20);
        p1.add(tf4);

        //Address

        l5 = new JLabel("Address:");
        l5.setBounds(100, 300,100,20);
        p1.add(l5);
        

         t1 = new JTextArea();
         t1.setBounds(200, 300,200,75);
         t1.setLineWrap(true);
         p1.add(t1);

        //Skills

         l6 = new JLabel("Skills:");
         l6.setBounds(100, 420,100,20);
         p1.add(l6);

         t2 = new JTextArea();
         t2.setBounds(200, 400,200,75);
         t2.setLineWrap(true);
         p1.add(t2);

         //Email

         l7 = new JLabel("Email:");
         l7.setBounds(100, 500,100,20);
         p1.add(l7);

         tf5 = new JTextField();
         tf5.setBounds(200, 500,150,20);
         p1.add(tf5);

         //Password

         l8 = new JLabel("Password:");
         l8.setBounds(100, 550,100,20);
         p1.add(l8);

         tf6 = new JPasswordField();
         tf6.setBounds(200, 550,150,20);
         p1.add(tf6);

        //Button

          b1 = new JButton("Submit");
          b1.setBounds(200, 600,100,20);
          p1.add(b1);

        JTabbedPane t = new JTabbedPane();
        t.setBounds(50, 60, 1100, 700);
        t.add("registration Form", p1);
        f.setLayout(null);
        f.setVisible(true);
        f.add(t);

          b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            { 
                String s1 = tf1.getText();String s2 = tf2.getText();
                String s3 = tf3.getText(); String s4 = tf4.getText();
                String s5 = t1.getText();String s6 = t2.getText();
                String s7 = tf5.getText();String s8 = tf6.getText();
        
                if (e.getSource() == b1) {
                    try {
                          File file = new File(s3);

                        if (file.createNewFile()) {

                            FileWriter w = new FileWriter(tf3.getText(), true);
  
                        w.write("First Name:"+ s1 + "\n");
                        w.write("Last Name:"+ s2 + "\n");
                        w.write("Reg no:" + s3 + "\n");
                        w.write("Gender:"+ s4 + "\n");
                        w.write("Address:"+ s5 + "\n");
                        w.write("Skills:"+ s6 + "\n");
                        w.write("Email:"+ s7 + "\n");
                        w.write("Password:"+ s8 + "\n");
                        w.close();
                        JOptionPane
                        .showMessageDialog(f,"Successfully Saved The Details");
                          }
                          else {
                            JOptionPane
                           .showMessageDialog(f,"File Already exists! Go to login page!!");
                          }
                       
                    }
                    catch (Exception ae) {
                        System.out.println(ae);
                    }
            }
        }
        });
    }

    public void actionPerformed(ActionEvent e){
        
    }
        public static void main(String[] args)
        {
            new Registration();  
        }
}


  
