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
public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    
    public void Rectangle(){
         
    }
    
    public void Rectangle(double width,double length) {
        this.width = width;
        this.length = length;
    }
    
    public void Rectangle(double w,double l, String c, boolean f){
        width = w;
        length = l;
        color = c;
        filled = f;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double wid) {
        width = wid;
    }
    
    public double getLength() {
        return length;
    }
    
    public void setLength(double leng) {
        length = leng;
    }
    
    public double getArea() {
        return length*width;
    }
    
    public double getPerimeter(){
        return (length+width)*2;
    }
    
    @Override
    public String toString(){
        return "Rectange - "+"width: "+this.width
                + ", "+   "length: "+this.length + ", "+   "Area: "+this.getArea()
                + ", "+   "Perimeter: "+this.getPerimeter();
    }
}