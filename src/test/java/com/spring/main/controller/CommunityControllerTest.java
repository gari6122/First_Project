package com.spring.main.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.main.domain.CommunityVO;
import com.spring.main.mapper.CommunityMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class CommunityControllerTest {

	@Autowired
	private CommunityMapper mapper;
	
	// 게시글 등록
	@Test
	public void insertBoard() {
		
		 CommunityVO vo = new CommunityVO();

         vo.setCm_title("왜 안대냐공");
         vo.setCm_content("넣어달라구");
         vo.setCm_date(null);
         vo.setCm_bno(0);
         
         mapper.insertCommu(vo);
	}
	
	// 게시글 조회
	// @Test
	public void testRead() {
		
		int bno = 3;
		log.info("조회 번호는 3의 내용 "+mapper.read(bno));
	}
	
	//게시글 목록
//	@Test
	public void testGetList() {

		List<CommunityVO> list = mapper.getList();
		for(int i = 0; i<list.size();i++) {
			log.info("" + list.get(i));
		}
	}

	//글 수정
//	@Test
	public void testModify() {
		
		CommunityVO vo = new CommunityVO();
		vo.setCm_bno(3);
		vo.setCm_title("Modify Title");
		vo.setCm_content("Modify Content");
		
		int result = mapper.modify(vo);
		log.info("수정되면 1, 아니면 0 :" + result);
	}
	
	//글 삭제
//		@Test
//		public void testDelet() {
//			int result = mapper.deleteCommu(3);
//			log.info("지워지면 1, 아니면 0 :"+result);
//			
//		}
	

}
