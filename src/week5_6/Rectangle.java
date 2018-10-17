
package week5_6;


/**
 *class Cricle ke thua class Shape
 * @author Thu Tra
 */
public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

 /**
 *ham khoi tao mac dinh Rectangle
 */
    public Rectangle(){
         
    }
 /**
 *ham khoi tao Rectangle
 * @param  width gia tri cau  width
 * @param length gia tri cua length
 */         
    public Rectangle(double width,double length) {
        this.width = width;
        this.length = length;
    }
 /**
 *ham khoi tao ham Rectangle
 * @param w la bien radius
 * @param c la bien color
 * @param  l la bien color
 * @param f la bien filled
 * @param p la bien point
 */      
    public Rectangle(double w,double l, String c, boolean f,point p){
        width = w;
        length = l;
        color = c;
        filled = f;
        point = p;
    }
 /**
 *ham tra ve gai tri cho Width
 * @return tra ve gia tri width
 */     
    public double getWidth(){
        return width;
    }
/**
 *ham khoi tao gia tri cho width
 * @param wid la bien width 
 */    
    public void setWidth(double wid) {
        width = wid;
    }
 /**
 *ham tra ve gai tri cho length
 * @return tra ve gia tri length
 */     
    public double getLength() {
        return length;
    }
/**
 *tra ve gia tri cho length
 * @param leng la bien length
 */    
    public void setLength(double leng) {
        length = leng;
    }
    
/**
 *ham tim cac hinh chu nhat giong nhau
 * @param c1 la bien Shape
 * @return  true neu giong
 */
    public boolean sameRectangle(Shape c1){
        Rectangle c2 = (Rectangle)c1;
        if(c2.getWidth() == this.getWidth() && c2.getLength() == this.getLength())
        return true;
        return false;
    }
}