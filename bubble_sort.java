//bubble sort
import java.util.*;
class bubble_sort{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
 System.out.println("Enter size:");
      int n=s.nextInt();
       
      
      int[] arr=new int[n];
 System.out.println("Enter elements:");
      
      for(int i=0;i<n;i++){
            arr[i]=s.nextInt();

                          }
      for(int i=0;i<n-1;i++){
           for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;}
   
                                    }
      

                            }
     for(int i=0;i<n;i++){
              System.out.println(arr[i]);

}
                          }


}