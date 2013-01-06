package com.adp.testApp.controller;

import java.util.Map;

import javax.xml.ws.RequestWrapper;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.adp.testApp.forms.Contact;
 

@Controller 


public class TestAppController {
	

@RequestMapping("/index")
public String redirectToindex(){  
//for Static jsp
		System.out.println("/index hit");
	return "index";	
	
}

@RequestMapping("/Rest")
public String redirectToRest(){  
//for Static jsp
		System.out.println("/rest hit");
	return "JSON_AJAX";	
	
}
	
	
}
