package com.test.hibernate.onetoone.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.hibernate.onetoone.domain.Student;

@Repository("studentDao")
public class StudentDao implements IStudentDao {

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Serializable insertStudent(Student student) {
		return getCurrentSession().save(student);

	}

	@Override
	public Student getStudent(Long studentId) {
		Student student = (Student) getCurrentSession().get(Student.class,
				studentId);
		return student;
	}
	
	@Override
	public List<Student> getAllStudent() {
		List<Student> students= new ArrayList<Student>() ;
		Query query = getCurrentSession().createSQLQuery("select STUDENT_ID as studentId,STUDENT_NAME as studentName from student")
				.setResultTransformer(Transformers.aliasToBean(Student.class)); 
		students = query.list() ;
		return students;
	}

	/*@Override
	public List<Student> getAllStudent() {
		List<Student> students= new ArrayList<Student>() ;
		Criteria criteria = getCurrentSession().createCriteria(Student.class) ;
			
		ProjectionList projectionList = Projections.projectionList() ;
		projectionList.add(Projections.property("studentId")) ;
		projectionList.add(Projections.property("studentName")) ;
		
		criteria.setProjection(projectionList) ;
		
		List<Object[]> objArray = criteria.add(Restrictions.gt("studentId", 1L))
				.list();

			for (Object[] objects : objArray) {
				System.out.println("--------------------------------");
				for (Object object : objects) {
					System.out.println(object);
				}
			}
		return students;
	}*/

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
