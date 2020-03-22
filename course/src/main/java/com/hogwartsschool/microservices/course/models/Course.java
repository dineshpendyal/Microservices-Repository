package com.hogwartsschool.microservices.course.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;



@Entity
@Table(name = "coursedetailstable")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "courseid")
	private int courseId;
	@Column(name = "coursename")
	@Size(min = 3,max = 30,message = "coursename should be atleast 3 chars and maximum of 30 cahrs")
	private String courseName;
	@Column(name = "courseprerequisite")
	@Size(min = 3,max = 30,message = "courseprerequisite should be atleast 3 chars and maximum of 30 cahrs")
	private String coursePreRequisite;
	@Column(name = "coursedescription")
	@Size(min = 3,max = 30,message = "coursedescription should be atleast 3 chars and maximum of 30 cahrs")
	private String courseDescription;
	@Column(name = "coursecredits")
	private int credits;
	
public Course() {
	
	}

	public Course(int courseId, String courseName, String coursePreRequisite, String courseDescription, int credits)
	
	{
		super();
		this.courseId=courseId;
		this.courseName=courseName;
		this.courseDescription=courseDescription;
		this.coursePreRequisite=coursePreRequisite;
		this.credits=credits;
		
	}

	
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCoursePreRequisite() {
		return coursePreRequisite;
	}
	public void setCoursePreRequisite(String coursePreRequisite) {
		this.coursePreRequisite = coursePreRequisite;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}	

	
	
	
}
