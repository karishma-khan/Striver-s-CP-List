import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.replace("a","");
        s=s.replace("e","");
        s=s.replace("i","");
        s=s.replace("o","");
        s=s.replace("u","");
        s=s.replace("y","");
        s=s.replace("A","");
        s=s.replace("E","");
        s=s.replace("I","");
        s=s.replace("O","");
        s=s.replace("U","");
        s=s.replace("Y","");
        s=s.toLowerCase();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            s=s.substring(0,i)+"."+Character.toString(s.charAt(i))+s.substring(i+1);
            i++;
            n++;
        }
        System.out.println(s);
    }
}
