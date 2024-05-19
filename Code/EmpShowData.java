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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmpShowData extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpShowData frame = new EmpShowData(new EmpEmployee ());
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
	public EmpShowData(EmpEmployee emp) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 691);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel companylogo = new JLabel("");
		companylogo.setIcon(new ImageIcon("/home/kabal/Downloads/Eclipse photos/9166875.png"));
		companylogo.setBounds(0, 12, 139, 128);
		contentPane.add(companylogo);
		
		JLabel heading = new JLabel("Employee Management System");
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		heading.setForeground(new Color(0, 0, 128));
		heading.setFont(new Font("DejaVu Sans", Font.BOLD, 24));
		heading.setBounds(142, 29, 431, 44);
		contentPane.add(heading);
		
		JLabel lblSubmittedData = new JLabel("Submitted Data");
		lblSubmittedData.setForeground(new Color(139, 0, 0));
		lblSubmittedData.setFont(new Font("Dialog", Font.BOLD, 18));
		lblSubmittedData.setBounds(10, 150, 256, 34);
		contentPane.add(lblSubmittedData);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(12, 201, 585, 435);
		contentPane.add(scrollPane);
		
		String data[][]=new String [8][2];
		String headings[]= {"Columns","Values"};
		table = new JTable(data,headings);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Employee Id", emp.getUserid()},
				{"Name", emp.getName()},
				{"Password", emp.getPassword()},
				{"Gender", emp.getGender()},
				{"Hobbies", emp.getHobbies()},
				{"City", emp.getCity()},
				{"State", emp.getState()},
				{"Games", emp.getGames()},
			},
			new String[] {
				"Columns", "Values"
			}
		));
		scrollPane.setViewportView(table);
		table.setRowHeight(50);
		table.getTableHeader().setFont(new Font("Dialog", Font.BOLD, 24));
		table.getTableHeader().setForeground(Color.WHITE);
		table.getTableHeader().setBackground(new Color(128,128,128));
		table.setFont(new Font("Dialog", Font.CENTER_BASELINE, 18));
		
		
		
		
		JButton btnNewButton_1 = new JButton("Save Data");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				EmpEmployeeDao edao=new EmpEmployeeDao();
				
				int savedata=edao.saveData(emp);
				
				if(savedata==1)
				{
					JOptionPane.showMessageDialog(getParent(), "Record Saved succesfully!!!");
				}
				else
				{
					JOptionPane.showMessageDialog(getParent(), "Unable to Record!!!!!");
				}
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_1.setBackground(new Color(51, 0, 102));
		btnNewButton_1.setBounds(422, 137, 143, 35);
		contentPane.add(btnNewButton_1);
	}
}
