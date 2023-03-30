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

import com.project.Librarybackend.dao.EntitiesDAO;
import com.project.Librarybackend.entities.Book;
import com.project.Librarybackend.entities.Member;
import com.project.Librarybackend.services.BookServices;
import com.project.Librarybackend.services.MemberServices;



	@RestController
	@RequestMapping("/book")
	public class BookController  {

		
		@Autowired
		BookServices Bookservice;
		
		@GetMapping("/all")
		public List<Book> getbookAll() {

			return Bookservice.getList();
		}


		@GetMapping("/{id}")
		public Book getBook(@PathVariable int id) {

			return Bookservice.findById(id);
		}
		
		@PostMapping("/add")
		public void ajouterBook(@RequestBody Book b) {
			Bookservice.add(b);
		}

		@PutMapping("/edit")
		public void modifierBook(@RequestBody Book b) {
			Bookservice.update(b);
		}
		

		@DeleteMapping("/delete")
		public void deleteBook(@RequestParam int id) {
			// TODO Auto-generated method stub
			Bookservice.delete(id);
		}



}
