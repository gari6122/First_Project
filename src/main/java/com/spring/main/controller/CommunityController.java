package com.spring.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.main.domain.CommunityVO;
import com.spring.main.service.CommunityService;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/commu/*")
@Log4j
public class CommunityController {

	@Autowired
	private CommunityService communityService;
	
	// 글 목록
	@GetMapping("/list")
	public void commuList(Model model) {
		model.addAttribute("commu",communityService.getList());
		
		log.info("글목록 페이지");
		
		// 추가해봄(community list.jsp 페이지랑 연결된다.)
		List<CommunityVO> commuBoard = communityService.getList();
		model.addAttribute("commuBoard", commuBoard);
		// 페이지 추가 소스같음(적다 말았음)
//		List<CommunityVO> list = communityService.read(bno)
	}
	
	// 글 등록 페이지 이동
	@GetMapping("/write")
	public void commu() {
		log.info("글쓰는 페이지");
		System.out.println("커뮤니티 등록 페이지로 이동");
	}
	
	// 글 등록
	@PostMapping("/write")
	public String insertCommu(CommunityVO board, RedirectAttributes rttr) {
		communityService.insertCommu(board);
		
		rttr.addAttribute("result", "글 등록 완료!");
		
		return "redirect:/commu/list";
	}
	
	// 글 조회
	@GetMapping("/detail")
	public void commuBoardGET(int bno, Model model) {
		model.addAttribute("read", communityService.read(bno));
	}
	
	// 글 수정 페이지 이동
	@GetMapping("/modify")
	public void goModify(int bno, Model model) {
		log.info("글 수정 페이지");
		model.addAttribute("modify",communityService.read(bno));
	}
	
	// 글 수정
	@PostMapping("/modify")
	public String modify(CommunityVO board, RedirectAttributes rttr) {
		communityService.modify(board);
		rttr.addFlashAttribute("result", "수정 완료");
		return "redirect:/commu/list";
	}
	
	// 글 삭제
	@PostMapping("/delete")
	public String delete(int bno, RedirectAttributes rttr) {
		communityService.deleteCommu(bno);
		rttr.addFlashAttribute("result", "삭제 완료!");
		return "redirect:/commu/list";
	}
	
}
