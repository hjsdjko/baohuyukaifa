package com.dao;

import com.entity.WenhuachanpinLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WenhuachanpinLiuyanView;

/**
 * 文化产品留言 Dao 接口
 *
 * @author 
 */
public interface WenhuachanpinLiuyanDao extends BaseMapper<WenhuachanpinLiuyanEntity> {

   List<WenhuachanpinLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
