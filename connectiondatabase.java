package database;

import java.sql.*;


public class connectiondatabase {
	private static Statement stat;
	private static void init() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
	    String url="jdbc:mysql://127.0.0.1:3306/chengji?characterEncoding=utf8&user=root&password=5201314";
	    Connection con=DriverManager.getConnection(url);
	    stat=con.createStatement();
	    url="use chengji";
	    stat.executeUpdate(url);
	}
	public static Statement getState() throws SQLException, ClassNotFoundException{
		if(stat==null)
			init();
		return stat;
		
	}
	
}
