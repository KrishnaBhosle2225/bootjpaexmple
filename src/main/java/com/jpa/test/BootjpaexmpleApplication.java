package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.StudentRepository;
import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.Student;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexmpleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context= SpringApplication.run(BootjpaexmpleApplication.class, args);
		
//		UserRepository userRepository = context.getBean(UserRepository.class);
//		
//		User user = new User();
//		user.setName("Krishna Bhosle");
//		user.setCity("Pune");
//		user.setStatus("COMPLETED");
//		User save = userRepository.save(user);
//		System.out.println(save);
		
		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		
//		INSERTING single Object at a time
//		Student student = new Student();
//		student.setAge(21);
//		student.setName("Krishna Bhosle");
//		student.setCity("Pune");
//		
//		Student s1 = studentRepository.save(student);
//		System.out.println(s1);
		
		
		
		
//		INSERTING MULTIPLE Objects
		Student s1 = new Student();
		s1.setAge(19);
		s1.setName("Bhagesh Bhosle");
		s1.setCity("Pune");
		
		Student s2 = new Student();
		s2.setAge(22);
		s2.setName("Sarvesh Kadlag");
		s2.setCity("Mumbai");
		
		Student s3 = new Student();
		s3.setAge(24);
		s3.setName("Chetan Jadhav");
		s3.setCity("Dombivali");
		
		List<Student> students = List.of(s1, s2, s3);
		Iterable<Student> allStudents = studentRepository.saveAll(students);
		allStudents.forEach(student-> {
			System.out.println(student);
		});
		
		System.out.println("Done");
		
		
	}

}
