package com.jsp.vote;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vote {
	
	@Id
	private int vId;
	private String state;
	private String vGovtType;
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getvGovtType() {
		return vGovtType;
	}
	public void setvGovtType(String vGovtType) {
		this.vGovtType = vGovtType;
	}
}
