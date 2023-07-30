package com.spring.main.domain;

import java.util.Date;
import lombok.Data;

@Data
public class CommunityVO {

	private int cm_bno;
	private String cm_title;
	private String cm_content;
	private Date cm_date;
		
}
