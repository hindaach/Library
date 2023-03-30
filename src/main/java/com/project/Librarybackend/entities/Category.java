package com.project.Librarybackend.entities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idCategory;
	
	@Column(name="name")
	private String name;
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	  @OneToMany(mappedBy = "category")
	  private List<Book> books = new ArrayList<>();
	

}
