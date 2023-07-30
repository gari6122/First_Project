package com.spring.main.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.main.mapper.CommunityMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class CommunityControllerTest {

	@Autowired
	private CommunityMapper mapper;
	
	@Test
	public void testRead() {
		
		int bno = 3;
		log.info("조회 번호는 3의 내용 "+mapper.read(bno));
	}


}
