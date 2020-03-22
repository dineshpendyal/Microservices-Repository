package com.hogwartsschool.microservices.course.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

import com.hogwartsschool.microservices.course.models.Course;
import com.hogwartsschool.microservices.course.service.CourseServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/course-api")
public class CourseController {
	
	
	@Autowired
	CourseServiceImpl courseserviceobj;
	
	
@GetMapping("/get-all-courses")
public ResponseEntity<List<Course>>getAllCourses()
	{
		
		return courseserviceobj.GetAllCourses();
	}

@PostMapping("/insert-course")
public ResponseEntity<Course> insertCourse(@Validated @RequestBody Course course)
	{
	
	return courseserviceobj.InsertCourse(course);
	
	}

@GetMapping("get-course-details-by-id/{id}")
public ResponseEntity<Course> findCourseById(@PathVariable int id)
	{
	
	return courseserviceobj.FindCourseById(id);
	
	}

@GetMapping("get-specific-course-info/{id}/{info-attribute}")
public ResponseEntity<Course > findSpecificCourseInfo(@PathVariable int id, String infoAttribute) 
	{
	
	return courseserviceobj.FindSpecificCourseInfo(id, infoAttribute);

	}

@PutMapping("update-course-by-id/{id}")
public ResponseEntity<Course> updateCourse(@RequestBody Course course, @PathVariable int id)
	{
	
	return courseserviceobj.UpdateCourse(course, id);
	
	}


@DeleteMapping("delete-course-by-id/{id}")

public ResponseEntity<?> deleteCourse(@PathVariable int id)

//public ResponseEntity<?> deleteCourse(@RequestBody Course course, @PathVariable int id)
	{
	return courseserviceobj.DeleteCourse(id);

	}



}
