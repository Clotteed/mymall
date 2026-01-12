package com.clotte.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.clotte.mymall.common.utils.PageUtils;
import com.clotte.mymall.member.entity.UmsMemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Clotte
 * @email chtide@163.com
 * @date 2026-01-12 23:13:46
 */
public interface UmsMemberService extends IService<UmsMemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

