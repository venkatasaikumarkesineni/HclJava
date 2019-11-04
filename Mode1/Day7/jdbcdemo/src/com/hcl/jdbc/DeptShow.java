package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptShow {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice",
					"root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from dept");
			while(rs.next()){
				System.out.println("department  no " + rs.getInt("deptno"));
				System.out.println("department name" + rs.getString("dname"));
				System.out.println("loc is " + rs.getString("loc"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
