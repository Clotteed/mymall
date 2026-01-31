package com.clotte.mymall.product.service.impl;

import com.ctc.wstx.util.StringUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.clotte.mymall.common.utils.PageUtils;
import com.clotte.mymall.common.utils.Query;

import com.clotte.mymall.product.dao.CategoryDao;
import com.clotte.mymall.product.entity.CategoryEntity;
import com.clotte.mymall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> list = this.list();
        List<CategoryEntity> res = list.stream().filter(i -> i.getParentCid() == 0)
                .peek(j -> j.setChildren(getChildren(j, list)))
                .sorted(Comparator.comparing(CategoryEntity::getSort)).collect(Collectors.toList());
        return res;
    }

    public List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        return all.stream().filter(i -> Objects.equals(i.getParentCid(), root.getCatId()))
                .peek(j -> j.setChildren(getChildren(j, all)))
                .sorted(Comparator.comparingInt(i -> (i.getSort() == null ? 0 : i.getSort())))
                .collect(Collectors.toList());
    }

}