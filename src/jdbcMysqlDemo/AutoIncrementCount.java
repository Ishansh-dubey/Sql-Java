package jdbcMysqlDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AutoIncrementCount {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/food";
		String username="root";
		String password="";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//Register driver class
			Connection connection = DriverManager.getConnection(url,username,password);//create connection
			Statement stmt=connection.createStatement();
			
			//		String sql = "CREATE TABLE dubey" + "(Sno INTEGER not NULL INT AUTO_INCREMENT," + "Name VARCHAR(255)," + "Age INTEGER," + "Branch VARCHAR(255)," + "Address VARCHAR(255)," + "PRIMARY KEY(Sno))";
			String sql="Select count(*) from dubey";
			ResultSet rset = stmt.executeQuery(sql);
			
			if(rset.next()) {
				//	System.out.println(rset.getInt(1));
				
				int count = rset.getInt(1);
				count++;
				sql = "insert into dubey values ("+count+",'Jatins', 15, 'ms','varanasi')"; 
				stmt.executeUpdate(sql);
			}
			connection.close();
		}
		
		catch( Exception e) {
			e.printStackTrace();
		}
	}
}