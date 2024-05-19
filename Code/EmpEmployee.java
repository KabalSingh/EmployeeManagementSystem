package Swing2;

import java.util.List;
import java.util.Vector;

public class EmpEmployee {

	private String userid;
	private String name;
	private String password;
	private String gender;
	private List<String> hobbies;
	private String city,State;
	private Vector<String> games;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Vector<String> getGames() {
		return games;
	}
	public void setGames(Vector<String> games) {
		this.games = games;
	}
	@Override
	public String toString() {
		return "EmpEmployee [userid=" + userid + ", name=" + name + ", password=" + password + ", gender=" + gender
				+ ", hobbies=" + hobbies + ", city=" + city + ", State=" + State + ", games=" + games + "]";
	} 
	
}
 