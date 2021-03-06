package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//Create a student object
		Student thStudent = new Student();
		
		//add student object to the model
		theModel.addAttribute("student", thStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processform(@ModelAttribute("student") Student theStudent) {
		
		//log the input data
		System.out.println("theStudent: " + theStudent.getFirstName() 
							+ " " + theStudent.getLastName());
		
		return "student-confirmation";
	}

}
