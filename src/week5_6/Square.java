
package week5_6;


/**
 *class Square ke thua class Rectangle
 * @author Thu Tra
 */
public class Square extends Rectangle{
    
    private double side; 
    
 /**
 *ham khoi tao mac dinh Square
 */
    public Square(){
        
    }
 /**
 *ham khoi tao Square
 * @param side gia tri cau side
 */    
    public Square(double side) {
        this.side = side;
    }
 /**
 *ham khoi tao ham Square
 * @param side la bien side
 * @param  col la bien color
 * @param fill la bien filled
 * @param p la bien point
 */      
    public Square(double side, String col, boolean fill ,point p ){
        this.side = side;
        super.setColor(col);
        super.setFilled(fill);
        super.setPoint(p);
    }
/**
 *lay gia tri cho side
 * @return tra ve gia tri side
 */
    public double getSide(){
        return side;
    }
/**
 *gan gia tri cho side
 * @param side la bien side
 */    
    public void setSide(double side) {
        this.side = side;
    }
    
 /**
 *lay gia tri cho width 
 * @param side la bien lay width
 */
    public void setWidth(double side) {
        super.setWidth(side);
    }
/**
 *lay gia tri length
 * @param side lay gia tri lenngth
 */    
    public void setLength(double side) {
        super.setLength(side);
    }
    
}