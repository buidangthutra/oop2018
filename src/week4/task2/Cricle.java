/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 *
 * @author Admin
 */

public class Cricle extends Shape{
    private final double PI=3.14;
    private double radius;
    
    public void Cricle(){
        
    }
    
    public void Cricle(double rad) {
        radius = rad;
    }
    
    public void Cricle(double rad, String col, boolean fill  ){
        radius = rad;
        color = col;
        filled = fill;
    }
    
    public double getRadius(){
        return 3;
    }
    
    public void setRadius(double rad) {
        radius = rad;
    }
    
    public double getArea() {
        return PI*Math.pow(radius,2);
    }
    
    public double getPerimeter(){
        return 2*PI*radius;
    }
    
    @Override
    public String toString(){
        return "Cricle - "+"radius: "+this.radius + ", "+   "Area: "+this.getArea()
                + ", "+   "Perimeter: "+this.getPerimeter();
    }
}



