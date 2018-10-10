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
public class Shape {
    String color = "red";
    boolean filled = true;
    
    public void shape() {
        
    }
    
   public void Shape(String col, boolean fill) {
        color = col;
        filled = fill;
    }
    
    String getColor() {
    return "red";    
    }
    
    public void setColor(String col) {
        color = col;
    }
    
    public boolean isFilled(){
         return filled;
     }
    
   public void setFilled(boolean fill){
         filled = fill;
     }
    @Override
    public String toString(){
        return "Shape - " +
                "color='" + color + '\'' +  ", filled=" + filled;
    }
}
