import java.util.*;
class Avg
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            sum=sum+a[i];
        }
       System.out.print(sum/n);
}
}



