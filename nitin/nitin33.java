import java.util.Scanner;
class nitin33
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=n;
        int sum=0;

        while(a>0)
        {
            int lastdigit=a%10;
            a=a/10;
            sum=sum+lastdigit;
            
        }
          

            
            System.out.println(sum);
        
        
    }
    
}