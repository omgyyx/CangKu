package cn.qziedu.wzb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qziedu.wzb.po.Navigator;
import cn.qziedu.wzb.service.NavigatorService;

@Controller
@RequestMapping("/admin/nav")
public class NavigatorController {
	@Autowired
	private NavigatorService navigatorService;
	
	@RequestMapping("/index.action")
	public String index(Model model){
		
		//Êý¾Ý
		List<Navigator> navs=navigatorService.all();
		model.addAttribute("navs", navs);
		
		//äÖÈ¾
		return "admin/navigator/list";
		
	}
	@RequestMapping("/toedit.action")
	public String toedit(){
		
		return null;
	}
	@RequestMapping("/edit.action")
	public String edit(){
		
		return null;
	}
	@RequestMapping("/delete.action")
	public String delete(){
		
		return null;
		
	}

}
