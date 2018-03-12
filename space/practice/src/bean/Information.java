package bean;

public class Information {
	private String sno;
	private String sname;
	private String ssex;
	private String sbirthday;
	private String province;
	private String character;
	private String phenonumber;
	public Information() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Information(String sno, String sname, String ssex, String sbirthday, String province, String character,
			String phenonumber) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.ssex = ssex;
		this.sbirthday = sbirthday;
		this.province = province;
		this.character = character;
		this.phenonumber = phenonumber;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public String getSbirthday() {
		return sbirthday;
	}
	public void setSbirthday(String sbirthday) {
		this.sbirthday = sbirthday;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	public String getPhenonumber() {
		return phenonumber;
	}
	public void setPhenonumber(String phenonumber) {
		this.phenonumber = phenonumber;
	}
	
	
}
