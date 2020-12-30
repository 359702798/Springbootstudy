package com.atguigu.boot.bean;


import lombok.ToString;

@ToString
public class Pet {
    private String name;
    private Double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Pet(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Pet() {
    }
}
