package com.spring.main.service;

import java.util.List;

import com.spring.main.domain.CommunityVO;

public interface CommunityService {

	// 글 목록
	public List<CommunityVO> getList();
	
	// 글 조회
	public CommunityVO read(int bno);
	
	// 글 등록
	public void insertCommu(CommunityVO board);
	
	// 글 수정
	public int modify(CommunityVO board);
	
	// 글 삭제
	public int deleteCommu(int bno);
	
}
