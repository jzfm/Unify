package com.unify.application.api;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.unify.application.controllers.UniversityController;
import com.unify.domain.University;
import com.unify.utilities.InvalidParamException;
import com.unify.utilities.UniversityAlreadyExistsException;

@RestController
@RequestMapping("/universities")
public class UniversityRestController {

	@RequestMapping(method=RequestMethod.POST)
	public String createUniversity(@RequestBody JSONObject json) throws UniversityAlreadyExistsException, InvalidParamException{		
		String uniId=(String) json.get("uniId");
		
		University uni=new UniversityController().createUniversity(uniId);
		
		Gson gson=new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		return gson.toJson(uni);
	}	
}
