import java.util.*;
public class MergeTwoArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        int[] arr3=new int[n+n];
        int k=0;
        for(int i=0;i<n;i++){
            arr3[k++]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr3[k++]=arr2[i];
        }
        
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
