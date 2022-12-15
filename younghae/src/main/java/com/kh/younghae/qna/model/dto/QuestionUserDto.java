package com.kh.younghae.qna.model.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class QuestionUserDto {
	
	private int userNum;
	private String userNickname;
	private String userGender;
	private Date userBirth;

}
