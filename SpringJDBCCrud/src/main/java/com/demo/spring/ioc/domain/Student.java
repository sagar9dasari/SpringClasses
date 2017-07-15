package com.demo.spring.ioc.domain;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long studentNo;
	private String studentName;
	private Long totalMarks;
	
	public Student() {
	}

	public Student(Long studentNo, String studentName, Long totalMarks) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.totalMarks = totalMarks;
	}

	public Long getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(Long studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Long getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(Long totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName="
				+ studentName + ", totalMarks=" + totalMarks + "]";
	}

}
