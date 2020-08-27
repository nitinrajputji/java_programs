import java.util.Scanner;
class nitin8
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int result=0;
        if(a<b)
        {
            if(a<c)
            {
                result=a;
            }
               else
               {
                   result=c;
               }      
        }
             else
              {
                 if(b<c)
                 { 
                   result=b;
                 }
                   else
                   {
                       result=c;
                   }
               }
        System.out.print("smallest no. is "+result);
        

    }
}