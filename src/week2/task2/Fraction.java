package week2.task2;

public class Fraction {
     // TODO: khai báo các thuộc tín
    private int numerator;
    private int denominator;


    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        int a= this.numrator, b= this.denominator;
        while (a!=b){
            if (a>b) a= a-b;
            else b= b-a;
        }
        
        this.numerator = numerator/a;
        this.denominator = denominator/b;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction a = new Fraction(0,0);
        if(this.denominator == other.denominator){
            a.denominator = other.denominator;
            a.numerator = this.numerator+other.numerator;
        }
        else {
            a.numerator = other.denominator*this.numerator+this.denominator*other.numerator;
            a.denominator = other.denominator*this.denominator;
        }
        return a;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction a = new Fraction(0,0);
        if(this.denominator == other.denominator){
            a.denominator = other.denominator;
            a.numerator = this.numerator-other.numerator;
        }
        else {
            a.numerator = other.denominator*this.numerator-this.denominator*other.numerator;
            a.denominator = other.denominator*this.denominator;
        }
        return a;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction a = new Fraction(0,0);
         a.numerator = this.numerator*other.numerator;
         a.denominator = other.denominator*this.denominator;
        return a;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction a = new Fraction(0,0);
        a.numerator = this.numerator*other.denominator;
        a.denominator = this.denominator*other.numerator;
        return a;
    }
    
    public boolean equals(Object  obj) {
        Fraction other= (Fraction) obj;
        if(this.numerator*other.denominator==other.numerator*this.denominator){
        return true;}
        else{
            return false;
        }
    }
    
    //public static void main(String[] args) {
    //   Fraction a1 = new Fraction(2,5);
    // Fraction a2 = new Fraction(4,5);
    //     Fraction add = new Fraction(5,0);
    //   add = a1.add(a2);
    //   System.out.println(add.denominator);
   // }
}
