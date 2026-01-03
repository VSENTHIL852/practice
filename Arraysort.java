import java.util.*;
public class Arraysort{
    public static void main(String[] args){
        int[] arr={10,80,90,1,2,3,40,20};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
