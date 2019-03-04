package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataBase {
	public static ArrayList <String> getDataTable (String SQLQuaries, String columname) throws Exception{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/mukta","hr","hr");
	Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	ResultSet rs = st.executeQuery(SQLQuaries);
		ArrayList<String> columValue = new ArrayList <String>();
		while(rs.next()) {
			columValue.add(rs.getString(columname));	
		
		}
		System.out.println(columValue);
		connection.close();
		return columValue;
	}

}
