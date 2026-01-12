package com.clotte.mymallproduct;

import com.clotte.mymall.product.MallProductApplication;
import com.clotte.mymall.product.entity.BrandEntity;
import com.clotte.mymall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = MallProductApplication.class)
public class TestApplication {
    @Resource
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("success");
    }
}
