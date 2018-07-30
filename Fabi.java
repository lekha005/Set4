import java.util.*;
class Fabi
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0,b=1,c=1;
        for(int i=0;i<n;i++)
        {
            a=b;
            b=c;
            c=a+b;
        System.out.print(a+" ");
        }
}
}


