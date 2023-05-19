package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quatation")


public class Quatation {
	
	@Id
	private String quatationid;
	private String eventid;
	private String vendorid;
	private Long amount ;

	public String getQuatationid() {
		return quatationid;
	}

	public void setQuatationid(String quatationid) {
		this.quatationid = quatationid;
	}

	public String getEventid() {
		return eventid;
	}

	public Quatation(String quatationid, String eventid, String vendorid, Long amount) {
		super();
		this.quatationid = quatationid;
		this.eventid = eventid;
		this.vendorid = vendorid;
		this.amount = amount;
	}

	public void setEventid(String eventid) {
		this.eventid = eventid;
	}

	public String getVendorid() {
		return vendorid;
	}

	public void setVendorid(String vendorid) {
		this.vendorid = vendorid;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Quatation() {
		super();
		// TODO Auto-generated constructor stub
	}
}
	
	
	
	
	
	
	


