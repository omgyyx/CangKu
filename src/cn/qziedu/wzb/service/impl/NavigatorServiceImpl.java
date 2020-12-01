package cn.qziedu.wzb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qziedu.wzb.mapper.NavigatorMapper;
import cn.qziedu.wzb.po.Navigator;
import cn.qziedu.wzb.service.NavigatorService;
@Service
public class NavigatorServiceImpl implements NavigatorService {
   @Autowired
   private NavigatorMapper navigatorMapper;
	@Override
	public List<Navigator> all() {
		// TODO Auto-generated method stub
		return navigatorMapper.selectByExample(null);
	}

	@Override
	public Navigator one(Integer id) {
		// TODO Auto-generated method stub
		return navigatorMapper.selectByPrimaryKey(id);
	}

	@Override
	public int add(Navigator t) {
		// TODO Auto-generated method stub
		return navigatorMapper.insert(t);
	}

	@Override
	public int update(Navigator t) {
		// TODO Auto-generated method stub
		return navigatorMapper.updateByPrimaryKey(t);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return navigatorMapper.deleteByPrimaryKey(id);
	}

}
