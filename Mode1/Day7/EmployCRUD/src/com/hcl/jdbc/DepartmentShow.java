package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentShow {
	public static void main(String[] args) {
     int deptno;
     String dname,loc,head;
    String cmd="select * from department";
    Connection con=DaoConnection.getConnection();
    try {
		PreparedStatement pst=con.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.println("department numberis "+ rs.getInt("deptno"));
			System.out.println("department nume is "+ rs.getString("dname"));
			System.out.println("loc is "+ rs.getString("loc"));
			System.out.println("dhead is "+ rs.getString("head"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
}

}
