package com.hcl.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeptInsert {
	private int deptno;
	private String dname;
	private String loc;
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	public String insertDept(){
		Connection con=DaoConnection.getConnection();
		String cmd="insert into dept values(?,?,?)";
		String result="";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, deptno);
			pst.setString(2, dname);
			pst.setString(3, loc);
			pst.executeUpdate();
			result="Record Inserted...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
