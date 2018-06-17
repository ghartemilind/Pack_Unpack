package packunpack;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Packing extends JFrame implements ActionListener {

	JFrame f;
	JPanel p;
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1;
	
	public Packing()
	{
		Login1();
	}
	
	public void Login1()
	{

		 f=new JFrame("PACKING.....");
		 p=new JPanel(null);
		 
		 l1=new JLabel("Directory Name");
		 l2=new JLabel(" Target File");
		 
		 t1=new JTextField(20);
		 t2=new JTextField(20);
				 
		 b1=new JButton("PACK");
		 
		   l1.setBounds(50,40,100,20);
	       l2.setBounds(50,70,100,20);
	       t1.setBounds(150,40,110,20);
	       t2.setBounds(150,70,110,20);
	       b1.setBounds(75,110,80,25);
	 	
		b1.addActionListener(this);
		
		
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(b1);
		
		f.add(p);
		t1.requestFocus();
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setBounds(20,20,350,250);
		f.setLocationRelativeTo(null);
		f.setResizable(false);

	}
	
	@Override
		public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1 && t1.getText()!="" && t2.getText()!="")
		{
			JOptionPane.showMessageDialog(this,"Packed Sucessfully...!");
			
			f.dispose();
			
			Packunpack1 p=new Packunpack1();

			
			
		}
	}
	
	
}