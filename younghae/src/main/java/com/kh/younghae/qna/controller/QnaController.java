package com.kh.younghae.qna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.younghae.qna.common.Qexception;
import com.kh.younghae.qna.model.dto.QuestionDto;
import com.kh.younghae.qna.model.dto.QuestionInsertDto;
import com.kh.younghae.qna.model.dto.QuestionUserDto;
import com.kh.younghae.qna.service.QnaService;

@Controller
public class QnaController {
	
	@Autowired
	private QnaService qserv;
	
//	private HttpServletRequest request;
	
	public QuestionUserDto login(int userNum) {
		return qserv.login(userNum);
	}
	
	@GetMapping("/writequestion.qa")
	public String writequestion() {
		return "/qna/writequestion";
	}
	
	@PostMapping("/insertquestion.qa")
	public String insertQuestion(@ModelAttribute QuestionInsertDto quest, Model model) {
		
		System.out.println(quest);
//		QuestionDto questResponse = qserv.insertquestion(quest, login(1));
		QuestionDto questResponse=null;
		model.addAttribute("test", "내 이름은 테스트");
		
		if(questResponse == null) {
			return "/qna/selectquestion";
		} else {
			throw new Qexception("게시글 등록 실패");
		}
	}
	
	
	
	
}
