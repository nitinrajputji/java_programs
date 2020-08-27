import java.util.Scanner;
class nitin5
{
    public static void main(String args[])
    {
         Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        
        if(a <10)
        {
            System.out.println("no. is less then 10");

        }
        else
        if(a>10&&a<20)
        {
            System.out.println("no. is greater then 10 and less then20");

        }
        else
        if(a>20&&a<30)
        {
            System.out.println("no. is greater then 20 and less then 30");

        }
        else
        {
            System.out.println("no. is greater then 30");

        }
    
    }
}