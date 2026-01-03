import java.util.*;
public class Removeduplicatearray{
    public static void main(String[] args){
        int[] arr={10,10,20,20,30,30,40,40,50,50};
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int i:arr){
            set.add(i);
        }
        System.out.print(set);
    }
}
