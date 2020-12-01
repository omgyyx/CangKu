package cn.qziedu.wzb.mapper;

import cn.qziedu.wzb.po.Navigator;
import cn.qziedu.wzb.po.NavigatorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NavigatorMapper {
	
    long countByExample(NavigatorExample example);

    int deleteByExample(NavigatorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Navigator record);

    int insertSelective(Navigator record);

    List<Navigator> selectByExample(NavigatorExample example);

    Navigator selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Navigator record, @Param("example") NavigatorExample example);

    int updateByExample(@Param("record") Navigator record, @Param("example") NavigatorExample example);

    int updateByPrimaryKeySelective(Navigator record);

    int updateByPrimaryKey(Navigator record);
}