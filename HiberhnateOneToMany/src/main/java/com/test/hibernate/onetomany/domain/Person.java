package com.test.hibernate.onetomany.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person {

		private Long personId;
		private String personName;
		private Set<Phone> personPhoneNumbers = new HashSet<Phone>(0);

		public Person() {
		}

		public Person(String personName, Set<Phone> personPhoneNumbers) {
			this.personName = personName;
			this.personPhoneNumbers = personPhoneNumbers;
		}

		@Id
		@GeneratedValue
		@Column(name = "PERSON_ID")
		public Long getPersonId() {
			return this.personId;
		}

		public void setPersonId(Long personId) {
			this.personId = personId;
		}

		@Column(name = "PERSON_NAME", nullable = false, length = 100)
		public String getPersonName() {
			return this.personName;
		}

		public void setPersonName(String personName) {
			this.personName = personName;
		}

		@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
		@JoinTable(name = "PERSON_PHONE", joinColumns = { @JoinColumn(name = "PERSON_ID") }, inverseJoinColumns = { @JoinColumn(name = "PHONE_ID") })
		public Set<Phone> getPersonPhoneNumbers() {
			return this.personPhoneNumbers;
		}

		public void setPersonPhoneNumbers(Set<Phone> personPhoneNumbers) {
			this.personPhoneNumbers = personPhoneNumbers;
		}

		@Override
		public String toString() {
			return "Person [personId=" + personId + ", personName="
					+ personName + ", personPhoneNumbers=" + personPhoneNumbers
					+ "]";
		}
		
		

	}