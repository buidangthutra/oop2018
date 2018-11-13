package week10;

public class Task2 {
  public static void main(String[] args)  {
        int value = 1000;
        int[] arr = new int[value];
        try{
        
        for(int i=0; i< value; i++){
            Random rd = new Random();
            int a =1+ rd.nextInt(500);
            arr[i] = a;
        }
        
        for(int i=0; i<value; i++){
            System.out.print(arr[i] + "\t");
        }
        
        for(int i=0; i<value-1;i++){
            for(int j=0; j < value-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int b = arr[j];
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
