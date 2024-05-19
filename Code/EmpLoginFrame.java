package Swing2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.BorderLayout;

public class EmpLoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField empid;
	private JPasswordField emppass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpLoginFrame frame = new EmpLoginFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmpLoginFrame() {
		JLabel msg=new JLabel();
				
		setIconImage(Toolkit.getDefaultToolkit().getImage("/home/kabal/Downloads/7001601.png"));
		setTitle("Employee Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 8));
		contentPane.setBackground(new Color(60, 179, 113));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Employee Management System");
		heading.setBounds(159, 50, 463, 44);
		heading.setFont(new Font("DejaVu Sans", Font.BOLD, 24));
		heading.setForeground(new Color(0, 0, 128));
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(heading);
		
		JLabel companylogo = new JLabel("");
		companylogo.setBounds(12, 12, 135, 136);
		companylogo.setIcon(new ImageIcon("/home/kabal/Downloads/Eclipse photos/9166875.png"));
		contentPane.add(companylogo);
		
		JLabel lblNewLabel = new JLabel("Enter Employee Id :");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(139, 0, 0));
		lblNewLabel.setBounds(51, 165, 212, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterPassword = new JLabel("Enter Password :");
		lblEnterPassword.setForeground(new Color(139, 0, 0));
		lblEnterPassword.setFont(new Font("Dialog", Font.BOLD, 18));
		lblEnterPassword.setBounds(51, 254, 190, 34);
		contentPane.add(lblEnterPassword);
		
		empid =  new JTextField();
		empid.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) 
			{
				String id=empid.getText();
				msg.setForeground(Color.red);
				msg.setFont(new Font("Dialog", Font.BOLD, 16));
				msg.setBounds(281, 205, 350, 30);
				contentPane.add(msg);
				if(!id.endsWith("@gmail.com"))
				{
					msg.setText("Id field should end with @gmail.com");
					contentPane.updateUI();
				}else
				{
					msg.setText("");
					contentPane.updateUI();
				}
			}
		});
		empid.setSelectionEnd(5);
		empid.setText("Employee id");
		empid.setBackground(new Color(224, 255, 255));
		empid.setFont(new Font("Dialog", Font.PLAIN, 18));
		empid.setBounds(281, 160, 261, 44);
		contentPane.add(empid);
		empid.setColumns(10);
		
		emppass = new JPasswordField();
		emppass.setFont(new Font("Dialog", Font.PLAIN, 18));
		emppass.setEchoChar('*');
		emppass.setBackground(new Color(224, 255, 255));
		emppass.setBounds(281, 249, 261, 44);
		contentPane.add(emppass);
		

		JPanel panel = new JPanel();
		panel.setBounds(0, 460, 654, 39);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel status = new JLabel("Status :");
		panel.add(status, BorderLayout.WEST);
		status.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JButton Login = new JButton("Login");
		Login.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0)
			 {
				 //get text field value
				 //getText(): it is used to get the value of the text field
				 //setText(): it is used to set the value of the text field
				 
				 String userid=empid.getText();
				 //getPassword(): it is used to get the password from jpassword field
				 //this method return an array of characters
				 
				 String pass=new String(emppass.getPassword());
				 
				 if(userid.equals("abc@gmail.com") && pass.equals("12345"))
				 {
					 status.setText("Status : Login Successfull!!");
					 JOptionPane.showMessageDialog(getParent(), "Login Successfull!!");
					 EmpProfilePage pp= new EmpProfilePage(/*"ABC"*/);
					 pp.setVisible(true);
					 setVisible(false);
				 }else
				 {
					 status.setText("Status : Either id or password is incorrect!!");
					 JOptionPane.showMessageDialog(getParent(), "Either id or password is incorrect!!");
				 }
				 }
		});
		Login.setFont(new Font("Dialog", Font.BOLD, 18));
		Login.setBounds(119, 320, 151, 44);
		contentPane.add(Login);
		
		JButton Reset = new JButton("Reset");
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				empid.setText("");
				emppass.setText("");
			}
		});
		Reset.setFont(new Font("Dialog", Font.BOLD, 18));
		Reset.setBounds(366, 320, 151, 44);
		contentPane.add(Reset);
		
		JButton lblNewUserRegister = new JButton("New User? Register");
		lblNewUserRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				EmpRegisterEmployee reg=new EmpRegisterEmployee();
				reg.setVisible(true);
				setVisible(false);
			}
		});
		lblNewUserRegister.setForeground(new Color(0, 0, 0));
		lblNewUserRegister.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewUserRegister.setBounds(149, 396, 368, 44);
		contentPane.add(lblNewUserRegister);
		
		

		
	}
}
