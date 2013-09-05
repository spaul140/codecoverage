package com.apigee.coco.samples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataIngestion 
{
	public Connection getConnection() throws SQLException
	{	
		Connection connection = DriverManager.getConnection("jdbc://postgresql");
		return connection;
	}
	
	//@TODO:Test PerformIngestion Functionality By mocking
	public String performIngestion() throws SQLException
	{
		Connection connection = getConnection();
		Statement createStatement = connection.createStatement();
		boolean execute = createStatement.execute("");
		if(execute)
		{
			return "IngestionDoneSuccessfully";
		}
		else
		{
			return "IngestionFailed";
		}
	}
	
	
}
