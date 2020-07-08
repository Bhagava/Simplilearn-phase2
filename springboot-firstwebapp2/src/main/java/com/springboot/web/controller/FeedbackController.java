package com.springboot.web.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.web.model.Feedback;
import com.springboot.web.service.FeedbackMapping;

@Controller
public class FeedbackController {
	
	
	@Autowired
	FeedbackMapping feedbackMapping;

	@RequestMapping("/")
	public String home()
	{
		System.out.println("home screen");
		return "index";
	}
	
	@RequestMapping(value="/feedback", method = RequestMethod.GET)
	public String showFeedbackFormPage(ModelMap model){
		Feedback user = new Feedback();
		System.out.println("2nd one");
		model.addAttribute("user",user);
		return "feedback_form";
	}
	
	@PostMapping(value="/feedback")
	public String submitFeedback(@ModelAttribute("user") Feedback user)
	{
		System.out.print("3rdOne");
		feedbackMapping.addFeedback(user.getFirstName(), user.getLastName(), user.getMailId(), user.getThirdPartyApp(), user.getCountry()
				, user.getFeedback_Description());
		System.out.println(user);
		return "successful";
	}
	
	@RequestMapping(value="/addfeedback")
	public String addanotherfeedback()
	{
		return"redirect:/feedback";
	}
	
}
