import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JTextField;

public class GUICalculator implements ActionListener{
	GUICalculator(){
		
		JFrame f =new JFrame();
		JPanel p =new JPanel();
		JTextField t1 = new JTextField();
		JButton b1 =new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("+");
		JButton b5 = new JButton("4");
		JButton b6 = new JButton("5");
		JButton b7 = new JButton("6");
		JButton b8 = new JButton("-");
		JButton b9 = new JButton("7");
		JButton b10 = new JButton("8");
		JButton b11 = new JButton("9");
		JButton b12 = new JButton("*");
		JButton b13 = new JButton("0");
		JButton b14 = new JButton("c");
		JButton b15 = new JButton("=");
		JButton b16 = new JButton("/");
		t1 =new JTextField();
		t1.setBounds(100,100,200,30);
		b1.setBounds(100,140,50,30);
		b2.setBounds(150,140,50,30);
		b3.setBounds(200,140,50,30);
		b4.setBounds(250,140,50,30);
		b4.setBounds(250,140,50,30);
		b5 = new JButton("4");
		b5.setBounds(100,170,50,30);
		b6 = new JButton("5");
		b6.setBounds(150,170,50,30);
		b7 = new JButton("6");
		b7.setBounds(200,170,50,30);
		b8 = new JButton("-");
		b8.setBounds(250,170,50,30);
		b9 = new JButton("7");
		b9.setBounds(100,200,50,30);
		b10 = new JButton("8");
		b10.setBounds(150,200,50,30);
		b11 = new JButton("9");
		b11.setBounds(200,200,50,30);
		b12 = new JButton("*");
		b12.setBounds(250,200,50,30);
		b13 = new JButton("/");
		b13.setBounds(100,230,50,30);
		b14 = new JButton("0");
		b14.setBounds(150,230,50,30);
		b15 = new JButton("=");
		b15.setBounds(200,230,50,30);
		b16 = new JButton("C");
		b16.setBounds(250,230,50,30);

		
		f.setContentPane(p);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		p.add(t1);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.add(b13);
		p.add(b14);
		p.add(b15);
		p.add(b16);
		
		b1.addActionListener((ActionListener) this);
		b2.addActionListener((ActionListener) this);
		b3.addActionListener((ActionListener) this);
		b5.addActionListener((ActionListener) this);
		b6.addActionListener((ActionListener) this);
		b7.addActionListener((ActionListener) this);
		b8.addActionListener((ActionListener) this);
		b9.addActionListener((ActionListener) this);
		b10.addActionListener((ActionListener) this);
		b11.addActionListener((ActionListener) this);
		b12.addActionListener((ActionListener) this);
		b13.addActionListener((ActionListener) this);
		b14.addActionListener((ActionListener) this);
		b15.addActionListener((ActionListener) this);
		b16.addActionListener((ActionListener) this);
		//p.add(b3);
		//p.add(b4);
		
		
		
	}
	public static void main(String[] args) {
		new GUICalculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
