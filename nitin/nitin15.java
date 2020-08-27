import java.util.Scanner;
class nitin15
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0;i<n-2;i++)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }
        
        
    }

}