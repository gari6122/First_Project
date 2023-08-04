package com.spring.main.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.main.domain.MemberVO;
import com.spring.main.mapper.MemberMapper;

public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberMapper membermapper;
	
	@Override
	public void memberJoin(MemberVO member) throws Exception {
		
		membermapper.memberJoin(member);
		
	}
	
}
