package com.kh.younghae.test;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BoardMapper {
	
	@Select("SELECT COUNT(*) FROM BOARD")
	int selectTest();

	int selectTestSecond();
	
}
