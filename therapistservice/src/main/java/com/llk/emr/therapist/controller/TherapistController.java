package com.llk.emr.therapist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/therapist")
public class TherapistController {

	@PostMapping("/add")
	public String addTherapist(){
		return "";
	}

	@PostMapping("/remove")
	public String removeTherapist(){
		return "";
	}
}
