package com.clotte.mymall.product.dao;

import com.clotte.mymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Clotte
 * @email chtide@163.com
 * @date 2026-01-12 21:47:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
