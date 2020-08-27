import java.util.Scanner;
class nitin17
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a no.");
        
        int n=s.nextInt();
        boolean isprime=true;

        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                
                isprime=false;
                break;
            }

            
        }
        
        if(n<2)
        {
            isprime=false;
        }
        System.out.println(isprime);
        
    }
}