import java.util.*;
class 1to10
{
    public static void main(String hj[])
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int c=0;
        for(int i=1;i<=10;i++)
        {
            if(a==i)
            {
                c++;
            }
        }
        if(c==1)
             System.out.print("yes");
        else
        System.out.println("no");
}
}



