import java.util.*;
class Rev2
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         int m=in.nextInt();
         n=n+m;
         m=n-m;
         n=n-m;
         System.out.print(n+" "+m);
}
}


