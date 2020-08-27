import java.util.Scanner;
class nitin34
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a no.");
        int n=s.nextInt();
        

        int sumofdigit=(int)Math.log10(n)+1;
        System.out.println(sumofdigit);
        int c=sumofdigit;
         
         
        int sum=0;
        for(int i=1;i<=c;i++)
        {
          int  d=n%10;
          n=n/10;
          sum=sum+d;
        }
          System.out.println(sum);

        


    }
}