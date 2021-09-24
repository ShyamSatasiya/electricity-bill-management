package connection;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class pay extends JFrame implements ActionListener{

    JLabel j1,j2,j3,j9;
    JButton b1,b2;
    JTextField t3;
    Choice t1,t2;
    JPanel p1,p2;
    Font f,f1;
    pay(){
        
        super("pay bill");
        setSize(700,600);
        setLocation(40,40);
        setResizable(true);
        f=new Font("senserif",Font.BOLD,15);
        f1=new Font("senserif",Font.BOLD,20);
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(9,2,10,10));
        
        j1=new JLabel("meter no");
       t1=new Choice();
    t1.add("1001");
    t1.add("1002");
    t1.add("1003");
    t1.add("1004");
    t1.add("1005");
    t1.add("1006");
    t1.add("1007");
    t1.add("1007");
    t1.add("1008");
    t1.add("1009");
    t1.add("1010");
        j1.setFont(f);
        t1.setFont(f);
        p1.add(j1);
        p1.add(t1);
        
        j2=new JLabel("Month");
         t2=new Choice();
    t2.add("january");
     t2.add("february");
      t2.add("march");
       t2.add("april");
        t2.add("may");
         t2.add("june");
          t2.add("july");
           t2.add("august");
            t2.add("sept");
            t2.add("octo");
             t2.add("novem");
              t2.add("Dec");
        j2.setFont(f);
        t2.setFont(f);
        p1.add(j2);
        p1.add(t2);
        
        j3=new JLabel("units consumed");
        t3=new JTextField(15);
        j3.setFont(f);
        t3.setFont(f);
        p1.add(j3);
        p1.add(t3);
        
      
        
        j9=new JLabel("pay_bill");
        j1.setFont(f1);
        j9.setHorizontalAlignment(JLabel.CENTER);
        b1=new JButton("calculate");
        b2=new JButton("cancel");
        b1.setFont(f);
        b2.setFont(f);
        p1.add(b1);
        p1.add(b2);
        
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        p2=new JPanel();
        p2.setLayout(new GridLayout(1,1));
        
        setLayout(new BorderLayout(30,30));
        add(j9,"North");
        add(p1,"Center");
        add(p2,"West");
        b1.addActionListener(this);
        b2.addActionListener(this);
    
    }
    public void actionPerformed(ActionEvent ev) {
        if(ev.getSource()==b1)
        {
           String meter=t1.getSelectedItem();
           String month=t2.getSelectedItem();
            String b=t3.getText();
            int units =Integer.parseInt(b);
           int  amount=(units*7)+98+42+112+48;
           
           
        try{
            connection_class ob=new connection_class();
            String q="insert into bill values('"+meter+"','"+month+"','"+units+"','"+amount+"')";
            ob.stm.executeUpdate(q);
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        JOptionPane.showMessageDialog(null,"amount added..");
        setVisible(false);
        }
    if(ev.getSource()==b2)
    {
        System.exit(0);
    }
    }

    public static void main(String args[])
    {
        new pay().setVisible(true);
    }
}
