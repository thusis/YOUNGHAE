package com.kh.younghae.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControllerTest {

	@GetMapping("/testlist")
	public String showlist() {
		return "/qna/searchresult";
	}

}
