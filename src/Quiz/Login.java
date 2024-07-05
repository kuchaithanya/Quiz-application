package Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton rules,back;
    JTextField tfname;

    Login()
    {
      getContentPane().setBackground(Color.WHITE);//4.background white
     setLayout(null);

      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));   //5.
      JLabel image= new JLabel(i1);

      image.setBounds(0,0,600,500); //7.distance from left, from right, len,width og image
      add(image);


     JLabel heading=new JLabel("Simple Minds");
     heading.setBounds(750,50,300,45);
     heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
     heading.setForeground(new Color(30,144,254));
     add(heading);

        JLabel name=new JLabel("Enter your name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        add(name);

        tfname=new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);

        rules=new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back=new JButton("Back");
        back.setBounds(915 ,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        JLabel me=new JLabel("By Chaithanya ");
        me.setBounds(980,350,150,30);
        me.setFont(new Font("Mongolian Baiti",Font.ITALIC,18));
        me.setForeground(new Color(30,144,254));
        add(me);

        JLabel me1=new JLabel("Harsha Priya ");
        me1.setBounds(980,390,150,30);
        me1.setFont(new Font("Mongolian Baiti",Font.ITALIC,18));
        me1.setForeground(new Color(30,144,254));
        add(me1);

        JLabel me2=new JLabel("Akash ");
        me2.setBounds(980,430,150,30);
        me2.setFont(new Font("Mongolian Baiti",Font.ITALIC,18));
        me2.setForeground(new Color(30,144,254));
        add(me2);

      setSize(1200,500);//2.1st arg length, 2nd arg frames width . but every time it opens in top left
      setLocation(200,150);//3. in order to put in center 1st arg from left n 2nd arg from top.frame bydefault colour is grey
      setVisible(true);// 1.bydefault frames visibility would be hidden ,frame would be ready , we get only header here

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back){
            setVisible(false);
        }
    }

    public static void main(String[] args){
      new Login(); // annonyms object
      
    }
}
