package com.kh.younghae.qna.model.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class QuestionDto {
	
	private int userNum;
	private String userNickname;
	private String userGender;
	private Date userBirth;
	
	private int proNum;
	private String proImage;
	private String proName;
	
	private int boardNum;
	private String boardTitle;
	private String boardContent;
	private Date boardCreatedate;
	private Date boardModifydate;
	private int boardView;
	private char boardStatus;
	
	private String isSolved;
	
	/** 
	 * 유저	
	private int userNum;
		private String userId;
		private String userPwd;
		private String userName;
	private String userNickname;
		private String userEmail;
	private String userGender;
	private Date userBirth;
		private int userPhone;
		private String userRecommend;
		private Date userEnrolldate;
		private int userCnumber;
	private char userStatus;
		private Date userModifyDate;
		
	*전문가유저
	private int userNum;
		private String expertPostadd; //병/약국 우편주소
		private String expertAddress; //병/약국 주소
		private String expertAddDetail; //병/약국 상세주소
		private char expertSort;
		private String expertMedi;
		private String expertDept;
		private String expertProfile;
		private String expertHomepage;
	
	* 게시글
	private int boardNum;
	private String boardTitle;
	private String boardContent;
	private Date boardCreatedate;
	private Date boardModifydate;
	private int boardView;
	private char boardStatus;
	private int userNum;
		private int boardType;
	
	*Question
		private int questionNum;
		private int proNum;
		private String isSolved;
	*/

}
