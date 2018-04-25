package database;

import java.sql.SQLException;

/**
 * 
 * @author ASUS
 *
 */

public class score {
	String id;
	String kname;
	String xuefen;
	String tname;
	public score(String id, String kname, String xuefen, String tname) {
		super();
		this.id = id;
		this.kname = kname;
		this.xuefen = xuefen;
		this.tname = tname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public String getXuefen() {
		return xuefen;
	}
	public void setXuefen(String xuefen) {
		this.xuefen = xuefen;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public void Addcourse(score sc) throws SQLException, ClassNotFoundException {
		String sql="insert into score(id,kname,xuefen,tname) values("+Integer.parseInt(id)+",'"+kname+"','"+xuefen+"','"+tname+"')";
		connectiondatabase.getState().executeUpdate(sql);
	}
	public void Deledecourse(score sc) throws SQLException, ClassNotFoundException{
		String sql="delete from score where id='"+id+"'";
		connectiondatabase.getState().executeUpdate(sql);
	}
	public void Changecourse(score sc) throws SQLException, ClassNotFoundException{
		String sql="update score set kname='"+kname+"', xuefen='"+xuefen+"', tname='"+tname+"' where id='"+id+"'";
		connectiondatabase.getState().executeUpdate(sql);
	}
}
