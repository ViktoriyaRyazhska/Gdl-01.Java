package com.softserve.sprintone.luis.additionalResources;

public class Block {
    private int width;
    private int length;
    private int height;
    public Block(int[] ints) {
        this.width=ints[0];
        this.length=ints[1];
        this.height=ints[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
    public int getVolume() {
        return this.height*this.length*this.width;
    }
    public int getSurfaceArea() {
        return (2*this.length*this.width)+(2*this.length*this.height)+(2*this.width*this.height);
    }
}
