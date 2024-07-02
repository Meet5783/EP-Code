// Program to display ResultSet MetaData.
package mypackage;
import java.sql.*;

public class jp7 {
	public static void main(String[] args) {
		Connection conn = null;
	    try {
	    	Class.forName("com.mysql.cj.jdbc.Driver"); 
	    	String connectionUrl= "jdbc:mysql://localhost:3306/classicmodels?useSSL=false";
	    	conn = DriverManager.getConnection(connectionUrl, "root", "password"); 
	    	PreparedStatement pstmt =conn.prepareStatement("select empno, ename, job, hiredate From emp");
	    	ResultSet result = pstmt.executeQuery();
	    	ResultSetMetaData resmd = result.getMetaData();
	    	System.out.println("Total columns: "+ resmd.getColumnCount());
	    	System.out.println("Column Name of 1st column: "+ resmd.getColumnName(1));
	    	System.out.println("Column Type Name of 1st column: "+ resmd.getColumnTypeName(1));
	    	conn.close();
	    }
	    catch (Exception e) {
	    	System.out.println("Error :"+ e.getMessage());
	    }
   }
}
