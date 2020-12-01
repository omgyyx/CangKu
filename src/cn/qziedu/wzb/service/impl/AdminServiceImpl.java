package cn.qziedu.wzb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qziedu.wzb.mapper.AdminMapper;
import cn.qziedu.wzb.po.AdminExample;
import cn.qziedu.wzb.po.AdminExample.Criteria;
import cn.qziedu.wzb.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public boolean login(String name, String psw) {
		// TODO Auto-generated method stub
		
		boolean flag=false;
		AdminExample adminExample=new AdminExample();
	    Criteria criteria=adminExample.createCriteria();
	    criteria.andNameEqualTo(name);
	    criteria.andPswEqualTo(psw);
	    long l=adminMapper.countByExample(adminExample);
	    if (l==1){
	    	flag=true;
	    }
	    return flag;
		
		
	
	}

}
