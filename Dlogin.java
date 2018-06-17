package packunpack;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Dlogin extends JFrame implements ActionListener {

	static int icnt=3;
	JFrame f;
	JPanel p;
	JLabel l1,l2,l3;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2;
	
	public void Login()
	{

		 f=new JFrame("MARVELLOUS.....");
		 p=new JPanel(null);
		 
		 l1=new JLabel("USER");
		 l2=new JLabel("PASSWORD");
		 l3=new JLabel("");
		 
		 t1=new JTextField(20);
		 p1=new JPasswordField(20);
		
		 b1=new JButton("OK");
		 b2=new JButton("CANCEL");
		 

		   l1.setBounds(75,40,50,20);
	       l2.setBounds(50,70,100,20);
	       t1.setBounds(150,40,110,20);
	       p1.setBounds(150,70,110,20);
	       b1.setBounds(75,110,80,25);
	       b2.setBounds(170,110,85,25);
	       l3.setBounds(120,150,150,25);
	       l3.setForeground(Color.red);
	   
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(p1);
		p.add(b1);
		p.add(b2);
		p.add(l3);

		
		f.add(p);
		t1.requestFocus();
		
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
			
			String pass=String.valueOf(p1.getPassword());
			if(t1.getText().equals("") || pass.equals(""))
				JOptionPane.showMessageDialog(this,"PLEASE ENTER USER NAME AND PASSWORD");
			else if(t1.getText().equals("admin") || pass.equals("admin"))
			{
				JOptionPane.showMessageDialog(this,"LOGINED SUCCESSFULLY.....!");
				Packunpack1 p=new Packunpack1();
				f.dispose();
			}
				else
			{
				l3.setText("Attempts Remained:  "+icnt);
				t1.setText("");
				p1.setText("");
				
					icnt--;
					if(icnt==-1)
					{
						f.dispose();
					}
			}
			
		}
		if(e.getSource()==b2)
		{
			f.dispose();
		}
	
	}
	
	public static void main(String[] args) {

		Dlogin l=new Dlogin();
		l.Login();
	}
}
