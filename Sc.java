import java.util.*;
class Sc
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         String a=in.next();
         int d=0;
         for(int i=0;i<a.length();i++)
         {
             if(Character.isLetter(a.charAt(i))|| Character.isDigit(a.charAt(i)))
             {
                
             }
             else
             d++;
         }
         System.out.print(d);
}
}


