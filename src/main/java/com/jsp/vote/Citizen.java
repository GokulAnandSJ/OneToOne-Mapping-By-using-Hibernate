package com.jsp.vote;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Citizen {
	
	@Id
	private int cId;
	private String cName;
	private int cContact;
	private int cAge;
	
	@OneToOne
	private Vote v ;
	
	public int getcAge() {
		return cAge;
	}
	public void setcAge(int cAge) {
		this.cAge = cAge;
	}
	public Vote getV() {
		return v;
	}
	public void setV(Vote v) {
		this.v = v;
	}
	
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcContact() {
		return cContact;
	}
	public void setcContact(int cContact) {
		this.cContact = cContact;
	}
	
}
