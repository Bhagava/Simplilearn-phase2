package com.springboot.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyRepo;
import com.springboot.web.model.Feedback;

@Service
public class FeedbackMapping {
		private static ArrayList<Feedback> feedbacks = new ArrayList<Feedback>();
		private static int feedbackcount =0;
		
		@Autowired
		MyRepo feedbackRepository;
		
		public FeedbackMapping()
		{
			feedbacks.add(new Feedback(++feedbackcount,"mamidipaka","bhagavan", "abcdef@gmail.com", "appname", "India", "feedback"));
			feedbacks.add(new Feedback(++feedbackcount,"harika","koturi", "harika@gmail.com", "VoiceRecorder", "India", "Your App is awesome"));
			feedbacks.add(new Feedback(++feedbackcount,"devnath","es", "devnath@gmail.com", "AppLock", "America", "Nice security app"));
		}
		
		public void addFeedback(String FirstName, String LastName, String email, String Country, String ThirdPartyAppName, String Feedback)
		{
			feedbacks.add(new Feedback(++feedbackcount,FirstName,LastName,email,Country,ThirdPartyAppName,Feedback));
			feedbackRepository.save(feedbacks);
		}
		
		public List<Feedback> getAllFFeedbacks()
		{
			List<Feedback> feedbacks = new ArrayList<Feedback>();
			feedbackRepository.findAll().forEach(feedbacks::add);
			return feedbacks;
		}
}
