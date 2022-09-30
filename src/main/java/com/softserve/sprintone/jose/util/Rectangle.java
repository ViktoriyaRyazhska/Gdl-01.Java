package com.softserve.sprintone.jose.util;

public class Rectangle implements CalculatorOperation{
    private Double length;
    private Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double getArea() {
        return length*width;
    }
}
