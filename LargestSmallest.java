import java.util.*;
public class LargestSmallest{
    public static void main(String[] args){
        int[] arr={10,20,30,40,50,60,90};
        int l=Integer.MIN_VALUE;
        int s=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                l=arr[i];
            }
            if(arr[i]<s){
                s=arr[i];
            }
        }
        System.out.println(l);
        System.out.println(s);
    }
}
