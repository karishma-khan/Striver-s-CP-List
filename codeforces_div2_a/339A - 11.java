import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        String s1;
        s1=sc.next();
        int n=s1.length();
        char a[]=new char[n/2+1];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                a[j]=s1.charAt(i);
                j++;
            }
        }
        // System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        // System.out.println(Arrays.toString(a));
        s1=Character.toString(a[0])+"";
        for(int i=1;i<j;i++)
        {
            s1=s1+"+"+Character.toString(a[i]);
        }
        System.out.println(s1);
    }
}
