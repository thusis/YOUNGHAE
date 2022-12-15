package com.kh.younghae.qna.service;

import org.springframework.stereotype.Service;

import com.kh.younghae.qna.model.dto.QuestionDto;
import com.kh.younghae.qna.model.dto.QuestionInsertDto;
import com.kh.younghae.qna.model.dto.QuestionUserDto;

@Service
public interface QnaService {
	
	/*추후 삭제*/	QuestionUserDto login(int userNum);
	QuestionDto insertquestion(QuestionInsertDto quest, QuestionUserDto questionUserDto);



}
