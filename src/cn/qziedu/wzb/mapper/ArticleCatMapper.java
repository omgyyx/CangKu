package cn.qziedu.wzb.mapper;

import cn.qziedu.wzb.po.ArticleCat;
import cn.qziedu.wzb.po.ArticleCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleCatMapper {
    long countByExample(ArticleCatExample example);

    int deleteByExample(ArticleCatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArticleCat record);

    int insertSelective(ArticleCat record);

    List<ArticleCat> selectByExample(ArticleCatExample example);

    ArticleCat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArticleCat record, @Param("example") ArticleCatExample example);

    int updateByExample(@Param("record") ArticleCat record, @Param("example") ArticleCatExample example);

    int updateByPrimaryKeySelective(ArticleCat record);

    int updateByPrimaryKey(ArticleCat record);
}