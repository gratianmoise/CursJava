package curs7.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
	
	static final String URL = "jdbc:mysql://keytraining-demo.c050jeowbe1q.eu-central-1.rds.amazonaws.com:3306/KeyTraining";
	static final String USER = "demouser";
	static final String PASS = "demouser";
	static final String QUERY = "select*from products where ProductName like \"Chang\";";

	public static void main(String[] args) {
		
		DQuery();

	}

	public static void DQuery() {
		
		try {
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			
			if(conn != null) {
				System.out.println("Conexiune cu succes! ");
				
				}
			
			Statement statement =  conn.createStatement();
			
			ResultSet result = statement.executeQuery(QUERY);
			
			while(result.next()) {
				
				String product =  result.getString("ProductName");
				System.out.println(product);
				
			}
			
		} catch (SQLException e) {
			
			System.out.println("Nu s-a putut face conexiunea!");
			

			e.printStackTrace();
		}
		
	}
}
