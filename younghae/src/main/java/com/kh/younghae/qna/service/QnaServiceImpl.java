package com.kh.younghae.qna.service;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.younghae.qna.dao.QnaDAO;
import com.kh.younghae.qna.model.dto.QuestionDto;
import com.kh.younghae.qna.model.dto.QuestionInsertDto;
import com.kh.younghae.qna.model.dto.QuestionUserDto;

@Service("QnaService")
public class QnaServiceImpl implements QnaService {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private QnaDAO qdao;
	
	@Autowired
	private HttpServletRequest request;

	@Override
	public QuestionUserDto login(int userNum) {
		return qdao.login(sqlSession, userNum);
	}

	@Override
	public QuestionDto insertquestion(QuestionInsertDto quest, QuestionUserDto questionUserDto) {
		// TODO Auto-generated method stub
		return null;
	}


}
