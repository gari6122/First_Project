package com.spring.main.service;

import java.util.List;

import com.spring.main.domain.QnAVO;

public interface QnAService {

	public abstract List<QnAVO> read();
	public abstract QnAVO read(int bno);
	public abstract int insert(QnAVO vo);
	public abstract int update(QnAVO vo);
	public abstract int delete(int bno);
	
	
}
