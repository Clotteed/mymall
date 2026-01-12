package com.clotte.mymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.clotte.mymall.common.utils.PageUtils;
import com.clotte.mymall.ware.entity.WmsPurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author Clotte
 * @email chtide@163.com
 * @date 2026-01-12 23:18:52
 */
public interface WmsPurchaseService extends IService<WmsPurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

