package com.kh.younghae.qna.dao;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;

import com.kh.younghae.qna.model.dto.QuestionUserDto;

@Mapper
public interface QnaDAO {

	QuestionUserDto login(SqlSessionTemplate sqlSession, int userNum);

}
