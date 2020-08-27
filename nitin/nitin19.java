import java.util.Scanner;
class nitin19
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        float n=s.nextFloat();
        float result=0;
        for(float i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                result=result-1/i;
                
            }
            else
            result=result+1/i;


        }
        System.out.println(result);
    }
}