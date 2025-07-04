package org.zerock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.dto.BoardVO;
import org.zerock.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService service;
	
	@GetMapping("/boardList")
	public String boardList(Model model) {
		
		List<BoardVO> list  = service.boardList();
		
		model.addAttribute("boardList", list);
		
		return "boardList";
	}
}
