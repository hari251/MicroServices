package com.example.demo;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	// http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Hari", "Prakash");
	}
	
	// http://localhost:8080/students
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ramesh","Goyal"));
		students.add(new Student("Anuppam","Thappar"));
		students.add(new Student("Kishore","Nair"));
		students.add(new Student("Mukesh","Sharma"));
		students.add(new Student("Mandeep","Singh"));
		return students;
	}
	
	// http://localhost:8080/student/ramesh/goyal	
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return new Student(firstName,lastName);
	}
	
	//build REST API to handle query parameters 
	// http://localhost:8080/student/query?firstName=Ramesh&lastName=Goyal
		@GetMapping("/student/query")
		public Student studentQueryParam(
				@RequestParam (name="firstName") String firstName,
				@RequestParam (name="lastName") String lastName) {
			return new Student(firstName,lastName);
	}
	
}

