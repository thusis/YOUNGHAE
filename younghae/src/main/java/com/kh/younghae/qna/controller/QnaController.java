package com.kh.younghae.qna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QnaController {
	
	@GetMapping("/searchResult.qna")
	public String searchResult() {
		return "/qna/searchresult";
	}
	
	
}
