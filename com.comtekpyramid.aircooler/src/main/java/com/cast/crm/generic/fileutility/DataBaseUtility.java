package com.cast.crm.generic.fileutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DataBaseUtility {
	 Connection con;
 public void getDBConnection(String url, String UName, String PWD) throws SQLException {
	 
	  try {
	  Driver driver = new Driver();
	 DriverManager.registerDriver(driver);
	con =  DriverManager.getConnection(url, UName, PWD);
	  }catch(Exception e) {}
 }
}
