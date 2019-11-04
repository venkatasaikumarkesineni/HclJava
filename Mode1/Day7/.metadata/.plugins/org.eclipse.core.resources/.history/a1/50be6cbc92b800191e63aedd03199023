package com.hcl.mail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserAuth {
	public static void main(String[] args) {
		String user,pwd;
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the user name and password");
		user=sc.nextLine();
		pwd=sc.nextLine();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice",
					"root","root");
			String cmd="select * from users where username=? and password=?";
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setString(1, user);
			pst.setString(2,pwd);
		ResultSet rs=pst.executeQuery();
		if(rs.next())
		{
			System.out.println("correct credentials");
		}
		else
		{
			System.out.println("incorrect credentials");
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
