package packunpack;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javafx.scene.control.ColorPicker;

public class  Packunpack1 extends JFrame implements ActionListener {

	JFrame f;
	JPanel p;
	JLabel l1;
	JButton b1,b2;
	
	public Packunpack1() 
	{
		initComponent();
	}
	public void initComponent() 
	{
		 f=new JFrame("PACK_UNPACK");
		 p=new JPanel(null);
		 p.setBackground(new Color(255,0,0,40));
		 	
		 l1=new JLabel("Packing And Unpacking");
		 
		 b1=new JButton("PACK");
		 b2=new JButton("UNPACK");
		 
		 
		   l1.setFont(new Font("serif",Font.BOLD,18));
		   l1.setBounds(75,55,200,30);      
	       b1.setBounds(75,110,80,25);
	       b2.setBounds(180,110,85,25);
	  
	   
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		p.add(l1);
		p.add(b1);
		p.add(b2);
	
		
		f.add(p);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setBounds(5,5,350,250);
		f.setLocationRelativeTo(null);
		f.setResizable(false);

	}
	
	
	@Override
		public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)
		{
			Packing l=new Packing();
			f.dispose();
			f.setVisible(false);
		
		}
		if(e.getSource()==b2)
		{
			Unpacking l=new Unpacking();
			f.dispose();
			f.setVisible(false);
		
		}
	
	
	}
}
