// program to delete the record to underlying table 
package mypackage;
import java.sql.*;
public class jp5 {
	public static void main(String[] args) {
		Connection conn = null;
	    try {
	    	Class.forName("com.mysql.cj.jdbc.Driver"); 
	    	conn = DriverManager.getConnection(
	        "jdbc:mysql://localhost:3306/classicmodels/useSSL=false", "root", "password"); 
	    	Statement stmt =conn.createStatement(); 
	        String SQL =" delete from empmast where empno = 102";
	       int rowaffected = stmt.executeUpdate(SQL); 
	       if(rowaffected > 0) { 
	    	   System.out.println("Record deleted successfully !");
	       }
	       else {
	    	   System.out.println("Error in delete operation !"); 
	       }
	       conn.close();
	    }
	    catch (Exception e) { 
	    	System.out.println("Error:"+ e.getMessage());
	    }
	  }

}
