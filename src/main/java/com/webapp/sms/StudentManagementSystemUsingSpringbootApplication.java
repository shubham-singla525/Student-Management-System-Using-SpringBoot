package com.webapp.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.webapp.sms.entity.Student;
import com.webapp.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemUsingSpringbootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemUsingSpringbootApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student1 = new Student("Shubham","Singla","singlashubham49@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Manish","Singla","manishsingla177@gmail.com");
//		studentRepository.save(student2);
//		
//		
//		Student student3 = new Student("Priya","Aggarwal","aggPriya23@gmail.com");
//		studentRepository.save(student3);
		
	}

}
