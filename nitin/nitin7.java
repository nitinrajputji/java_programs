class nitin7
{
    public static void main(String args[])
    {
        int a=24;
        int b=100;
        int c=16;
        int result=0;
        if(a>b)
        {
            if(a>c)
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
                   if(b>c)
                   {
                       result=b;
                   }
                   else
                   {
                       result=c;
                   }
                   
               }
               System.out.print("the max. no is "+result);

        
    }
}