package com.ibm.ro.internship.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class InternsController {

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String test() {
		
		StringBuilder str = new StringBuilder();
		str.append("Interns names are:");
		str.append("Replace with namexx");

        return str.toString();
    }

}
