package cn.qziedu.wzb.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qziedu.wzb.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/index.action")
	public String index(){
		
		// springmvc.xml  +/WEB-INF/jsp/
		//ÐéÄâÂ·¾¶ 
		//.jsp
		return "admin/index";
		
	}
	@RequestMapping("/tologin.action")
	public String toLogin(){
		
		return "admin/login";
	}
	
	@RequestMapping("/login.action")
	public String login(HttpSession session, String name,String psw){
		
		boolean isLogin=adminService.login(name, psw);
		if(isLogin){
			session.setAttribute("isLogin", isLogin);
			return "admin/index";
		}
		
		else{
			return "admin/login";
		}
	}

}
