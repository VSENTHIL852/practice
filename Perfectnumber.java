import java.util.*;
public class Perfectnumber{
    public static void main(String[] args){
        int n=26;
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i == 0){
                sum=sum+i;
            }
        }
        System.out.println((sum == n)?" Perfect number":"Not a perfect number");
    }
}
