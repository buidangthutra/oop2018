
package week4.task2;

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
 */      
    public Square(double side, String col, boolean fill  ){
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
/**
 *ham tra ve thong tin day du cua Square
 */
    @Override
    public String toString(){
        return "Square - "+"side: "+this.side+ ", "+   "Area: "+this.getArea()
                + ", "+   "Perimeter: "+this.getPerimeter();
    }
}