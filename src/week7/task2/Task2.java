package week7.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    int a,b;
    int[] c = new int[3];
    int[] d;
     public int Arithmetic(int x,int y) {
        a=x;
        b=y;
        if(y==0){
            throw new ArithmeticException("Error!");
        }
        return a/b;
    }
    
    public void fileNotFoud() throws FileNotFoundException{
        File f = new File("abc");
        FileReader a = new FileReader(f);
    }

    public void ArrayIndex() throws ArrayIndexOutOfBoundsException{
        System.out.println(c[5]);
    }
    
    public void ClassCastException() throws ClassCastException{
     Object t = new Integer(4);
     String h = (String) t;
    }
    
    public void NullPointerException() throws NullPointerException{
        System.out.println(d.length);
    }
    
    public void IOException() throws IOException{
        File f = new File("abc");
        FileReader a = new FileReader(f);
    }
    
    public static void main(String[] args) {
        Task2 a = new Task2();
        try{
            a.fileNotFoud();   
        } catch(FileNotFoundException e){
            System.out.println(e);
        }
        try{
             a.Arithmetic(5, 0);
        }
         catch(ArithmeticException e){
            System.out.println(e);
        }
        try{
             a.ArrayIndex();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try{
            a.ClassCastException();
        }catch(ClassCastException e){
            System.out.println(e);
        }
        try{
            a.IOException();
        }catch(IOException e){
            System.out.println(e);
        }
        try{
            a.NullPointerException();
        }catch(NullPointerException e){
            System.out.println(e);
        }
    }
}

