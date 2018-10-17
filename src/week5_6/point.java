
package week5_6;

/**
 *class point
 * @author buidangthutra;
 */
public class point {
    private int a,b;
/**
 *lay tri cho tao do x
 * @return  gia tri cua a
 */      
    public int getA(){
        return a;
    }
 /**
 *khoi tao gia tri cho a
 * @param x la bien tao do a
 */     
    public void setA(int x){
        a=x;
    } 
/**
 *lay tri cho toa do y
 * @return  gia tri cua b
 */    
     public int getB(){
        return b;
    }
 /**
 *khoi tao gia tri cho b
 * @param x la bien tao do b
 */     
    public void setB(int x){
        b=x;
    } 
  /**
 *ham tra ve khi tao do trung nhau
 * @param a la bien point
 * @return true neu trung nhau
 */    
    public boolean samePoint(point a){
        if(a.getA()==this.a && a.getB()==this.b)
            return true;
        return false;
    }
}
