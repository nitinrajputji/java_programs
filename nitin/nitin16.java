import java.util.Scanner;
class nitin16
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
         System.out.println("enter a");
        int a=s.nextInt();
        
        int result=1;
        System.out.println("enter b");
        int b=s.nextInt();
        
        for(int i=1;i<=b;i++)
        {
            result=result*a;
            
        }
        System.out.println(result);
    }
}