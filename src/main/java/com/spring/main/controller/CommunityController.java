package com.spring.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.main.domain.CommunityVO;
import com.spring.main.service.CommunityService;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/commu")
@Log4j
public class CommunityController {

	@Autowired
	private CommunityService communityService;
	
	// 글 목록
	@GetMapping("/list")
	public ModelAndView commuList(Model model) {
		
		System.out.println("글목록페이지로 넘어왔니?");
		model.addAttribute("list", communityService.getList());
		
		return new ModelAndView("/commu/list");
		
	}
	
	// 글등록 페이지로 이동
//	@GetMapping("/write")
//	public void write() {
//		System.out.println("글등록페이지로 넘어가");
//	}
	
	@GetMapping(value = "/write")
	public ModelAndView write() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/commu/write");

		return mav;
	}
	
	// 글 수정 페이지 이동
//	@GetMapping("/write")
//	public void insertCommu(Model model) {
//		log.info("글 수정 페이지");
//		return new ModelAndView("commu/write");
//	}

	
	// 글 등록
//	@PostMapping("/write")
//	public String insertCommu(CommunityVO board, RedirectAttributes rttr) {
//		communityService.insertCommu(board);
//		
//		rttr.addAttribute("result", "글 등록 완료!");
//		
//		return "redirect:/commu/list";
//	}
	
	//글등록
	@PostMapping("/write")
	public String insertCommu(CommunityVO board, RedirectAttributes rttr) {

		if (board.getCm_title().isEmpty() || board.getCm_content().isEmpty()) {
			rttr.addFlashAttribute("result", "insert failed");
		} else {
			communityService.insertCommu(board);
			rttr.addFlashAttribute("result", "insert success");
		}
		
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
