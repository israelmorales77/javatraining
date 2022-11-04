package jdbc.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBPreparedStatements 
{

	public static final String DB_URL = "jdbc:mysql://localhost:3306/java_training";
	public static final String USER = "root";
	public static final String PASSWORD = "Simplilearn";
	public static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//register the driver
		System.out.println("Setting DB Connection");
		Class.forName(DRIVER_CLASS);
		
		//set db conn string
		
		//parameter needed are the database url, username and password
		
		Connection myConnection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		System.out.println("Connection to the DB established");
		

	}

}
