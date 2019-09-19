package com.task17;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {

	@RequestMapping("SaveData")
	public ModelAndView insertData(@ModelAttribute("info") InsertModel model) {
		String check = Service.saveEmp(model);
		if (check.equals("saved")) {
			ModelAndView mv = new ModelAndView("details.jsp");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView("faild.jsp");
			return mv;
		}

	}

	@RequestMapping("SearchData")
	public ModelAndView searchData(@ModelAttribute InsertModel m) {
		InsertModel model = Service.searchEmp(m);
		if (model != null) {
			ModelAndView mv = new ModelAndView("details.jsp");
			mv.addObject("info", model);
			return mv;
		} else {
			ModelAndView mv1 = new ModelAndView("faild.jsp");
			return mv1;
		}

	}

	@RequestMapping("DeleteData")
	public ModelAndView deleteData(@ModelAttribute InsertModel m) {
		InsertModel model = Service.searchEmp(m);
		if (model != null) {
			Service.deleteEmp(m);
			ModelAndView mv = new ModelAndView("details.jsp");
			mv.addObject("info", model);
			return mv;
		} else {
			ModelAndView mv1 = new ModelAndView("faild.jsp");
			return mv1;
		}

	}

	@RequestMapping("UpdateData")
	public ModelAndView updateData(@ModelAttribute InsertModel m) {
		InsertModel model = Service.searchEmp(m);
		if (model != null) {
			ModelAndView mv = new ModelAndView("updateMain.jsp");
			mv.addObject("info", model);
			return mv;
		} else {
			ModelAndView mv1 = new ModelAndView("faild.jsp");
			return mv1;
		}
	}

	@RequestMapping("UpdateDataMain")
	public ModelAndView updateDataMain(@ModelAttribute("info") InsertModel m) {

		InsertModel model = Service.updateEmp(m);
		ModelAndView mv = new ModelAndView("details.jsp");
		return mv;

	}

}
