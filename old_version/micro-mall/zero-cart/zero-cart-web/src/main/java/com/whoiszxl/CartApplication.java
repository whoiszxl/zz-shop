package com.whoiszxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 购物车服务启动类
 *
 * @author whoiszxl
 * @date 2021/7/19
 */
@SpringBootApplication
@EnableFeignClients
public class CartApplication {

    public static void main(String[] args) {
        SpringApplication.run(CartApplication.class, args);
    }
}