
package connection;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class generate_bill extends JFrame implements ActionListener {
 JLabel l1,l2;
 JButton b1,b2;
 JTextArea t1;
 Choice c1,c2;
 JPanel p1,p;
 Font f;
 
    public generate_bill()  {
        
        super("generate bill");;
        setSize(450,700);
    setLocation(20,20);
    setResizable(false);
    p=new JPanel();
    f=new Font("airel",Font.BOLD,15);
        p1=new JPanel();
    l1=new JLabel("meter no");
        l2=new JLabel("month");
        l2.setFont(f);
        l1.setFont(f);
        
        c1=new Choice ();
        c1.add("1001");
        c1.add("1002");
        c1.add("1003");
        c1.add("1004");
        c1.add("1005");
        c1.add("1006");
        c1.add("1007");
        c1.add("1008");
        c1.add("1009");
        c1.add("1010");
                c1.setFont(f);
        c2=new Choice();

        c2.add("january");
     c2.add("february");
      c2.add("march");
       c2.add("april");
        c2.add("may");
         c2.add("june");
          c2.add("july");
           c2.add("august");
            c2.add("sept");
            c2.add("octo");
             c2.add("novem");
              c2.add("Dec");
                  c2.setFont(f);
        t1=new JTextArea(50,15);
        t1.setFont(f);
        b1=new JButton("print");
        b2=new JButton("show");
        b1.setFont(f);
        b2.setFont(f);
        setLayout(new BorderLayout());
        p.add(l1);
         p.add(c1);
          p.add(l2);
           p.add(c2);
           
             add(p,"North");
             p1.add(b1);
             p1.add(b2);
             add(p1,"South");
             add(t1);
             JScrollPane sp=new JScrollPane(t1);
             add(sp);
             b1.addActionListener(this);
             b2.addActionListener(this);
             
    }

   
    public void actionPerformed(ActionEvent ev) {
        if(ev.getSource()==b2)
        {
            String meterno=c1.getSelectedItem();
            String month =c2.getSelectedItem();
            t1.setText("\n ELECTRICITY BILL FOR THE MONTH"+month+"2020" );
            try{
                connection_class ob=new connection_class();
            String q="select * from customer_info where meterno = '"+meterno+"'";
            ResultSet res =ob.stm.executeQuery(q);
            while(res.next()){
                t1.append("\n name :"+res.getString("name"));
                t1.append("\n meter_no :"+res.getString("meterno"));
                t1.append("\n address :"+res.getString("address"));
                t1.append("\n state :"+res.getString("state"));
                t1.append("\n city :"+res.getString("city"));
                t1.append("\n email :"+res.getString("email"));
                t1.append("\n phone :"+res.getString("phone"));
            
            }
            t1.append("\n----------------------------------------");
            String q2="select * from tax";
            ResultSet res2 =ob.stm.executeQuery(q2);
            
             while(res2.next()){
                t1.append("\n meter location :"+res2.getString("meter_location"));
                t1.append("\n meter_type :"+res2.getString("meter_type"));
                t1.append("\n phase code  :"+res2.getString("phase_code"));
                t1.append("\n bill type :"+res2.getString("bill_type"));
                t1.append("\n day :"+res2.getString("days"));
            t1.append("\n----------------------------------------");
            
            t1.append("\n meter rent :"+res2.getString("meter_rent"));
            t1.append("\n service rent :"+res2.getString("service_rent"));
            t1.append("\n gst :"+res2.getString("gst"));
            t1.append("\n mcb rent :"+res2.getString("mcb_rent"));
            
            }
             t1.append("\n");
             String q1="select * from bill where meter = '"+meterno+"' and month = '"+month+"'";
             ResultSet res3 =ob.stm.executeQuery(q1);
                  while(res3.next()){
                t1.append("\n meter no :"+res3.getString("meter"));
                t1.append("\n current month :"+res3.getString("month"));
                t1.append("\n address :"+res3.getString("units"));
                t1.append("\n state :"+res3.getString("amount"));
                t1.append("\n \n ------------------------------------------");

                t1.append("\n PAY BILL :"+res3.getString("amount"));
                  }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        if(ev.getSource()==b1){
            try{
                t1.print();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }

   public static void main(String args[]){
       new generate_bill().setVisible(true);
   }
    
}
