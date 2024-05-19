package Swing2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class EmpRegisterEmployee extends JFrame {

	private static final long serialVersionUID = 1L;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField password;
	private JTextArea gamesdata;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpRegisterEmployee frame = new EmpRegisterEmployee();
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
	public EmpRegisterEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 760);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new LineBorder(new Color(0, 51, 153), 2));
		contentPane.setBackground(new Color(153, 204, 153));
		getContentPane().add(contentPane, BorderLayout.CENTER);
		
		JLabel companylogo = new JLabel(" ");
		companylogo.setIcon(new ImageIcon("/home/kabal/Downloads/Eclipse photos/9166875.png"));
		companylogo.setBounds(0, 0, 139, 128);
		contentPane.add(companylogo);
		
		JLabel lblEnterUserId = new JLabel("Enter User Id:");
		lblEnterUserId.setForeground(new Color(139, 0, 0));
		lblEnterUserId.setFont(new Font("Dialog", Font.BOLD, 18));
		lblEnterUserId.setBounds(65, 148, 190, 28);
		contentPane.add(lblEnterUserId);
		
		JTextField userid = new JTextField();
		userid.setFont(new Font("Dialog", Font.PLAIN, 18));
		userid.setBackground(new Color(224, 255, 255));
		userid.setBounds(291, 148, 261, 28);
		contentPane.add(userid);
		new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.background"));
		getContentPane().add(contentPane, BorderLayout.CENTER);
		
		JLabel companylogo1 = new JLabel("");
		companylogo1.setBounds(0, 0, 124, 123);
		contentPane.add(companylogo1);
		
		JLabel lblEnterUserId1 = new JLabel("Enter User Id:");
		lblEnterUserId1.setForeground(new Color(139, 0, 0));
		lblEnterUserId1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblEnterUserId1.setBounds(65, 148, 190, 28);
		contentPane.add(lblEnterUserId1);
		
		JLabel lblEnterName = new JLabel("Enter Name :");
		lblEnterName.setForeground(new Color(139, 0, 0));
		lblEnterName.setFont(new Font("Dialog", Font.BOLD, 18));
		lblEnterName.setBounds(71, 193, 156, 22);
		contentPane.add(lblEnterName);
		
		JTextField username = new JTextField();
		username.setFont(new Font("Dialog", Font.PLAIN, 18));
		username.setBackground(new Color(224, 255, 255));
		username.setBounds(291, 188, 261, 28);
		contentPane.add(username);
		
		JLabel lblEnterPassword = new JLabel("Enter Password :");
		lblEnterPassword.setForeground(new Color(139, 0, 0));
		lblEnterPassword.setFont(new Font("Dialog", Font.BOLD, 18));
		lblEnterPassword.setBounds(48, 225, 190, 22);
		contentPane.add(lblEnterPassword);
		
		password = new JPasswordField();new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.background"));
		getContentPane().add(contentPane, BorderLayout.CENTER);
		
		JLabel heading = new JLabel("Employee Management System");
		heading.setHorizontalAlignment(SwingConstants.CENTER);
		heading.setForeground(new Color(0, 0, 128));
		heading.setFont(new Font("SansSerif", Font.BOLD, 30));
		heading.setBounds(136, -1, 549, 82);
		contentPane.add(heading);
		
		password.setFont(new Font("Dialog", Font.PLAIN, 18));
		password.setBackground(new Color(224, 255, 255));
		password.setBounds(291, 225, 261, 28);
		contentPane.add(password);
		
		JLabel gender = new JLabel("Gender:");
		gender.setForeground(new Color(139, 0, 0));
		gender.setFont(new Font("Dialog", Font.BOLD, 18));
		gender.setBounds(81, 273, 94, 22);
		contentPane.add(gender);
		
		JRadioButton male = new JRadioButton("Male");
		buttonGroup_1.add(male);
		male.setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.background"));
		male.setBounds(202, 274, 80, 23);
		contentPane.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		buttonGroup_1.add(female);
		female.setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.background"));
		female.setBounds(291, 274, 80, 23);
		contentPane.add(female); 
		
		JLabel lblHobbies = new JLabel("Hobbies:");
		lblHobbies.setForeground(new Color(139, 0, 0));
		lblHobbies.setFont(new Font("Dialog", Font.BOLD, 18));
		lblHobbies.setBounds(81, 317, 94, 22);
		contentPane.add(lblHobbies);
		
		JCheckBox read = new JCheckBox("Reading");
		read.setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.background"));
		read.setBounds(189, 318, 129, 23);
		contentPane.add(read);
		
		JCheckBox write = new JCheckBox("Writing");
		write.setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.background"));
		write.setBounds(322, 318, 129, 23);
		contentPane.add(write);
		
		JCheckBox travel = new JCheckBox("Travelling");
		travel.setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.background"));
		travel.setBounds(456, 318, 129, 23);
		contentPane.add(travel);
		
		JCheckBox cook = new JCheckBox("Cooking");
		cook.setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.background"));
		cook.setBounds(189, 351, 129, 23);
		contentPane.add(cook);
		
		JCheckBox scroll = new JCheckBox("Scrolling");
		scroll.setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.background"));
		scroll.setBounds(322, 351, 129, 23);
		contentPane.add(scroll);
		
		JCheckBox dance = new JCheckBox("Dancing");
		dance.setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.background"));
		dance.setBounds(456, 351, 129, 23);
		contentPane.add(dance);


		EmpCityAndState cd=new EmpCityAndState();
		
	


		JComboBox city = new JComboBox(cd.getCityList());
		EmpData ob=new EmpData();
		JComboBox state = new JComboBox(ob.state);
		state.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//get selected state
				String sstate=(String)state.getSelectedItem();
				
				//fetch list of cities from state
				EmpCityAndState cd=new EmpCityAndState();
				String[] fetchcities=cd.fetchCities(sstate);
				
				//select first index of the cities
				city.setSelectedItem(fetchcities[0]);
			}
		});
		state.setBounds(450, 406, 190, 24);
		contentPane.add(state);
		AutoCompleteDecorator.decorate(state);
		
		city.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//get selected city 
				String scity=(String)city.getSelectedItem();
				
				//call method to fetch city and get state
				EmpCityAndState cd=new EmpCityAndState();
				String fetchState = cd.fetchState(scity);
				
				//select state in the stated combobox
				state.setSelectedItem(fetchState);
				city.setSelectedItem(scity);
			}
		});
		
		JLabel lblState = new JLabel("State:");
		lblState.setForeground(new Color(139, 0, 0));
		lblState.setFont(new Font("Dialog", Font.BOLD, 18));
		lblState.setBounds(370, 406, 69, 22);
		contentPane.add(lblState);
		
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setForeground(new Color(139, 0, 0));
		lblCity.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCity.setBounds(55, 408, 69, 22);
		contentPane.add(lblCity);
		
		city.setBounds(136, 408, 195, 24);
		contentPane.add(city);
		AutoCompleteDecorator.decorate(city);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon("/home/kabal/Pictures/Screenshots/Screenshot from 2023-10-30 23-31-28.png"));
		btnNewButton.setBounds(591, 93, 69, 46);
		contentPane.add(btnNewButton);
		
		JButton bb = new JButton("Back");
		bb.setForeground(new Color(0, 0, 153));
		bb.setFont(new Font("Dialog", Font.BOLD, 16));
		bb.setBorder(null);
		bb.setBackground(new Color(153, 204, 153));
		bb.setBounds(334, 93, 117, 25);
		contentPane.add(bb);
		
		JLabel lblCity_1 = new JLabel("Games:");
		lblCity_1.setForeground(new Color(139, 0, 0));
		lblCity_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCity_1.setBounds(48, 462, 91, 22);
		contentPane.add(lblCity_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(136, 465, 175, 123);
		contentPane.add(scrollPane);
		
		JList games = new JList();
		games.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) 
			{
				String data="Selected Games : \n";
				
				List <String> selectedGames=games.getSelectedValuesList();
				for(String s:selectedGames)
				{
					data+=s+"\n";
				}
				
				gamesdata.setText(data);
			}
		});
		games.setToolTipText("hold ctrl to select multiple games");
		games.setFont(new Font("Dialog", Font.BOLD, 14));
		games.setModel(new AbstractListModel() {
			String[] values = new String[] {"- - Select Games- -", "1. Cricket", "2. Tennis", "3. Football", "4. Table Tennis", "5. Racing", "6. Kabbadi", "7. Badminton", "8. Chess", "9. Hide and Seek", "10. Ludo", "11. Snake and Ladder", "12. Carrom"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(games);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(322, 465, 183, 123);
		contentPane.add(scrollPane_1);
		
		gamesdata =  new JTextArea();
		gamesdata.setFont(new Font("Dialog", Font.BOLD, 14));
		gamesdata.setText("- - Seleted Games- -");
		scrollPane_1.setViewportView(gamesdata);
		
		JButton btnResetGames = new JButton("Reset Games");
		btnResetGames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				games.setSelectedIndex(0);
				gamesdata.setText("Selected Games : \n");
				
			}
		});
		btnResetGames.setBounds(528, 466, 139, 35);
		contentPane.add(btnResetGames);
		
		JButton btnNewButton_1 = new JButton("Submit Form");                       
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				EmpEmployee emp=new EmpEmployee();
				
				emp.setUserid(userid.getText());
				emp.setName(username.getText());
				emp.setPassword(String.valueOf(password.getPassword()));
				emp.setGender(male.isSelected() ?"Male":"Female");
				
				List<String> hobbies=new ArrayList<String>();
				if(read.isSelected()) hobbies.add("Reading");
				if(write.isSelected()) hobbies.add("Writing");
				if(travel.isSelected()) hobbies.add("Travelling");
				if(cook.isSelected()) hobbies.add("Cooking");
				if(scroll.isSelected()) hobbies.add("Srolling");
				if(dance.isSelected()) hobbies.add("Dancing");
				emp.setHobbies(hobbies);
				
				emp.setCity((String)city.getSelectedItem());
				emp.setState((String)state.getSelectedItem());
				Vector<String> listgames=new Vector<String> (games.getSelectedValuesList());
				emp.setGames(listgames );
				
				EmpShowData st=new EmpShowData(emp);
				st.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBackground(new Color(51, 0, 102));
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(175, 645, 143, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Reset Form");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton_1_1.setBackground(new Color(51, 0, 102));
		btnNewButton_1_1.setBounds(370, 645, 143, 35);
		contentPane.add(btnNewButton_1_1);
	}
}
