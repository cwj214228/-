package database;

import java.sql.*;
import java.util.ArrayList;

public class ModelFactory {
	public static student slogin(String sid,String spw) throws SQLException, ClassNotFoundException{
		student stu=null;
		String sql="select * from student where sid='"+sid+"'"+" and spw='"+spw+"'";
		ResultSet rs=connectiondatabase.getState().executeQuery(sql);
		if(rs.next())
			stu=new student(sid,spw,rs.getString("sname"),"","");
			return stu;
	}
	
	public static teacher tlogin(String tid,String tpw) throws SQLException, ClassNotFoundException{
		teacher tc=null;
		String sql="select * from teacher where tid='"+tid+"'"+" and tpw='"+tpw+"'";
		ResultSet rs=connectiondatabase.getState().executeQuery(sql);
		if(rs.next())
			tc=new teacher(tid,tpw,rs.getString("tname"));
			return tc;
	}
	public static ArrayList<result> viewallresult(student stu) throws SQLException, ClassNotFoundException{
	return stu.viewallresult();
	}
	
	public static ArrayList<student> managestudent(teacher tea) throws SQLException, ClassNotFoundException{
	return tea.managestudent();
	}
	
	public static ArrayList<score> managecourse(teacher tea) throws SQLException, ClassNotFoundException{
		return tea.managecourse();
}
}
