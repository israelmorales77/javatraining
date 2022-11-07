package jdbc.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	private static final String insertStmt3 = "INSERT INTO employee VALUES (?, ?, ?, ?)";
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
		
		//Prepared statement using ? as a parameter
		
		PreparedStatement stmt2 = myConnection.prepareStatement(insertStmt3);
		stmt2.setInt(1, 1008);
		stmt2.setString(2, "Mike");
		stmt2.setInt(3, 45);
		stmt2.setString(4, "PMO");
		
		int psResult = stmt2.executeUpdate();
		
		switch(psResult)
		{
			case 0: System.out.println("Inserted using prepared statement");
				break;
			default: System.out.println("Some kind of error happened");
				break;
		}
		
		//Query to show select database columns
		
		ResultSet rows = stmt.executeQuery(selectStmt);
		
		while(rows.next())
		{
			System.out.println("The employee ID is: " + rows.getInt("id"));
			System.out.println("The employee's Name is: " + rows.getString("name"));
			System.out.println("The employee's Department is: " + rows.getString("dept"));
		}
		
		
	}

}
