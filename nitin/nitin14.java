import java.util.Scanner;
class nitin14
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int factriol=1;
        for(int i=n;i>=1;i--)
        {
            factriol=factriol*i;
            
        }
        System.out.println(factriol);
    }
}