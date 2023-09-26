package jdbcMysqlDemo;
import java.sql.Connection;	
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManualAutoIncrement {
	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/food";
		String username="root";
		String password="";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//Register driver class
			Connection connection = DriverManager.getConnection(url,username,password);//create connection

			Statement stmt=connection.createStatement();

			//	String sql = "CREATE TABLE bache" + "(Sno INTEGER not NULL," + "Name VARCHAR(255)," + "Age INTEGER," + "Branch VARCHAR(255)," + "Address VARCHAR(255)," + "PRIMARY KEY(Sno))";

			for (int i = 1; i<=100; i++) {

				String sql ="Select Sno from bache where Sno = "+i;
				System.out.println(sql);
				ResultSet rset = stmt.executeQuery(sql);
				if(rset.next()) {
					System.out.println(rset.getInt( 1 ));
				}
				else {
					System.out.println(i+"not found");
					sql = "insert into Bache values ( "+i+",'Jatins', 15, 'ms','varanasi')"; 
					stmt.executeUpdate(sql);
					break;
				}
			}
			connection.close();
		}
		catch( Exception e) {
			e.printStackTrace();
		}
	}
}





