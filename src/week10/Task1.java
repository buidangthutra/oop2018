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
     
      public String findFunctionByName(String Name) throws IOException{
        String path = "D:\\Learning\\Java\\oop2018\\src\\week9\\Utils.java";
	List<String> a = getAllFunction(path);
        
        String c=null;
        
        for(int i=0; i<a.size();i++){
            String b = a.get(i);
            b = b.substring(4);
            b = b.replaceAll(" path","");
            b = b.replaceAll(" folderPath", "");
            b = b.replaceAll(" fileName","");
            b= b.replace("{", "");
            
//            System.out.println(b);
            if(Name.equals(b)) c = b;
        }
        
        return c;
     }
     
     public static void main(String[] args) {
        Task1 a = new Task1();
         try {
             List<String> b = new ArrayList<String>();
             b = a.getAllFunction("D:\\Learning\\Java\\oop2018\\src\\week9\\Utils.java");
             
             for(int i=0; i<b.size();i++){
                 System.out.println(b.get(i));
             }
             System.out.println("");
             System.out.println(a.findFunctionByName("public static void writeContentToFile(String)"));
             
         } catch (IOException ex) {
             System.out.println("Erro!");
         }
        
    }
}


