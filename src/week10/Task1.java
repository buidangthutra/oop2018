package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Task1 {
     public List<String> getAllFunction(String path) throws FileNotFoundException, IOException{
         File file = new File(path);
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);
         
         List<String> a = new ArrayList<String>();
         String line = null;
         while((line = br.readLine()) != null){
         if(line.indexOf("static") > 0){
             a.add(line);
         }
         }
         fr.close();
         br.close();
         return a;
     }
     
     public static void main(String[] args) {
        Task1 a = new Task1();
         try {
             System.out.println(a.getAllFunction("D:\\Learning\\Java\\Week5\\src\\oask1.java"));
         } catch (IOException ex) {
             System.out.println("Erro!");
         }
        
    }
}

