package week5_6;
/**
 *class Triangle ke thua shape
 */
public class Triangle extends Shape{
    private int a,b,c;
/**
 *lay gia tri cho canh thu 1
 * @return tra ve gia tri cho canh 1
 */    
    public int getA(){
        return a;
    }
/**
 *lay gia tri cho canh thu 1
 * @return tra ve gia tri cho canh 2
 */    
    public int getB(){
        return b;
    }
/**
 *lay gia tri cho canh thu 3
 * @return tra ve gia tri cho canh 3
 */     
    public int getC(){
        return c;
    }
/**
 *gan gia tri cho canh thu 1
 * @param a la bien canh 1
 */  
    public void setA(int a){
        this.a = a;
    }
 /**
 *gan gia tri cho canh thu 2
 * @param b la bien canh 2
 */     
    public void setB(int b){
        this.b = b;
    }
 /**
 *khoi tao tri cho canh thu 3
 * @param c la bien canh 3
 */     
    public void setC(int c){
        this.c = c;
    }
/**
 *khoi tao tri cac canh cho tam giac
 * @param a la bien canh 1
 * @param b la bien canh 2
 * @param c la bine canh 3
 */      
    public Triangle(int a, int b, int c){
        this.a=a;
        this.b=b; 
        this.c = c;
    }
 /**
 *khoi tao gia tri mac dinh cho triangle
 */     
    public Triangle(){
        
    }
 /**
 *khoi tao gia tri cho dac tinh cua triangle
 * @param color la bien Color
 * @param fill la bien filled
 * @param p la bien point
 */     
    public Triangle(String color, boolean fill,point p){
        this.color=color;
        this.filled=fill;
        point = p;

    }
 /**
 *ham tra ve tam giac bang nhau
 * @param c1 la hinh shape
 * @return true neu hai hinh giong nhau
 */      
    public boolean sameTriangle(Shape c1){
        Triangle c2 = (Triangle)c1;
        if(c2.getA() == this.getA() && c2.getB() == this.getB() &&c2.getC() == this.getC() )
        return true;
        return false;
    }
}
