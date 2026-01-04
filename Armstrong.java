import java.util.*;
public class Armstrong{
    public static void main(String[] args){
        int n=153;
        int t=n;
        int sum=0;
        while(n>0){ 
            int d=n%10;
            sum=sum+d*d*d;
            n=n/10;
        }
        System.out.println((t == sum)?"armstrong ":"Not armstromng");
        
    }
}
