package org.itstep;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class MainWindow extends JFrame{
	
	private JTextField name;
	private JTextField resultField;
	private JTextField NameTField;
	private JTextField SurnameTField;
	private JTextField EmailTField;
	private JTextField PasswordTField;
	private JTextField ASINTField;
	public MainWindow() {
		getContentPane().setLayout(null);
		
		NameTField = new JTextField();
		NameTField.setText("Enter name here");
		NameTField.setBounds(21, 10, 140, 20);
		getContentPane().add(NameTField);
		NameTField.setColumns(10);
		
		SurnameTField = new JTextField();
		SurnameTField.setText("Enter surname here");
		SurnameTField.setBounds(21, 50, 140, 20);
		getContentPane().add(SurnameTField);
		SurnameTField.setColumns(10);
		
		EmailTField = new JTextField();
		EmailTField.setText("Enter email here");
		EmailTField.setBounds(21, 90, 140, 20);
		getContentPane().add(EmailTField);
		EmailTField.setColumns(10);
		
		PasswordTField = new JTextField();
		PasswordTField.setText("Enter password here");
		PasswordTField.setBounds(21, 130, 140, 20);
		getContentPane().add(PasswordTField);
		PasswordTField.setColumns(10);
		
		ASINTField = new JTextField();
		ASINTField.setText("Enter ASIN here");
		ASINTField.setBounds(248, 10, 140, 20);
		getContentPane().add(ASINTField);
		ASINTField.setColumns(10);
		
		JButton RegistrationBtn = new JButton("Registration");
		RegistrationBtn.setBounds(21, 170, 140, 23);
		getContentPane().add(RegistrationBtn);
		RegistrationBtn.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
					//TODO Registration
				}
			});
		
		JLabel DescriptionLbl = new JLabel("Description here");
		DescriptionLbl.setVerticalAlignment(SwingConstants.TOP);
		DescriptionLbl.setBounds(248, 40, 259, 110);
		getContentPane().add(DescriptionLbl);
		
		JButton CartBtn = new JButton("Add to cart");
		CartBtn.setBounds(248, 170, 140, 23);
		getContentPane().add(CartBtn);
		CartBtn.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
					//TODO Goods add
				}
			});
		
		JButton FindGoodBtn = new JButton("Find");
		FindGoodBtn.setBounds(407, 9, 100, 23);
		getContentPane().add(FindGoodBtn);
		FindGoodBtn.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
					//TODO Goods finder
				}
			});
		
	}
	public MainWindow(String title) {
		setTitle(title);
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocation(200, 200);
		setResizable(false);
		getContentPane().setLayout(null);
		
	}
}
