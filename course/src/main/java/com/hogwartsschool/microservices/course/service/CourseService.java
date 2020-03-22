package com.hogwartsschool.microservices.course.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import com.hogwartsschool.microservices.course.models.Course;

public interface CourseService {
		
	public abstract ResponseEntity<List<Course>> GetAllCourses();
	public abstract ResponseEntity<Course> InsertCourse(Course course);
	public abstract ResponseEntity<Course> FindCourseById(int id);
	public abstract ResponseEntity<Course> FindSpecificCourseInfo(int id, String infoAttribute);
	public abstract ResponseEntity<Course> UpdateCourse(Course course, int id);
	public abstract ResponseEntity<?> DeleteCourse(int id);
	

}

	


