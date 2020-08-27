import java.util.Scanner;
class nitin18
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        float n=s.nextFloat();
        float result=0;
        for(float i=1;i<=n;i++)
        {
            result=result+1/i;


        }
        System.out.println(result);
    }
}