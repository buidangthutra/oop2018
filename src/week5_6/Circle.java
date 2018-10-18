
package week5_6;

/**
 *class Circle ke thua Shape
 * @author buidangthutra;
 */
public class Circle extends Shape{
    protected final double PI=3.14;
    protected double radius;

 /**
 *ham khoi tao mac dinh Cricle
 */
    public Circle(){
        
    }
 /**
 *ham khoi tao Cricle
 * @param rad gia tri cau radius
 */        
    public Circle(double rad) {
        this.radius = rad;
    }
 /**
 *ham khoi tao ham Cricle
 * @param rad la bien radius
 * @param  col la bien color
 * @param fill la bien filled
 * @param  p la bine foint
 */   
    public Circle(double rad, String col, boolean fill ,point p ){
        super(col,fill,p);
        radius = rad;
        
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
 *kiem tra hai hinh bang nhau
 * @param c1 la bien Shape
 * @return tra ve true hoac fales 
 */  
    public boolean sameCircle(Shape c1){
        Circle c2 = (Circle)c1;
        if(c2.getRadius() == this.getRadius()&&c2.getPoint().samePoint(this.getPoint()))
        return true;
        return false;
    }

}
