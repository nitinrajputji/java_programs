import java.util.Scanner;
class nitin35
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        int reversenumber=0;
        int sum=0;
        
        
        while(temp>0)
        {
          int  reverse=temp%10;
           temp=temp/10;
           reversenumber=reversenumber*10+reverse;
           
           sum=sum+reverse;
        }
        System.out.println(reversenumber);
        if(reversenumber==n)
        {
            System.out.println("number is palindrom");

        }
        else
        {
            System.out.println("number is not palindrom");

        }
        
        
        System.out.println();
        System.out.println(sum);
    }
}