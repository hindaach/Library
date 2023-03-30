package com.project.Librarybackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import com.project.Librarybackend.entities.Book;


//@Repository
public interface BookRepository extends JpaRepository <Book,Integer> {

}
