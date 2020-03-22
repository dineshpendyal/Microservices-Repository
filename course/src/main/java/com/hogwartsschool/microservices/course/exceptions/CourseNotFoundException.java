package com.hogwartsschool.microservices.course.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CourseNotFoundException extends RuntimeException {

	public CourseNotFoundException(int courseid)
		{
		super(String.format("no course id found with id ", +courseid));
		
		}

}



