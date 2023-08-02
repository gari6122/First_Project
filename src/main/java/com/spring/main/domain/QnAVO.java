package com.spring.main.domain;

import java.util.Date;

import lombok.Data;

@Data
public class QnAVO {

	private int qna_bno;
	private String qna_title;
	private String qna_content;
	private Date qna_date;
	
}
