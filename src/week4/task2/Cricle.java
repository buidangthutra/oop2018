/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 *class Cricle ke thua class Shape
 * @author Thu Tra
 */
public class Cricle extends Shape{
    protected final double PI=3.14;
    protected double radius;

 /**
 *ham khoi tao mac dinh Cricle
 */
    public Cricle(){
        
    }
 /**
 *ham khoi tao Cricle
 * @param rad gia tri cau radius
 */     
    public Cricle(double rad) {
        this.radius = rad;
    }
 /**
 *ham khoi tao ham Cricle
 * @param rad la bien radius
 * @param  col la bien color
 * @param fill la bien filled
 */     
    public Cricle(double rad, String col, boolean fill  ){
        radius = rad;
        color = col;
        filled = fill;
    }

 /**
 *ham tra ve gai tri cho radiud
 * @return tra ve gia tri radius
 */     
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double rad) {
        radius = rad;
    }
 /**
 *phuong thuc tinh dien tich
 * @return tinh dien tich va tra ve gia tri dien tich
 */      
    public double getArea() {
        return PI*Math.pow(radius,2);
    }
 /**
 *phuong thuc tinh chu vi
 * @return tinh chu vi va tra ve gia tri chu vi
 */      
    public double getPerimeter(){
        return 2*PI*radius;
    }

 /**
 *ham tra ve thong tin day du cua Cricle
 */      
    @Override
    public String toString(){
        return "Cricle - "+"radius: "+this.radius + ", "+   "Area: "+this.getArea()
                + ", "+   "Perimeter: "+this.getPerimeter();
    }
}



