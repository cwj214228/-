package database;
/**
 * 
 * @author ASUS
 *sid,sname,kname,xuefen,chengji
 */
public class result {
	private String sid,sname,kname,xuefen,chengji;

	public result(String sid, String sname, String kname, String xuefen,String chengji) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.kname = kname;
		this.xuefen = xuefen;
		this.chengji=chengji;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
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

	public String getChengji() {
		return chengji;
	}

	public void setChengji(String chengji) {
		this.chengji = chengji;
	}
	
}
