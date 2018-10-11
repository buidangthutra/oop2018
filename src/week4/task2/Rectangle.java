
package week4.task2;

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
 */      
    public Rectangle(double w,double l, String c, boolean f){
        width = w;
        length = l;
        color = c;
        filled = f;
    }
 /**
 *ham tra ve gai tri cho Width
 * @return tra ve gia tri width
 */     
    public double getWidth(){
        return width;
    }
    
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
    
    public void setLength(double leng) {
        length = leng;
    }
 /**
 *phuong thuc tinh dien tich
 * @return tinh dien tich va tra ve gia tri dien tich
 */     
    public double getArea() {
        return length*width;
    }
 /**
 *phuong thuc tinh chu vi
 * @return tinh chu vi va tra ve gia tri chu vi
 */      
    public double getPerimeter(){
        return (length+width)*2;
    }
/**
 *ham tra ve thong tin day du cua Rectangle
 */    
    @Override
    public String toString(){
        return "Rectange - "+"width: "+this.width
                + ", "+   "length: "+this.length + ", "+   "Area: "+this.getArea()
                + ", "+   "Perimeter: "+this.getPerimeter();
    }
}