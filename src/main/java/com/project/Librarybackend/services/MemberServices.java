package com.project.Librarybackend.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.Librarybackend.dao.EntitiesDAO;
import com.project.Librarybackend.entities.Member;
import com.project.Librarybackend.repository.MemberRepository;


@Service
public class MemberServices implements EntitiesDAO<Member>{
	@Autowired
	MemberRepository memberRepository;



//	@Override
	public List getList() {
		// TODO Auto-generated method stub
		return memberRepository.findAll();
	}

//	@Override
	public Member findById(int id) {
		// TODO Auto-generated method stub
		return memberRepository.findById(id).get();
	}

//	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		memberRepository.deleteById(id);
	}

//	@Override
	public Member add(Member m) {
		// TODO Auto-generated method stub
	
		return memberRepository.save(m);
	}

//	@Override
	public Member update(Member member) {
		// TODO Auto-generated method stub
		 Member Memberupdated = memberRepository.findById(member.getIdMember()).get();
		 Memberupdated.setName(member.getName());
		 Memberupdated.setContact(member.getContact());
//		 Memberupdated.setjoiningDate(member.getjoiningDate());
	        return memberRepository.save(Memberupdated);
	}

}

