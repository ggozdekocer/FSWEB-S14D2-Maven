package org.example.model;

import org.example.model.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor color;

    public Ceiling(PaintColor color, int height) {
        this.color = color;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(PaintColor color) {
        this.color = color;
    }

    public void create() {
        System.out.println("Ceiling has been built.");
    }
}
