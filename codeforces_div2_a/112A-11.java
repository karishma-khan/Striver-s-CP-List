import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        s1=sc.next();
        s2=sc.next();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int x;
        x=s1.compareTo(s2);
        if(x==0)
        System.out.println(0);
        else if(x>0)
        System.out.println(1);
        else
        System.out.println(-1);
        
    }
}
