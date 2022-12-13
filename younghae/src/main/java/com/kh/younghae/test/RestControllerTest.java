package com.kh.younghae.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTest {

	@Autowired
	public BoardMapper boardMapper;
	
	@GetMapping("/testpersistenceOne")
	public int connection1() {
		return boardMapper.selectTest();
	}
	
	@GetMapping("/testpersistenceTwo")
	public int connection2() {
		return boardMapper.selectTestSecond();
	}
}
