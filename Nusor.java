import java.util.*;
class Nusor
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
        String[] a=in.nextLine().split(" ");
        int m=0;
        for(int i=0;i<a.length;i++)
        {
            int y=Integer.valueOf(a[i]);
         if(y>m)
         {
             m=y;
         }
        }
        System.out.println(m);
}
}


