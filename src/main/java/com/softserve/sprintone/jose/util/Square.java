package com.softserve.sprintone.jose.util;

public class Square implements CalculatorOperation{
    private Double side;

    public Square (Double side){
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public Double getArea() {
        return side*side;
    }
}
