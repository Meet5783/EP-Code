/* Program to display all the records from emp table .*/
package mypackage;
import java.sql.*;
public class jp2 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/classicmodeis?useSSL=false",
					"root", "password");
			     Statement stmt = conn.createStatement();
			     ResultSet result = stmt.executeQuery("select * from emp");
			     System.out.println("-----------------------------------------------");
			     System.out.println("Empno\tEname\tDesignation");
			     System.out.println("----------------------------------");
			     while(result.next()) {
			    	 System.out.println(result.getInt(1)+"\t"
			    			 + result.getString(2)+ "\t"
			    			 +result.getString(3));
			}
			     conn.close();
		}
		catch (Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}
}
