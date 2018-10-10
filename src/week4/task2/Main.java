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
public class Main {
    public static void main(String[] args) {
        Cricle c = new Cricle();
        c.setRadius(3);
        System.out.println(c.toString());
        
        Rectangle r = new Rectangle();
        r.setLength(5);
        r.setWidth(4);
        System.out.println(r.toString());
        
        Square s = new Square();
        s.setSide(6);
        System.out.println(s.toString());
        
    }
}
