package week5_6;
/**
 *class Triangle ke thua shape
 */
public class Triangle extends Shape{
    private point a,b,c;
/**
 *lay gia tri cho canh thu 1
 * @return tra ve gia tri cho diem a
 */    
    public point getA(){
        return a;
    }
/**
 *lay gia tri cho canh thu 1
 * @return tra ve gia tri cho diem b
 */    
    public point getB(){
        return b;
    }
/**
 *lay gia tri cho canh thu 3
 * @return tra ve gia tri cho diem c
 */     
    public point getC(){
        return c;
    }
/**
 *gan gia tri cho canh thu 1
 * @param a la bien dinh 1
 */  
    public void setA(point a){
        this.a = a;
    }
 /**
 *gan gia tri cho canh thu 2
 * @param b la bien dinh 2
 */     
    public void setB(point b){
        this.b = b;
    }
 /**
 *khoi tao tri cho canh thu 3
 * @param c la bien dinh 3
 */     
    public void setC(point c){
        this.c = c;
    }
/**
 *khoi tao tri cac canh cho tam giac
 * @param a la bien dinh 1
 * @param b la bien dinh 2
 * @param c la bine dinh 3
 */      
    public Triangle(point a, point b, point c){
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
        super(color,fill,p);

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
