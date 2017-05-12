package com.niit.modeldto;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Catagory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int catyid;
	private String catyname;
	private String catydesc;
	private boolean enable=true;
	public int getCatyid() {
		return catyid;
	}
	public void setCatyid(int catyid) {
		this.catyid = catyid;
	}
	public String getCatyname() {
		return catyname;
	}
	public void setCatyname(String catyname) {
		this.catyname = catyname;
	}
	public String getCatydesc() {
		return catydesc;
	}
	public void setCatydesc(String catydesc) {
		this.catydesc = catydesc;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	

}
