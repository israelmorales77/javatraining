package jdbc.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBManagement 
{

	public static final String DB_URL = "jdbc:mysql://localhost:3306";
	public static final String USER = "root";
	public static final String PASSWORD = "Simplilearn";
	public static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	
	public static final String CREATEDB = "create database Test_DB"; 
	public static final String DROPDB = "drop database Test_DB";
	
	public static void main(String[] args) throws SQLException 
	{
		
		SQLException sqex = new SQLException();
		
		Connection myConnection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		System.out.println("Connection to the DB established");
		
		int crQry = -1;
		int drQry = -1;
		
		PreparedStatement myStmt = myConnection.prepareStatement(CREATEDB);
		PreparedStatement anotherStmt = myConnection.prepareStatement(DROPDB);
		
		crQry = myStmt.executeUpdate();
				
		switch(crQry)
		{
			case 0: System.out.println("DB Created");
				break;
			default: System.out.println("Some kind of error happened");
					 sqex.printStackTrace();
				break;
		}
		
		drQry = anotherStmt.executeUpdate();
		
		switch(drQry)
		{
			case 0: System.out.println("DB Dropped");
				break;
			default: System.out.println("Some kind of error happened");
					 sqex.printStackTrace();
				break;
		}

	}

}
