package com.greatLearning.debates.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatLearning.debates.entity.Debates;
import com.greatLearning.debates.service.DebateService;

@Controller
@RequestMapping("/debates")
public class DebateController {
	@Autowired
	DebateService debateService;
	@RequestMapping("/list")
	public String getAll(Model det){
		List<Debates> deb = debateService.findAll();
		det.addAttribute("details",deb);
		return "list-debates";
	}
	
	@RequestMapping("/addStudent")
	public String studentForm(Model det) {
		Debates deb = new Debates();
		det.addAttribute("debates",deb);
		return "student-form";
		
	}
	
	@PostMapping("/save")
	public String saveStudent(@RequestParam("studentId") int id, @RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName, @RequestParam("course") String course, @RequestParam("email") String email)
	{
		Debates deb = null;
		if(id != 0) {
			deb = debateService.findById(id);
			deb.setFirstName(firstName);
			deb.setLastName(lastName);
			deb.setEmail(email);
			deb.setCourse(course);
			
		}
		else {
			deb = new Debates(firstName,lastName,course,email);
		}
		debateService.saveDetails(deb);
		return "redirect:/debates/list";
		
	}
	@RequestMapping("/updateStudent")
	public String updateStudent(Model model, @RequestParam("studentId") int id) {
		Debates deb = debateService.findById(id);
		model.addAttribute("debates",deb);
		return "student-form";
	}
	
	@RequestMapping("/deleteStudent")
	public String deleteById( @RequestParam("studentId") int id) {
	
		debateService.delete(id);
	return "redirect:/debates/list";
		
	}
	
}
