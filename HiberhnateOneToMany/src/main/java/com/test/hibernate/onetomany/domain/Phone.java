package com.test.hibernate.onetomany.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "PHONE")
public class Phone {

	private Long phoneId;
	private String phoneType;
	private String phoneNumber;

	public Phone() {
	}

	public Phone(String phoneType, String phoneNumber) {
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}
	
	@Id
	@GeneratedValue
	@Column(name = "PHONE_ID")
	public Long getPhoneId() {
		return this.phoneId;
	}

	public void setPhoneId(Long phoneId) {
		this.phoneId = phoneId;
	}

	@Column(name = "PHONE_TYPE", nullable = false, length=10)
	public String getPhoneType() {
		return this.phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	
	@Column(name = "PHONE_NUMBER", nullable = false, length=15)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneType=" + phoneType
				+ ", phoneNumber=" + phoneNumber + "]";
	}

}