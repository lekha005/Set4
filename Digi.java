import java.util.*;
class Digi
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         String a=in.next();
         int d=0;
         for(int i=0;i<a.length();i++)
         {
             int y=Integer.valueOf(a.charAt(i))-'0';
             if(y>=0 && y<=9)
             {
                 d++;
             }
         }
         System.out.print(d);
}
}


