package com.ajin.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String ShowForm() {
		return "HelloWorldForm";
	}

	@RequestMapping("/processForm")
	public String ProcessForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormTwo")
	public String ProcessFormTwo(HttpServletRequest request, Model model) {

		String theName = request.getParameter("studentName");

		theName = theName.toUpperCase();

		String result = "yoooo " + theName;

		model.addAttribute("message", result);

		return "helloworld";

	}

	@RequestMapping("/processFormThree")
	public String ProcessFormThree(@RequestParam("studentName") String theName, Model model) {

		// String theName = request.getParameter("studentName");

		theName = theName.toUpperCase();

		String result = "yoooo " + theName;

		model.addAttribute("message", result);

		return "helloworld";

	}

}
