//selection sort
import java.util.*;
class selection_sort{
      public static void main(String[] args){
             int n,min_idx;
Scanner s=new Scanner(System.in);
System.out.println("Enter size of index:");
             n=s.nextInt();
             int[] arr=new int[n];
             
             
 System.out.println("Enter elements:");            
for(int i=0;i<n;i++){
        arr[i]=s.nextInt();

}
for(int i=0;i<n-1;i++){
 min_idx=i;
for(int j=i+1;j<n;j++){
if(arr[j]<arr[min_idx])
         min_idx=j;
}
int temp=arr[min_idx];
arr[min_idx]=arr[i];
arr[i]=temp;


}
for(int i=0;i<n;i++){
System.out.println(arr[i]+" ");
}


}


}