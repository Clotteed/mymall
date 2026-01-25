package com.clotte.mymall.member.controller;

import com.clotte.mymall.common.utils.R;
import com.clotte.mymall.member.feign.CouponFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
public class TestController {

    @Resource
    CouponFeignClient couponFeignClient;


    @RequestMapping("/test")
    public R test(){
        couponFeignClient.list(new HashMap<>());
        return R.ok();
    }
}
