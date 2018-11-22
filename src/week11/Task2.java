package week11;

import java.util.ArrayList;

public class Task2 {
 public static <T extends Comparable<T>> T sosanh(T[] a){
        T max = a[0];
        
        for(int i=0; i<a.length-1;i++){
        if(a[i].compareTo(max) > 0)
        max = a[i];
            }
        return max;
    }
        
    public static void main(String[] args) {
        Character[] cha = {'e','n','m','p','s','t','q'};
        System.out.println(sosanh(cha));
        
        Integer[] in ={6,3,4545,89,2313,86,34,9,231};
        System.out.println(sosanh(in));
        
        
        Double[] dou = {9.45,342.34,45.53,2.74,5.34,2.56,8.0};
        System.out.println(sosanh(dou));
        
        Byte[] byt = {5,34,3,6,7,5,86};
        System.out.println(sosanh(byt));
        
        Float[] floa = {2.3f,56.4f,45.3f,2.28f,19.7f,39.5f};
        System.out.println(sosanh(floa));
        
        Short[] shor = {4,54,65,3,23,123,44,75};
        System.out.println(sosanh(shor));
        
        Long[] lo = {4345l,78l,443l,556l,431l,62l,57l,978l};
        System.out.println(sosanh(lo));
        
    }
}
