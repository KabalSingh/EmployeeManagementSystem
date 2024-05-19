package Swing2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmpProfilePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpProfilePage frame = new EmpProfilePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param name 
	 */
	public EmpProfilePage(/*String name*/) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 746);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Employee Management System");
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		heading.setForeground(new Color(0, 0, 128));
		heading.setFont(new Font("SansSerif", Font.BOLD, 30));
		heading.setBounds(136, 12, 562, 97);
		contentPane.add(heading);
		
		JLabel companylogo = new JLabel("");
		companylogo.setIcon(new ImageIcon("/home/kabal/Downloads/Eclipse photos/9166875.png"));
		companylogo.setBounds(0, 0, 135, 136);
		contentPane.add(companylogo);
		
		JLabel lblWelcome = new JLabel("Welcome "/*+name*/);
		lblWelcome.setForeground(new Color(139, 0, 0));
		lblWelcome.setFont(new Font("Dialog", Font.BOLD, 18));
		lblWelcome.setBounds(51, 148, 256, 34);
		contentPane.add(lblWelcome);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				JOptionPane.showMessageDialog(getParent(), "You are logged out successfully!!");
				EmpLoginFrame lf=new EmpLoginFrame();
				lf.setVisible(true);
				setVisible(false);
			}
		});
		btnLogout.setBorder(new LineBorder(new Color(0, 0, 102), 5));
		btnLogout.setBackground(new Color(153, 204, 153));
		btnLogout.setFont(new Font("Dialog", Font.BOLD, 18));
		btnLogout.setBounds(513, 128, 151, 44);
		contentPane.add(btnLogout);
	}
}
