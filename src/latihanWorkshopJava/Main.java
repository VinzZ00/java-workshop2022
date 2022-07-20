package latihanWorkshopJava;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Main implements ActionListener{

	// ini global variable
//	Scanner sc = new Scanner(System.in);
//	
//	String a = "please Input some String ";
	// ini constructor
	JFrame fr = new JFrame();
	
	JButton submit; 
	
	JTextField emailField;
	JPasswordField passwordField;
	//tipe data java
	/*
	 * interger
	 * string
	 * boolean
	 * float
	 * double
	 * long
	 * date
	 */
	
	//layout manager
	/*
	 * null, BorderLayout (Default JFrame, GridLayout , GridBagLayout, FlowLayout default (default JPanel)
	 */
	
	public Main() {
	
		String title = "Login";
		
		
		//label Header
		JLabel headerLabel = new JLabel("Welcome to Login Page", SwingConstants.CENTER);
		headerLabel.setBorder(new EmptyBorder(10,0,10,0));
		
		JLabel emailLabel = new JLabel("Email");
		JLabel passwordLabel = new JLabel("Password");
		
		emailField = new JTextField();
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		
		JPanel panelBody = new JPanel(new GridLayout(2,2,0,5));
		panelBody.setBorder(new EmptyBorder(0,10,0,10));
		
		JPanel submitpane = new JPanel();
		
		submit = new JButton("Login");
		submit.addActionListener(this);
		submitpane.add(submit);
		submit.setPreferredSize(new Dimension(150,50));
		submitpane.setBorder(new EmptyBorder(10,0,80,0));
		
		
		panelBody.add(emailLabel);
		panelBody.add(emailField);
		panelBody.add(passwordLabel);
		panelBody.add(passwordField);
		
		//Adding component
		fr.add(headerLabel, BorderLayout.NORTH);
		fr.add(panelBody, BorderLayout.CENTER);
		fr.add(submitpane, BorderLayout.SOUTH);
		
		// setting JFrame
			fr.setEnabled(true);
			fr.setTitle(title);
			fr.setVisible(true);
			fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fr.setLocationRelativeTo(null);
			fr.setSize(500,300);
			fr.setResizable(false);
		
//		fr.setLayout(new GridLayout());
		
		
		
		
		
		// +-*/%		
		//Penjumlahan dari x dan y
//		System.out.println("masukan angka pertama");
//		int x = sc.nextInt(); sc.nextLine();
//		int y = sc.nextInt(); sc.nextLine();
//		
//		System.out.println("penjumlahan dari x dan y adalah " + (x+y));
		
		
//		System.out.println(a);
//		String b = sc.nextLine();
//		String c = "ini input user " + b;
//		System.out.println("ini inputan user " + b);
		// TODO Auto-generated constructor stub
//		String b = a + "\nIni dari main";
//		System.out.println(b);
//		method1();
	}
	
	// ini method
//	public void method1() {
////		System.out.println(a);
//	}
	
	
	
	public static void main(String[] args) {
		new Main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == submit) {
			System.out.println(emailField.getText());
			System.out.println(passwordField.getPassword());
			
			if (emailField.getText().equals("elvin@gmail.com")) {
				if (String.valueOf(passwordField.getPassword()).equals("Elvin123")) {
					System.out.println("Login Success");
				} else System.out.println("password anda salah");
			} else System.out.println("Email anda salah");
		}
	}
	

}