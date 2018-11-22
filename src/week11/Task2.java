package week11;

import java.util.ArrayList;

public class Task2 {
  public static <T extends Comparable<T>> void  sapxep(T[] a){
        
        for(int i=0; i<a.length-1; i++) {
            for(int j=0; j<a.length-1; j++) {
                if(a[j].compareTo(a[j+1]) < 0) {
                    T b = a[j];
                    a[j] = a[j+1];
                    a[j+1] = b;
                }
            }
        }
    }
    
        public static <T> void print(T[] a){
            System.out.println(a[0]);
            
    }
        
    public static void main(String[] args) {
        Character[] cha = {'e','n','m','p','s','t','q'};
        sapxep(cha);print(cha);
        
        Integer[] in ={6,3,4545,89,2313,86,34,9,23123};
        sapxep(in);print(in);
        
        Double[] dou = {9.45,342.34,45.53,2.74,5.34,2.56,8.0};
        sapxep(dou);print(dou);
        
        Byte[] byt = {5,34,3,6,7,5,86};
        sapxep(byt);print(byt);
        
        Float[] floa = {2.3f,56.4f,45.3f,2.28f,19.7f,39.5f};
        sapxep(floa);print(floa);
        
        Short[] shor = {4,54,65,3,23,123,44,75};
        sapxep(shor);print(shor);
        
        Long[] lo = {4345l,78l,443l,556l,431l,62l,57l,978l};
        sapxep(lo);print(lo);
        
    }
}
