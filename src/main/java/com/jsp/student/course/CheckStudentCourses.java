package com.jsp.student.course;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CheckStudentCourses {
public static void main(String[] args) {
	
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Student s=new Student();
	s.setName("shivani");
	s.setEmail("shivaniwagh@mail.com");
	
	
	Course course1=new Course();
	course1.setName("Java");
    course1.setDuration(1);
	
    Course course2=new Course();
	course2.setName("SQL");
    course2.setDuration(1);
	
    Course course3=new Course();
	course3.setName("Web Tech");
    course3.setDuration(1);
	
    Course course4=new Course();
	course4.setName("Advanced Java");
    course4.setDuration(1);
	
	
	ArrayList<Course> courses=new ArrayList<Course>();
	courses.add(course1);
	courses.add(course2);
	courses.add(course3);
	courses.add(course4);

	s.setCourses(courses);
	
	entityTransaction.begin();
	entityManager.persist(s);
	entityManager.persist(course1);	
	entityManager.persist(course2);
	entityManager.persist(course3);
	entityManager.persist(course4);
    entityTransaction.commit();	
}

	
}
