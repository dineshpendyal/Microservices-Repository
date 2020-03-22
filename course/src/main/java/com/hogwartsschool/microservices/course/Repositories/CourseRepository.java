package com.hogwartsschool.microservices.course.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hogwartsschool.microservices.course.models.Course;

public interface CourseRepository extends JpaRepository<Course,Integer>
		{
		
		}





