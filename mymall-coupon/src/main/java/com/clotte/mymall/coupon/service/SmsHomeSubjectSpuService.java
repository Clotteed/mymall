package com.clotte.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.clotte.mymall.common.utils.PageUtils;
import com.clotte.mymall.coupon.entity.SmsHomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author Clotte
 * @email chtide@163.com
 * @date 2026-01-12 23:03:06
 */
public interface SmsHomeSubjectSpuService extends IService<SmsHomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

