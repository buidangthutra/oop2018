package week10;

import java.util.Random;

public class Task2 {
  public static void main(String[] args)  {
        int value = 1000;
        double[] arr = new double[value];
        try{
        
        for(int i=0; i< value; i++){
            Random rd = new Random();
            double a =200 + (rd.nextDouble()*100);
            arr[i] = a;
        }
        
        for(int i=0; i<value; i++){
            System.out.print(arr[i] + "\t");
        }
        
        for(int i=0; i<value-1;i++){
            for(int j=0; j < value-1 ; j++){
                if(arr[j] > arr[j+1]){
                    double b = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = b;
                }
            }
        }
        
        System.out.println();
        for(int i=0; i<value; i++){
            System.out.print(arr[i] + "\t");
        }
    }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro");
    }}
}
