package com.task17;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {
	
	@RequestMapping("insert")
	public String insertData() {
		return "insert.jsp";
	}
	@RequestMapping("delete")
	public String deleteData() {
		return "delete.jsp";
	}
	@RequestMapping("update")
	public String updateData() {
		return "update.jsp";
	}
	@RequestMapping("search")
	public String showResult() {
		return "search.jsp";
	}
	
}
