
package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class AddCustomer extends JFrame implements ActionListener{
    
    JTextField tfname,tfaadhar,tfaddress,tfphone,tfnationality;
    JRadioButton rbmale,rbfemale;
    public AddCustomer(){
    
      
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading= new JLabel("ADD CUSTOMER DETAILS");
        heading.setBounds(220,20,500,35);
        heading.setFont(new Font("Tahoma",Font.PLAIN,32));
        heading.setForeground(Color.BLUE);
        add(heading);
        
         
        JLabel lblname= new JLabel("Name :");
        lblname.setBounds(60,80,150,25);
        lblname.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(220,80,150,25);
        add(tfname);
        
           
        JLabel lblnationality= new JLabel("Nationality :");
        lblnationality.setBounds(60,130,150,25);
        lblnationality.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblnationality);
        
        tfnationality = new JTextField();
        tfnationality.setBounds(220,130,150,25);
        add(tfnationality);
        
        JLabel lblaadhar= new JLabel("Aadhar Number :");
        lblaadhar.setBounds(60,180,150,25);
        lblaadhar.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(220,180,150,25);
        add(tfaadhar);
        
        JLabel address= new JLabel("Address :");
        address.setBounds(60,230,150,25);
        address.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(address);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(220,230,150,25);
        add(tfaddress);
        
      
        
        JLabel lblgender= new JLabel("Gender :");
        lblgender.setBounds(60,280,150,25);
        lblgender.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblgender);
        
        rbmale = new JRadioButton("Male");
        rbmale.setBounds(220,280,70,25);
        rbmale.setBackground(Color.WHITE);
        add(rbmale);
       
        rbfemale = new JRadioButton("Female");
        rbfemale.setBounds(300,280,70,25);
        rbfemale.setBackground(Color.WHITE);

        add(rbfemale);
           
        JLabel lbphone= new JLabel("Phone :");
        lbphone.setBounds(60,330,150,25);
        lbphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lbphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(220,330,150,25);
        add(tfphone);
        
        JButton save= new JButton ("SAVE");
        save.setBackground(Color.BLACK);
        save.setForeground(Color.WHITE);
        save.setBounds(220,380,150,30);
        save.addActionListener(this);
        add(save);
        
        
        
        ImageIcon image= new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/emp.png"));
        JLabel lblimage=new JLabel(image);
        lblimage.setBounds(450,80,280,400);
        add(lblimage);
        
        
       
        setSize(900,600);
        setLocation(300,150);
        setVisible(true);
        
        
    }
     public void actionPerformed(ActionEvent ae){
         
         String name= tfname.getText();
         String nationality=tfnationality.getText();
         String phone = tfphone.getText();
         String address=tfaddress.getText();
         String aadhar= tfaadhar.getText();
         String gender=null;
         if(rbmale.isSelected()){
             gender="Male";
         }else{
         gender= "Female";
                 }
      try{
          
          Conn conn = new Conn();
          
          String query= "Insert into passenger values('"+name+"','"+nationality+"','"+phone+"','"+address+"','"+aadhar+"','"+gender+"')";
          conn.s.executeUpdate(query);
          JOptionPane.showMessageDialog(null,"customer Details Added Successfully");
     }catch(Exception e){
        e.printStackTrace();
     }
     }
    public static void main(String[]args){
        
        new AddCustomer();
    }
}
