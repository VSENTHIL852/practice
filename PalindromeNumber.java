import java.util.*;
public class PalindromeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tmp=n;
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println((tmp == rev)?"palindrome":"not");
        
    }
}
