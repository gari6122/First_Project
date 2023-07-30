package com.spring.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.domain.CommunityVO;
import com.spring.main.mapper.CommunityMapper;

@Service
public class CommunityServiceImpl implements CommunityService{

	@Autowired
	private CommunityMapper mapper;
	
	// 글 목록
	@Override
	public List<CommunityVO> getList() {
		return mapper.getList();
	}

	// 글 조회
	@Override
	public CommunityVO read(int bno) {
		return mapper.read(bno);
	}

	// 글 등록
	@Override
	public void insertCommu(CommunityVO board) {
		mapper.insertCommu(board);
	}

	// 글 수정
	@Override
	public int modify(CommunityVO board) {
		return mapper.modify(board);
	}

	// 글 삭제
	@Override
	public int deleteCommu(int bno) {
		return mapper.deleteCommu(bno);
	}

}
