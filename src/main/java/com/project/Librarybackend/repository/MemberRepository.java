package com.project.Librarybackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.project.Librarybackend.entities.Member;

//@Repository
public interface MemberRepository extends JpaRepository <Member,Integer>{

}
