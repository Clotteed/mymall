package com.clotte.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.clotte.mymall.common.utils.PageUtils;
import com.clotte.mymall.coupon.entity.SmsSeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author Clotte
 * @email chtide@163.com
 * @date 2026-01-12 23:03:06
 */
public interface SmsSeckillSessionService extends IService<SmsSeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

