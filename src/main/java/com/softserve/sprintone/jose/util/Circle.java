package com.softserve.sprintone.jose.util;

public class Circle implements CalculatorOperation{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }
}
