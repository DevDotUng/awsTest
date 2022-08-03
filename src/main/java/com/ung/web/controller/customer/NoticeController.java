package com.ung.web.controller.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ung.web.entity.Notice;
import com.ung.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public String list(Model model) {
		
		int page = 1;
		String field = "title";
		String query = "";
		
		List<Notice> list = service.getViewList(page, field, query);
		model.addAttribute("list", list);
		
		//return "customer/notice/list"; // ResourceViewResolver
		return "customer.notice.list"; // TilesViewResolver
	}
	
	@RequestMapping("detail")
	public String detail() {
		
		return "customer.notice.detail";
	}

}
