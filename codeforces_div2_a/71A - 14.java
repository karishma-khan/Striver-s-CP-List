import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String s[]=new String[n];
      String a[]=new String[n];
      for(int i=0;i<n;i++)
      {
          s[i]=sc.next();
      }
      for(int i=0;i<n;i++)
      {
          int l=s[i].length();
          if(l<=10)
          {
              a[i]=s[i];
          }
          else{
              String b=Character.toString(s[i].charAt(0))+Integer.toString(l-2)+Character.toString(s[i].charAt(l-1));
              a[i]=b;
          }
      }
      for(int i=0;i<n;i++)
      {
          System.out.println(a[i]);
      }
    }
}
