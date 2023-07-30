package com.spring.main.domain;

import com.spring.main.pageUtil.PageCriteria;

import lombok.Data;

@Data
public class PageVO {
	private int startPage; // 시작 페이지
	private int endPage; // 끝페이지
	private boolean prev, next; // 이전, 다음 페이지
	
	private int total; // 현재 페이지 번호, 한 페이지에 표출할 데이터 개수
	private PageCriteria cri;
	
	public PageVO(PageCriteria cri, int total) {
		this.cri = cri;
		this.total = total;
		
		// 시작페이지, 마지막페이지 개선
		this.endPage = (int)(cri.)
	}
}
