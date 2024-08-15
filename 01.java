1.

import java.util.*;
class Myclass
{
   public void reverseString(String str)
   {
        String r="";
        String[] s=str.split(" ");
        for (String i:s)
        {
          StringBuffer s1=new StringBuffer(i);
          r=r+s1.reverse()+" ";
        }
        System.out.println(r);
   }
}
public class Project1 
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Myclass ob=new Myclass();
        ob.reverseString(str);
    }   
 }
