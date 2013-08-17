package com.adp.testApp.controller;

import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;

import com.adp.testApp.forms.Contact;
import com.adp.testApp.services.ContactServiceI;
import com.adp.testApp.services.PatientServiceI;

@Controller
public class ContactController {

	
	@RequestMapping("/Contact")
public String redirectTo(Map<String, Object> map){  
		map.put("contact", new Contact());
		System.out.println("/contact hit");
		return "ContactList";
	
}
	@Autowired
	ContactServiceI contactServ;
	 
	@Autowired
	PatientServiceI patientServ;
	@RequestMapping(value="/addContact", method=RequestMethod.POST)
	public String addContact(@ModelAttribute("contact")Contact contact,BindingResult result){
		
		contactServ.addContact(contact);
		
		
		
		patientServ.admitPatient();
		System.out.println("/ AFTER PATIENT addContact hit");
		return "redirect:/list";
		
	}
	
	
	@RequestMapping(value="/list" ) 
	public ModelAndView listContacts(Model model) {

		Contact contact= new Contact();
		contact.setFirstname("anand");
	//	map.put("contact", contact);
		model.addAttribute("contact", contact);
	//	map.put("contactList", contactServ.listContacts());
		model.addAttribute("contactList", contactServ.listContacts());
		//return "ContactList";
		System.out.println("/list hit");
		return new ModelAndView("ContactList", "contact",contact); 
	}  
	
	@RequestMapping(value="/jQlist" ) 
	public ResponseEntity listContacts(@RequestParam(value="callback", required=false) String callback,Model model) {

		Contact contact= new Contact();
		contact.setFirstname("anandpatil");
		contact.setTelephone("4084808149");
		//return "ContactList";
		System.out.println("/jqlist hit");
		String result = "result:(tttt)";
		HttpHeaders responseHeaders = new HttpHeaders();
		
		 return new ResponseEntity<List>( contactServ.listContacts(), responseHeaders, HttpStatus.OK);
		
	}  
}
