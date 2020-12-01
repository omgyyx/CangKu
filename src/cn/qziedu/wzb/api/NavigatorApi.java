package cn.qziedu.wzb.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.qziedu.wzb.po.Navigator;
import cn.qziedu.wzb.service.NavigatorService;

@RestController
@RequestMapping("/api/nav")
public class NavigatorApi {
   
	@Autowired
	private NavigatorService navigatorService;
	@RequestMapping("/all.action")
	//@ResponseBody
	public List<Navigator> all(){
		List<Navigator> all=navigatorService.all();
		
	    return all;
	}
	@RequestMapping("/one.action")
	@ResponseBody
	public Navigator one(){
		
		
		return null;
	}
	@RequestMapping("/getNavs.action")
	@ResponseBody
	public Map<String,List<Navigator>> getNavs(){
		
	
		return null;
	}

}
