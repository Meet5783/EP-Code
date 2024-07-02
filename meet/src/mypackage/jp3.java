// Program to insert the record to underlying table.
package mypackage;
import java.sql.*;
public class jp3 {
	public static void main(String[] args) {
		Connection conn = null ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn= DriverManager.getConnection(
					"jdbc:mysql://localhost:3386/classicmodels?useSSL=false",
					"root", "password");
			        Statement stmt = conn.createStatement();
			        String SQL = "insert into empmast "
			        		+ "values(102, 'kalpesh', 'Shah', '8975442665',"
			        		+ "'Kalpesh@aol.com', 'Programmer', 10)";
			        int rowaffected = stmt.executeUpdate(SQL);
			        if(rowaffected>0) {
			        	System.out.println("Record inserted sucessfully !");			        	
			    	}
			        else {
			        	System.out.println("Error in insert !");
			        }
			        conn.close();
		}
		catch (Exception e) {
			System.out.println("Error :" + e.getMessage());
		}
	}
}
