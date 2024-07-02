package Program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Example2 {
	public static void main(String[] args) {
		try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection con = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/classicmodels?useSSL=false","root","mvp@8081");
					
					Statement stmt = con.createStatement();
					String SQL = "insert into div5stud values(1,'Meet','9824198241')";
					
					int rowseffected = stmt.executeUpdate(SQL);
					if(rowseffected > 0) 
						System.out.println("Record inserted succcessfully!");

	
				}catch(Exception ex) {
					System.out.println("Error :" + ex.getMessage());
				}

			}

}
