package Swing2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpEmployeeDao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public EmpEmployeeDao()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","abstract-programmer","example-password");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int saveData(EmpEmployee emp)
	{
		String query="insert into employee values(?,?,?,?,?,?,?,?)";
		
		int status=0;
		
		try {
			ps=con.prepareStatement(query);
			ps.setString(1, emp.getUserid());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getPassword());
			ps.setString(4, emp.getGender());
			ps.setString(5, emp.getHobbies().toString());
			ps.setString(6, emp.getCity());
			ps.setString(7, emp.getState());
			ps.setString(8, emp.getGames().toString());
			
			status=ps.executeUpdate();
			System.out.println("Record Inserted :" +status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status; 
	}
}
















