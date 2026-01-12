package com.clotte.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.clotte.mymall.common.utils.PageUtils;
import com.clotte.mymall.member.entity.UmsIntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author Clotte
 * @email chtide@163.com
 * @date 2026-01-12 23:13:46
 */
public interface UmsIntegrationChangeHistoryService extends IService<UmsIntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

