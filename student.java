package database;

/**
 * 
 */
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class student implements Serializable{
	private String sid,spw,sname,sclass,major;

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSpw() {
		return spw;
	}

	public void setSpw(String spw) {
		this.spw = spw;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public student(String sid, String spw, String sname,String sclass,String major) {
		super();
		this.sid = sid;
		this.spw = spw;
		this.sname = sname;
		this.sclass=sclass;
		this.major=major;
	}
	public ArrayList<result> viewallresult() throws SQLException, ClassNotFoundException {
		ArrayList<result> results=new ArrayList<result>();
		String sql="select * from result where sid='"+sid+"'";
		ResultSet rs=connectiondatabase.getState().executeQuery(sql);
		while(rs.next()){
			results.add(new result(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
		}
		return results;
	}
	public void Addstudent(student stu) throws SQLException, ClassNotFoundException{
		String sql="insert into student(sid,spw,sname,class,major) values("+sid+",'"+spw+"','"+sname+"','"+sclass+"','"+major+"')";
		connectiondatabase.getState().executeUpdate(sql);
	}
}
