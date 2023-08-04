package com.spring.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

// 메인페이지 이동, 상품 검색 등 관리 Controller
@Log4j
@Controller
public class DefaultController {

	// main.jsp에 접속 메서드
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public void mainPageGET() {
		log.info("메인 페이지 진입");
	}
	
	
}
