/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_shapes;

import java.util.Locale;

/**
 *
 * @author Borislav Sabev s4726863, Austin Atchley s1016930
 */
public class Circle implements Shape{
    
    // x,y coord of the center and r as radius
    private double x;
    private double y;
    private final double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // setters and getters, r doesn't have setter because it should be inmutable
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    @Override
    public double getLeftBorder() {
        return this.x - this.r;
    }

    @Override
    public double getRightBorder() {
        return this.x + this.r;
    }

    @Override
    public double getTopBorder() {
        return this.y + this.r;
    }

    @Override
    public double getBottomBorder() {
        return this.y - this.r;
    }

    @Override
    public double getArea() {
        // pi*r*r
        return Math.pow(this.r, 2.0) * Math.PI;
    }

    @Override
    public void moveTo(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
    
    @Override
    public String toString(){
    return String.format(Locale.US, "Circle r=%.2f, center at (%.2f,%.2f), area=%.2f", this.r, this.x, this.y, getArea());
    }
}
