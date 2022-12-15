package com.kh.younghae.qna.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExpertUser { //전문회원
	private int userNum;
	private String expertPostadd; //병/약국 우편주소
	private String expertAddress; //병/약국 주소
	private String expertAddDetail; //병/약국 상세주소
	private char expertSort;
	private String expertMedi;
	private String expertDept;
	private String expertProfile;
	private String expertHomepage;
}
