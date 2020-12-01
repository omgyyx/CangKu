package cn.qziedu.wzb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index.action")
	public String index(){
		
		
		
		
		return "static/index";
	}
	@RequestMapping("/welcome.action")
	public String welcome(){
		
		
		return "admin/welcome";
	}

}
