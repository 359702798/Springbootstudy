package com.atguigu.boot.bean;

import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author: 何川
 * @create:2020-12-30
 **/

/**
 * 得先将bean加入容器
 */
@ToString
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private  String brand;
    private  Integer price;

    public Car(String brand, Integer price) {
        this.brand = brand;
        this.price = price;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
