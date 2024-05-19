package Swing2;

import java.util.Scanner;

public class EmpCityAndState {

	// fetch all the cities , if state is given
	    EmpData ob;
		Scanner sc ;
		public EmpCityAndState() {
			ob= new EmpData();
			sc= new Scanner(System.in);
		}
		
		public String[] fetchCities(String state) {
//			System.out.println("Enter State: ");
//			String state=sc.nextLine();
			// save all the cities into a one d array	
			String city[] = null;
			for(int i=0	;i<ob.state.length;i++) 
			{
				if(state.equalsIgnoreCase(ob.state[i]))
				{
					//System.out.println("State Found");
					int len=ob.citystate[i].length;
					city= new String[len];
					for(int j=0;j<city.length;j++) 
					{
						city[j]=ob.citystate[i][j];
					}
					break;
				}
			}
			if(city!=null) {
				//System.out.println("Cities in "+state+" are : ");
			for(String s:city) {
				//System.out.println(s);
			}
			}
			return city;
		}
		 
		public String  fetchState(String city) {
//			System.out.println("Enter City : ");
//			String c= sc.nextLine();
			String state = null;
			for(int r=0;r<ob.citystate.length;r++)
			{
				for(int c=0;c<ob.citystate[r].length;c++) 
				{
					if(city.equalsIgnoreCase(ob.citystate[r][c]))
					{
//						System.out.println("State Found";
						//System.out.println(ob.state[r]);
						state=ob.state[r];
						break;
					}
				}
			}
			return state;
		}
		
		
		// convert two d array into one d array
	 public String[] getCityList()
		{
		 int len=0;
			for(int r=0;r<ob.citystate.length;r++)
				for(int c=0;c<ob.citystate[r].length;c++)
					len++;
			//System.out.println("total cities : "+len);
			String cities[]=new String[len];  // cities[2881]
			
			for(int r=0,i=0;r<ob.citystate.length;r++)  // r=0  i=0  r<length
				for(int c=0;c<ob.citystate[r].length;c++)  // c=0 1;c<length
				{
					cities[i++]=ob.citystate[r][c];  // cities[0]=citystate[0][0] , i++
				}
			return cities;
		}
		
		
		public static void main(String[] args) 
		{
			EmpCityAndState cd= new EmpCityAndState();
			cd.getCityList();
//			cd.fetchcities("Haryana");
//			cd.fetchState("panipat");
			
		}
}
