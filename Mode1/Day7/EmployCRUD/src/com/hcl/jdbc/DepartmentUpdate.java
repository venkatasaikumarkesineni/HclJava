package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentUpdate {
	public static void main(String[] args) {
		int deptno;
		String dname,loc,head;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the department humber");
		deptno=sc.nextInt();
		System.out.println(" enter thedepartment name");
		dname=sc.next();
		System.out.println("enter the location");
		loc=sc.next();
		System.out.println("enter the head");
		head=sc.next();
		String cmd="update department set head=?,dname=?,loc=? where deptno=?";
		Connection con=DaoConnection.getConnection();
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setString(1, head);
			pst.setString(2, dname);
			pst.setString(3, loc);
			pst.setInt(4, deptno);
			pst.executeUpdate();
			System.out.println("**record updated**");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

