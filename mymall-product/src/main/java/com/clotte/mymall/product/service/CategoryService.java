package com.clotte.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.clotte.mymall.common.utils.PageUtils;
import com.clotte.mymall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author Clotte
 * @email chtide@163.com
 * @date 2026-01-12 21:47:20
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

