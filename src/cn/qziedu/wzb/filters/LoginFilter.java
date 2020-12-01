package cn.qziedu.wzb.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("销毁了");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain fc)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		boolean isLogin=false;
		System.out.println("过滤了");
		HttpServletRequest rq=(HttpServletRequest)request;
		HttpSession session=rq.getSession();
	    Object obj= session.getAttribute("isLogin");
	    if(obj!=null){
	    	isLogin=(Boolean)obj;
	    }
	  
	   if(isLogin){
		   request.getRequestDispatcher("/admin/index.action").forward(request, response);
	   }
	   else{
		   
		   request.getRequestDispatcher("/admin/tologin.action").forward(request, response);
		   
	   }
		
		
		
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("初始化了");
		//排出的集合
		
	}

}
