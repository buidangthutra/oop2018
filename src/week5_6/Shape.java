
package week5_6;


/**
 *class Shape
 * @author Admin
 */
public class Shape {
    String color = "red";
    boolean filled = true;
    point point;
 /**
 *Ham khoi tao gia tri mac dinh Shape
 */   
    public void shape() {
        
    }
 /**
 *Ham khi tao gia tri cho Shape
 * @param col gia tri color
 * @param fill gia tri filled 
 * @param p la bien point
 */    
   public void Shape(String col, boolean fill,point p) {
        color = col;
        filled = fill;
        point = p;
    }
 /**
 *Ham tra ve gia tri mau
 *@return tra ve gia tri Red
 */    
    String getColor() {
    return color;    
    }
 /**
 *Ham lay gia tri cho Color
 * @param col gia tri Color
 */    
    public void setColor(String col) {
        color = col;
    }
 /**
 *
 * @return tinh chu vi va tra ve gia tri filled
 */    
    public boolean isFilled(){
         return filled;
     }
 /**
 *Ham lay gia tri cho Filled
 * @param fill gia tri filled
 */    
   public void setFilled(boolean fill){
         filled = fill;
     }
/**
 *ham tra ve thong tin day du cua Shape
 */
    @Override
    public String toString(){
        return "Shape - " +
                "color='" + color + '\'' +  ", filled=" + filled;
    }
}
