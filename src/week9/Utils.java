package week9;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Utils {
    
    public static String readContentFromFile(String path) throws FileNotFoundException{
        File file = new File(path);
        
        String line = null; 
        
        try(Scanner sc = new Scanner(file)){
            line = sc.nextLine();
            while(sc.hasNext()){
                String a = sc.nextLine();
                line = line + '\n' + a;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    return line;
}
    
    public static void writeContentToFile(String path){
        File file = new File(path);
        try(FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter wr = new PrintWriter(bw)){
            
            wr.println("toi la nguoi mo dao");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void writeContentToFile0(String path){
        File file = new File(path);
        try(FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter wr = new PrintWriter(bw)){
            
            wr.println("Con cho nao la cua toi");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static File findFileByName(String folderPath, String fileName){
        File dirs = new File(folderPath);
        File f=null;
        
        
        for(File file:dirs.listFiles()){
//            System.out.println(file.getName());
            if(file.getName().equals(fileName)){
               f = file; 
            }
        }
        
        return f;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(readContentFromFile("Tra.txt"));
        writeContentToFile0("Tra.txt");
//        writeContentToFile("Tra.txt");
        
        System.out.println(findFileByName("D:/Learning/Java/oop2018", "Tra.txt"));
    }
}
