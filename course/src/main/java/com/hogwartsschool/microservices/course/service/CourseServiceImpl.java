package com.hogwartsschool.microservices.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.hogwartsschool.microservices.course.Repositories.CourseRepository;
import com.hogwartsschool.microservices.course.models.Course;
import com.hogwartsschool.microservices.course.exceptions.*;
import java.util.List;


@Service
public class CourseServiceImpl {
	@Autowired
	CourseRepository courserep;

	//to get all courses list from the Db
	public ResponseEntity< List<Course> > GetAllCourses()
	{
		
		return ResponseEntity.ok(courserep.findAll());
	}
	
	//to insert a course.we are passing the course model class object to specify the template of the insert operation
	public ResponseEntity<Course> InsertCourse(Course course)
	{
		return ResponseEntity.ok(courserep.save(course));
	
	
	}
	
	//to find the course by id we are using the jpa repository functions
	public ResponseEntity<Course> FindCourseById(int id)
	{
	//Course c=courserep.findById(id);	
		return ResponseEntity.ok(courserep.findById(id).orElseThrow(() -> new CourseNotFoundException(id)));	
	}
	
	//to find and return the course info of the ID passed
	public ResponseEntity<Course> FindSpecificCourseInfo (int id, String infoAttribute)
	{
		//infoAttribute= coursepre
		//switch case for verifying infoattribute
		//seperate url's for seperate info
		return null;
	}
	
public ResponseEntity<Course> UpdateCourse(Course course, int id)
	{
		//implemented only update for coursedescription
		Course courseforupdate=courserep.findById(id).orElseThrow(() -> new CourseNotFoundException(id));
		courseforupdate.setCourseDescription(course.getCourseDescription());
		courseforupdate.setCourseName(course.getCourseName());
		//course updatedcourse=
		courserep.save(courseforupdate);
		
		//return ResponseEntity.ok("succesfully updated course with id "+id);
		return ResponseEntity.ok(courseforupdate);
		
		}
	
public ResponseEntity<?> DeleteCourse(int id)
	{
		Course course=courserep.findById(id).orElseThrow(() -> new CourseNotFoundException(id));
		courserep.delete(course);
		
		//we are first fetching the course and then deleting becoz the method deletebyid returns void but we need a response entity 
		return ResponseEntity.ok("successfully deleted the course with id "+id);
	}
}
