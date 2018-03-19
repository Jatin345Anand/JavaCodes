import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
    ///Here first of all load the driver class...
		//step 1 load the driver class...
		//step 2 Create connection...
		//step 3 Do Query....
		///step 4 Execute Query and get the result.....
		// step 5 Cloase all the resourses...
   String driverclassname="com.mysql.jdbc.Driver";
   // oracle .jdbc.driver.OracleDriver..
   //org.postgresql.Driver
   //com.mysql.jdbc.Driver....
   //jdbc:oracle:thin:@localhost:1521:
   //jdbc:mysql://localhost:3306/dbname....
   Class.forName(driverclassname);
   System.out.println("Enter the database name \n1.quizdb  \n2.billingdb  \n3.information_schema \n4.mysql \n5.test");
   Scanner scanner = new Scanner(System.in);
   	String dbname =scanner.next();
   if(dbname.equals("quizdb")){
	   
	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizdb","root","jaibajrangbali");
	 	System.out.println("Select table name .....\n1.userlogin \n2.users \n3.admins");
		String tablename = scanner.next();
      if(tablename .equals("users")){
    	  Statement stmt =con.createStatement();
    		
    	  ResultSet rs = stmt.executeQuery("select * from users");
    		while(rs.next()){
    			System.out.println(rs.getInt("id")+"    "+rs.getString("password")+"       "+rs.getString("name")+"   "+rs.getDouble("salary"));
    		}	
      		System.out.println("before close 1rs "+tablename);
      	  
    		rs.close();					  
    		stmt.close();
    		System.out.println("after close 1 rs "+tablename);
      }
      else if(tablename.equals("userlogin")){
    	  System.out.println("in u");
    	    
    	  ResultSet rs = stmt.executeQuery("select * from userlogin");
    		while(rs.next()){
    			System.out.println(rs.getInt("id")+"   "+rs.getString("name")+"   "+rs.getDouble("price"));
    		}	
      		System.out.println("before close 2rs "+tablename);
      	  
          rs.close();
    		System.out.println("after close 2rs "+tablename);
    		  
      }
      else if(tablename.equals("admins")){
    	  System.out.println("in a");
    	  ResultSet rs = stmt.executeQuery("select * from admins");
  		while(rs.next()){
  			System.out.println(rs.getInt("id")+"   "+rs.getString("name")+"   "+rs.getDouble("salary"));
  		}	
  		rs.close();
      }
		
		stmt.close();
		con.close();
		
   }
   else if(dbname.equals("billingdb")){
	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billingdb","root","jaibajrangbali");
	   Statement stmt =con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from customer");
		
		while(rs.next()){
			System.out.println(rs.getInt("id")+"   "+rs.getString("name")+"   "+rs.getDouble("salary"));
		}	
		rs.close();
		stmt.close();
		con.close();
		
   }
   else if(dbname.equals("mysql")){
//	   System.out.println("Enter the table name \n1.db  \n2.func  \n3.columns_priv \n4.general_log  \n5.host");
//	    	String tablename =scanner.next();
//	    if(tablename.equals("db")){
//	    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","jaibajrangbali");
//	 	   Statement stmt =con.createStatement();
//	 		ResultSet rs = stmt.executeQuery("select * from slow_log");
//	 		while(rs.next()){
//	 			System.out.println(rs.getInt("id")+"   "+rs.getString("name")+"   "+rs.getDouble("salary"));
//	 		}	
//	 		rs.close();
//	 		stmt.close();
//	 		con.close();
//	 	 	
	    }
	   	
   }

	}


