// Program to get the input from user and perform the insert operation to underlying table. 


package mypackage;
import java.sql.*;
import java.util.Scanner;
public class jp6 {
	public static void main(String[] args ) {
		int mEmpno, mDeptno;
		String mFname, mLname, mMobile, mEmail, mJob;
		
		Scanner scn = new Scanner(System.in);
		 
		System.out.println("Enter the valid employee number :");
		mEmpno = scn.nextInt();
		System.out.println("Enter the valid employee fname :");
		mFname = scn.next();
		System.out.println("Enter the valid employee lname :");
		mLname = scn.next();
		System.out.println("Enter the valid employee mobile :");
		mMobile = scn.next();
		System.out.println("Enter the valid employee email :");
		mEmail = scn.next();
		System.out.println("Enter the valid employee job :");
		mJob = scn.next();
		System.out.println("Enter the valid employee deptno :");
		mDeptno = scn.nextInt();
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
	    	conn = DriverManager.getConnection(
	        "jdbc:mysql://localhost:3306/classicmodels/useSSL=false", "root", "password"); 
	    	String SQL = "insert into empmast values(?,?,?,?,?,?,?)";
	    	PreparedStatement pstmt =conn.prepareStatement(SQL); 
	    	// set the value to each parameter
	    	pstmt.setInt(1, mEmpno);
	    	pstmt.setString(2, mFname);
	    	pstmt.setString(3, mLname);
	    	pstmt.setString(4, mMobile);
	    	pstmt.setString(5, mEmail);
	    	pstmt.setString(6, mJob);
	    	pstmt.setInt(7, mDeptno);
	    	
	    	int rowaffected = pstmt.executeUpdate(); 
		       if(rowaffected > 0) { 
		    	   System.out.println("Record inserted successfully !");
		       }
		       else {
		    	   System.out.println("Error in insert !"); 
		       }
		       conn.close();
		    }
		    catch (Exception e) { 
		    	System.out.println("Error:"+ e.getMessage());
		    }
	  }
}
