package com.spring.main.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.main.domain.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTest {

	@Autowired
	private MemberMapper membermapper;
	
	// 회원가입 쿼리 테스트
	@Test
	public void memberJoin() throws Exception{
		MemberVO member = new MemberVO();
		
		member.setMemberId("test3");
		member.setMemberPw("test3");
		member.setMemberName("test3");
		member.setMemberMail("test3");
		member.setMemberAddr1("test3");
		member.setMemberAddr2("test3");
		member.setMemberAddr3("test3");
		
		membermapper.memberJoin(member);
	}

}
