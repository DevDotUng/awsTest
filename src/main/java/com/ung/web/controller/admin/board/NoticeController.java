package com.ung.web.controller.admin.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ung.web.entity.Notice;
import com.ung.web.service.NoticeService;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;

	@RequestMapping("list")
	public String list(Model model) {
		
		List<Notice> list = service.getViewList(1, "title", "");
		
		return "admin.board.notice.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		
		Notice notice = service.getView(1);
		
		return "admin.board.notice.detail";
	}
	
	@RequestMapping("reg")
	public String reg() {
		
		return "admin.board.notice.reg";
	}
}
