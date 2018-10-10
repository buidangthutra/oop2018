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
public class Square extends Rectangle{
    
    private double side; 
    
    public void Square(){
        
    }
    
    public void Square(double side) {
        this.side = side;
    }
    
    public void Square(double side, String col, boolean fill  ){
        this.side = side;
        super.setColor(col);
        super.setFilled(fill);
    }
    
    public double getSide(){
        return side;
    }
    
    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side) {
        super.setWidth(side);
    }
    
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString(){
        return "Square - "+"side: "+this.side+ ", "+   "Area: "+this.getArea()
                + ", "+   "Perimeter: "+this.getPerimeter();
    }
}