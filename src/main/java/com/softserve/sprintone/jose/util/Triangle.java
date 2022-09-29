package com.softserve.sprintone.jose.util;

public class Triangle implements CalculatorOperation{
    private Double base;
    private Double height;

    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public Double getArea() {
        return 0.5*(base*height);
    }
}
