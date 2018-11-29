package week12;

interface sort{
    public void sx(int a[]);
    
}
    
    class BubbleSort implements sort{

    @Override
    public void sx(int[] a) {
        int temp = 0;
        for(int i=0; i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    
    class SelectSort implements sort{

        @Override
        public void sx(int[] a) {
            int po=0;
            for(int i=0; i<a.length;i++){
                int j=i+1;
                po=i;
                int temp=a[i];
                for(;j<a.length;j++){
                    if(a[j]<temp){
                        temp=a[j];
                        po=j;
                    }
                }
                a[po]=a[i];
                a[i]=temp;
            }
        }
        
    }
        
    }

public class Task2 {
    sort sort;
    
    public void setSort(sort s){
        this.sort = s;
    }
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        int a[]={2,3,1,8,4,9,0,10,6};
        
        
        task2.setSort(new BubbleSort());
        task2.sort.sx(a);
        for(int i=0; i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
