package com.project.Librarybackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.Librarybackend.entities.Member;
import com.project.Librarybackend.services.MemberServices;


@RestController
@RequestMapping("/member")
public class MemberControler {

	@Autowired
	MemberServices memberService;

	
	@GetMapping("/member")
	public List<Member> getMember() {

		return memberService.getList();
	}

	

	@GetMapping("/member/{id}")
	public Member getMember(@PathVariable int id) {

		return memberService.findById(id);
	}
	
	@PostMapping("/add")
	public void ajouterMember(@RequestBody Member m) {
		memberService.add(m);
	}

	@PutMapping("/edit")
	public void modifierMember(@RequestBody Member m) {
		memberService.update(m);
	}
	@DeleteMapping("/delete")
	public void deleteClient(@RequestParam int id) {
		// TODO Auto-generated method stub
		memberService.delete(id);
	}
}