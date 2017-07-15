package com.demo.spring.ioc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.spring.ioc.domain.Student;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Student getStudent(Student student) {
		
	RowMapper<Student>	studRowMapper = new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				Student student = new Student();
				student.setStudentNo(rs.getLong(1));
				student.setStudentName(rs.getString(2));
				student.setTotalMarks(rs.getLong(3));
				return student;
			}
	};

		String sql = "select sno,sname,marks from Student where sno=?";
		
		Student resStudent = (Student) jdbcTemplate.queryForObject(sql,
				new Object[] { student.getStudentNo() },studRowMapper);
		return resStudent;
	}

	public List<Student> getAllStudents() {
		String sql = "select * from Student";
		
		

		List<Student> employeeList = jdbcTemplate.query(sql,
				new ResultSetExtractor<List<Student>>() {
					public List<Student> extractData(ResultSet rs)
							throws SQLException, DataAccessException {
						List<Student> list = new ArrayList<Student>();
						while (rs.next()) {
							Student student = new Student();
							student.setStudentNo(rs.getLong(1));
							student.setStudentName(rs.getString(2));
							student.setTotalMarks(rs.getLong(3));
							list.add(student);
						}
						return list;
					}
				});
		return employeeList;
	}

	public void insert(Student student) {
		String sql = "insert into Student values(?,?,?)";
		jdbcTemplate.update(sql,
				new Object[] { student.getStudentNo(),
						student.getStudentName(), student.getTotalMarks() });
	}

	public void update(Student student) {
		String sql = "update Student set sname=?, marks=?  where sno=?";
		jdbcTemplate.update(sql,
				new Object[] { student.getStudentName(), student.getTotalMarks(),  student.getStudentNo() });
	}

	public void delete(Student student) {
		String sql = "delete Student where sno=?";
		jdbcTemplate.update(sql, new Object[] { student.getStudentNo() });

	}

}
