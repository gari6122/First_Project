package com.spring.main.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.main.domain.CommunityVO;

public interface CommunityMapper {

	// 글 목록
	public List<CommunityVO> getList();
		
	// 글 조회
	public CommunityVO read(int bno);
	
	// 글 등록
	public int insertCommu(CommunityVO board);
	
	// 글 수정
	public int modify(CommunityVO board);
	
	// 글 삭제
	public int deleteCommu(int bno);
	
}
