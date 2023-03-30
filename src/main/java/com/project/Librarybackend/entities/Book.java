package com.project.Librarybackend.entities;

//import java.util.ArrayList;
import java.util.Date;
//import java.util.List;
import java.util.List;

//import com.fasterxml.jackson.annotation.JsonProperty;

//import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer idBook;
	
	@Column(name="title")
	private String title;
	
	@Column(name="author")
	private String author;
	
	@Column(name="publisher")
	private String publisher;
	
	@Column(name="createDate")
	private Date createDate;
	
	@Column(name="publicationDate")
	private Date publicationDate;
	
	@Column(name="language")
	private String language;
	
	@Column(name="numberOfPage")
	private int numberOfPage;

	
	 @ManyToOne
	 @JoinColumn(name = "idMember")
	  private Member member;
	 
	 @ManyToOne
	 @JoinColumn(name = "idCategory")
	  private Category category;
	
	


}
