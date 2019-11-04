package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentSearch {
	public static void main(String[] args) {
		int deptno;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the department no");
		deptno=sc.nextInt();
		String cmd="select * from department where deptno=?";
		Connection con=DaoConnection.getConnection();
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1,deptno);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				System.out.println("department number is " + rs.getInt("deptno"));
				System.out.println("department name is " + rs.getString("dname"));
				System.out.println("location is "+ rs.getString("loc"));
				System.out.println("head is " + rs.getString("head"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
