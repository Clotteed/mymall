package com.clotte.mymall.member.feign;

import com.clotte.mymall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("mymall-coupon")
public interface CouponFeignClient {
    @PostMapping("/coupon/smscoupon/list")
    R list(@RequestParam Map<String, Object> params);
}
