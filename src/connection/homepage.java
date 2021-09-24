package connection;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class homepage extends JFrame implements ActionListener{

    JLabel l1;
    homepage(){
        super("electricity billing system");
        setSize(1200,700);
        
            ImageIcon i2=new ImageIcon(ClassLoader.getSystemResource("connection/images/pay-electricity-bill.jpg"));
            Image i3=i2.getImage().getScaledInstance(1200, 600,Image.SCALE_DEFAULT);
            ImageIcon icc=new ImageIcon(i3);
            l1=new JLabel(icc);
            add(l1);
        JMenuBar mb=new JMenuBar();
       
        JMenu master=new JMenu("Customer");
        JMenuItem mi1=new JMenuItem("new customer");
        JMenuItem mi2=new JMenuItem("customer details");
        master.setForeground(Color.BLUE);
        
        Font f=new Font("monospaced",Font.PLAIN,16);
        mi1.setFont(f);
          ImageIcon img_mil=new ImageIcon(ClassLoader.getSystemResource("connection/images/new.png"));
            Image image_mil=img_mil.getImage().getScaledInstance(16, 20,Image.SCALE_DEFAULT);
            mi1.setIcon(new ImageIcon(image_mil));
        mi1.setBackground(Color.WHITE);
        
        mi2.setFont(f);
        mi2.setFont(f);
          ImageIcon img_mi2=new ImageIcon(ClassLoader.getSystemResource("connection/images/information.png"));
            Image image_mi2=img_mi2.getImage().getScaledInstance(16, 20,Image.SCALE_DEFAULT);
            mi2.setIcon(new ImageIcon(image_mi2));
        mi2.setBackground(Color.WHITE);
        
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        
        JMenu user=new JMenu("Payment");
        JMenuItem ui1=new JMenuItem("pay bill");
        ui1.setFont(f);
        ui1.setBackground(Color.WHITE);
        ui1.addActionListener(this);
        
        
        JMenu report=new JMenu("Report");
        JMenuItem r1=new JMenuItem("Generate Bill");
        r1.setFont(f);
        r1.setBackground(Color.WHITE);
        r1.addActionListener(this);
        
        JMenu exit=new JMenu("Exit");
        JMenuItem ex=new JMenuItem("Exit");
        ex.setFont(f);
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        
        master.add(mi1);
        master.add(mi2);
        user.add(ui1);
        report.add(r1);
        exit.add(ex);
        mb.add(master);
        mb.add(user);
        mb.add(report);
        mb.add(exit);
        
        setJMenuBar(mb);
        setFont(new Font("senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ev)
    {
        String msg=ev.getActionCommand();
        if(msg.equals("new customer"))
        {
           new new_customer().setVisible(true);
            
        }
        else if(msg.equals("customer details"))
        {
            new customer_details().setVisible(true);
        }
        else if(msg.equals("pay bill"))
        {
            new pay().setVisible(true);
        }
        else if(msg.equals("Generate Bill"))
        {
            new generate_bill().setVisible(true);
        }
        else if(msg.equals("Exit"))
        {
            System.exit(0);
        }
        else{
            System.out.println("Wrong");
        }
        
        
    }
    
    public static void main(String args[])
    {
       new homepage().setVisible(true); 
    }
    
    
    

   
    
    
}
