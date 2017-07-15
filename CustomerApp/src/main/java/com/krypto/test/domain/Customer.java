package com.krypto.test.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer", schema = "system")
public class Customer {

	@Id
	@Column(name = "CNO")
	private Long cid;

	@Column(name = "cname")
	private String cname;

	@Column(name = "cphone")
	private Long cphone;

	@Column(name = "clocation")
	private String clocation;
	
	public Customer() {
	}
	
	

	public Customer(Long cid, String cname, Long cphone, String clocation) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cphone = cphone;
		this.clocation = clocation;
	}



	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Long getCphone() {
		return cphone;
	}

	public void setCphone(Long cphone) {
		this.cphone = cphone;
	}

	public String getClocation() {
		return clocation;
	}

	public void setClocation(String clocation) {
		this.clocation = clocation;
	}

}
