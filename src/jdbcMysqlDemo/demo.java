package jdbcMysqlDemo;
import java.sql.Connection;	
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class demo {

	public static void main(String[] args) {
		/*	String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String username="root";
		String password="";

		try {//Register the driver class
	         Class.forName("com.mysql.cj.jdbc.Driver"); //Register the driver class


	         Connection connection = DriverManager.getConnection(url,username,password); //Create connection

	         Statement statement=connection.createStatement(); //Create statement
	         ResultSet resultSet12=statement.executeQuery("select count(*) as total from student"); //Execute quaries
	         resultSet12.next();
	        int count= resultSet12.getInt("total");
	        // int count= resultSet12.getInt(1);
	       System.out.println(count);
	       count++;
	       PreparedStatement pstmt = connection.prepareStatement("INSERT INTO `student`(id,name,age) VALUES (?, ?, ?)");
	       pstmt.setInt(1, count);
	       pstmt.setString(2, "arjun");
	       pstmt.setInt(3, 15);
	    // Similarly for the remaining 4 

	    // And then do an executeUpdate
	    pstmt.executeUpdate();
	       //  int resultSet=statement.executeUpdate("insert into student (id,name,age) values("+ count +"'adi','12')"); //Execute quaries
	         ResultSet resultSet1=statement.executeQuery("select * from student"); //Execute quaries

	         while (resultSet1.next()) {//Execute quaries
	        	 System.out.println(resultSet1.getInt( 1 )+" "+resultSet1.getString( 2 )+" "+ resultSet1.getInt( 3 )); //Execute quaries
	         }//Execute quaries

	         connection.close(); //Close connection
		}//Register the driver class
		catch(Exception e) {//Register the driver class
			System.out.print(e);//Register the driver class
		}*/

		String url="jdbc:mysql://localhost:3306/food";
		String username="root";
		String password="";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//Register driver class
			//	show();


			Connection connection = DriverManager.getConnection(url,username,password);//create connection

			Statement stmt=connection.createStatement();

			//	String sql = "CREATE TABLE bache" + "(Sno INTEGER not NULL," + "Name VARCHAR(255)," + "Age INTEGER," + "Branch VARCHAR(255)," + "Address VARCHAR(255)," + "PRIMARY KEY(Sno))";

			//	stmt.execute(sql);
			//	ResultSet rset = stmt.executeQuery("select * from Bache");
			//	  int count= rset.getInt("total");
			//		count++;
			// String  sql = "insert into Bache values (1, 'Jatin', 12, 'cs','varanas')";
			// sql = "insert into Bache values ( 2,'sureah', 12, 'ee','varanasi')";
			//   sql = "insert into Bache values (3, 'Jatien', 52, 'cs','varanasi')";
			//  sql = "insert into Bache values ( 4,'Jatins', 15, 'ms','varanasi')";
			//String	sql = "insert into Bache values ( 4,'Jatins', 15, 'ms',)";

			//String sql ="delete from Bache where Sno = 4";
			//String sql ="update bache set age = 14 where Sno = 3";
			//	String sql = "alter table bache add address varchar(255)";
			//	String  sql = "insert into Bache values (1, 'Jatin', 12, 'cs','varanasi')";

			for (int i = 1; i<=100; i++) {

				String sql ="Select Sno from bache where Sno = "+i;

				// sql = "insert into Bache values ("+i+", 'Jatin', 12, 'cs','varanas')";


				 
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


			/*try {
			Class.forName("com.mysql.cj.jdbc.Driver");//Register driver class

			Connection connection=DriverManager.getConnection(url,username,password);//create connection


		//	String sql = "CREATE TABLE STUDENT" + "(Sno INTEGER not NULL," + "Name VARCHAR(255)," + "Age INTEGER," + "Branch VARCHAR(255)" + "PRIMARY KEY(Sno))";


			//PreparedStatement pstmt=connection.prepareStatement("INSERT INTO `student`(id,name,age) VALUES (?, ?, ?)"); //create statement
	   //	pstmt.setInt(1, 1);
		   //    pstmt.setString(2, "arjun");
		 //     pstmt.setInt(3, 15);

				//String sql = "CREATE DATABASE FOOD";
				//statement.execute(sql);
		//	pstmt.executeUpdate();
				System.out.print("Database created successfully...");
				Statement stmt=connection.createStatement();

				ResultSet rset = stmt.executeQuery("select * from student");

			//	ResultSet rset = pstmt.executeQuery("select * from student");
			//	while(rset.next()) {
			//		 System.out.println(rset.getInt( 1 )+" "+rset.getString( 2 )+" "+ rset.getInt( 3 ));
				}

				connection.close();


				// sql = "insert into STUDENT (Sno,Name,Age,Branch ) values (1,'shyam',20,'cs')";

			//	 sql = "select * from STUDENT";

		//		 System.out.print(sql);
	//			 ResultSet resultSet12=statement.executeQuery("select count(*) as total from student");







			//ResultSet resultSet=statement.executeQuery();//Execute quaries



		}

		catch( Exception e) {
			e.printStackTrace();
		}*/


		}

		//public static void show() {
		//	System.out.println("add");
	}

	//make a loop starts with 1  limit equlas to inserted data
	// it will read how many datas are inserted to our database
	//ten it ill add the old data to new inserted data and make a new limit
	//it will start counting from the last point (ex old data have 10 data then it will start count from 11)
