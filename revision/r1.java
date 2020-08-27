import java.util.Scanner;
class r1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=10;i++)
        {
            int table=n*i;
            System.out.println(n+"*"+i+"="+table);
        }
        
    }
}