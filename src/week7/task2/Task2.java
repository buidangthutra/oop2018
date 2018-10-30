package week7.task2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {
    int a,b;
    int[] c = new int[5];
    public int Arithmetic(int x,int y) {
        a=x;
        b=y;
        if(y==0){
            throw new ArithmeticException("Error!");
        }
        return a/b;
    }
    
    public void fileNotFoud() throws FileNotFoundException{
        throw new FileNotFoundException();
    }

    public void ArrayIndex() throws ArrayIndexOutOfBoundsException{
        System.out.println(c[9]);
    }
    
    public void ClassCastException() throws ClassCastException{
     throw new ClassCastException();
    }
    
    public void NullPointerException() throws NullPointerException{
        throw new NullPointerException();
    }
    
    public void IOException() throws IOException{
        throw new IOException();
    }
    
    public static void main(String[] args) {
        Task2 a = new Task2();
        try{
            a.fileNotFoud();
            a.Arithmetic(5, 0);
            a.ArrayIndex();
            a.ClassCastException();
            a.IOException();
            a.NullPointerException();
//        } catch(IOException e){
//            
//        }
//        catch(NullPointerException e){
//            
//        }
//        catch(ClassCastException e){
//            
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            
//        }
//        catch(ArithmeticException e){
//            
        }
        catch(Exception e){
            
        }
        
    }
    
}
