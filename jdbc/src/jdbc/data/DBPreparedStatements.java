package jdbc.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBPreparedStatements 
{

	public static final String DB_URL = "jdbc:mysql://localhost:3306/java_training";
	public static final String USER = "root";
	public static final String PASSWORD = "Simplilearn";
	public static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	
	private static final String insertStmt = "INSERT INTO employee VALUES (1005, 'Tony', 30, 'IT')";
	private static final String insertStmt2 = "INSERT INTO employee VALUES (1006, 'Anna', 30, 'IT')";
	private static final String selectStmt = "SELECT * FROM employee";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//register the driver
		System.out.println("Setting-up DB Connection");
		Class.forName(DRIVER_CLASS);
		
		//set db conn string
		
		//parameter needed are the database url, username and password
		
		Connection myConnection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		
		if(myConnection != null)
		{
			System.out.println("Connection to the DB established");
		}
		
		Statement stmt = myConnection.createStatement();
		//stmt.executeUpdate(insertStmt2);
		ResultSet rows = stmt.executeQuery(selectStmt);
		
		while(rows.next())
		{
			System.out.println("The employee ID is: " + rows.getInt("id"));
			System.out.println("The employee's Name is: " + rows.getString("name"));
			System.out.println("The employee's Department is: " + rows.getString("dept"));
		}
		
		
	}

}
