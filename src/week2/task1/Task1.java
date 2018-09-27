package week2.task1;


public class Task1 {
     public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        if(b==0) return a;
            return gcd(b,a%b);
    }

    public static int fibonacci (int n)
	{
		if ( n ==0 ) return 0;
		if ( n ==1 ) return 1;
		else return fibonacci(n-1)+fibonacci(n-2);
		
	}
   // public static void main(String[] args) {
   //     System.out.println("UCLN: "+gcd(5,2));
   //     System.out.println("Fibonacci: "+fibonacci(5));
   // }
}
