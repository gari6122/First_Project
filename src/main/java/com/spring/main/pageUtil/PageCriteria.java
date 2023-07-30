package com.spring.main.pageUtil;

public class PageCriteria {
	
	private int pageNum;
	private int amount;
	private int startNum;
	
	public PageCriteria() {
		// 객체 생성시 기본 생성자를 호출. 매개변수 설정
		// So. 매개변수 가지고 있는 생성자 함수 호출
		this(1, 10);
		// 생성자에서 pageNum=1, amount=10으로 설정
	}
	
	// 기본 생성자
	public PageCriteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	@Override
	public String toString() {
		return "PageCriteria [pageNum=" + pageNum + ", amount=" + amount + "]";
	}
	
	
}
