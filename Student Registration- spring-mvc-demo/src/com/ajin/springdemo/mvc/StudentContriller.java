package com.ajin.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentContriller {

	@RequestMapping("/showForm")
	public String showStudentForm(Model theModel) {

		theModel.addAttribute("student", new Student());

		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processingform(@ModelAttribute("student") Student theStudent) {

		// System.out.println("First" + theStudent.getFirstName() +
		// theStudent.getLastName());

		return "student-confirmation";
	}

}
