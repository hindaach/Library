package com.project.Librarybackend.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

//import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer idMember;
	
	@Column(name="name")
	private String name;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="joiningDate")
	private Date joiningDate;
	
	

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	  @OneToMany(mappedBy = "member")
	  private List<Book> books = new ArrayList<>();
	
}
