package com.project.Librarybackend.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.Librarybackend.dao.EntitiesDAO;
import com.project.Librarybackend.entities.Book;
import com.project.Librarybackend.repository.BookRepository;

import lombok.SneakyThrows;






@Service
public class BookServices implements EntitiesDAO<Book>{
	@Autowired
	BookRepository bookRepository;


	
	

@SneakyThrows
//	@Override
	public List getList() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}



//	@Override
	public Book findById(int id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id).get();
	}

//	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
	}

//	@Override
	public Book add(Book m) {
		// TODO Auto-generated method stub
	
		return bookRepository.save(m);
	}

//	@Override
	public Book update(Book Book) {
		// TODO Auto-generated method stub
		Book Bookupdated = bookRepository.findById(Book.getIdBook()).get();
		Bookupdated.setTitle(Book.getTitle());
		Bookupdated.setAuthor(Book.getAuthor());
		Bookupdated.setPublisher(Book.getPublisher());
		Bookupdated.setLanguage(Book.getLanguage());
		Bookupdated.setNumberOfPage(Book.getNumberOfPage());
	        return bookRepository.save(Bookupdated);
	}

}

