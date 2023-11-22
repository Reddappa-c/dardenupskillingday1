package com.dardentask.student;

import com.dardentask.student.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StudentApplicationTests {

	@Test
	void contextLoads() {
		String name = "Reddy";
		int age = 23;
		int salary = 50000;

		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		student.setSalary(salary);

		assertEquals(name, student.getName());
		assertEquals(age, student.getAge());
		assertEquals(salary, student.getSalary());
	}

}
