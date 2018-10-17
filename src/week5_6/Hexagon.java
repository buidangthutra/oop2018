
package week5_6;

/**
 *class hexagon thua ke shape
 * @author buidangthutra;
 */
public class Hexagon extends Shape {
    private int canh;
/**
 *khoi tao gia tri cho canh
 * @param c la bien canh
 */   
    public void setCanh(int c){
        canh=c;
    }
 /**
 *tra ve gia tri cho anh
 * @return gia tri cua canh
 */    
    public int getCanh(){
        return canh;
    }
 /**
 *ham khoi tao gia tri mac dinh
 */    
    public Hexagon(){
        
    }
 /**
 *khoi tao gia tri hecagon
 * @param color la bien color
 * @param fill la birn cua filled
 * @param p la diam
 */    
    public Hexagon(String color, boolean fill,point p){
        super.setColor(color);
        super.setFilled(fill);
        point = p;
    }
 /**
 *ham tra ve gia tri ttue false cho hinh giong nhau
 * @param c1 la hinh shape
 * @return true neu hai hinh giong nhua
 * @return  false neu hai hinh khac nhau
 */    
    public boolean sameHexagon(Shape c1){
        Hexagon c2 = (Hexagon)c1;
        if(c2.getCanh() == this.getCanh())
        return true;
        return false;
    }
}
