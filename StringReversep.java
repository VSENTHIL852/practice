import java.util.*;
public class StringReversep{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<r){
            char tmp=arr[l];
            arr[l]=arr[r];
            arr[r]=tmp;
            l++;
            r--;
            
        }
        String s=new String(arr);
        System.out.println(s);
    }
}
