import java.util.Scanner;
class nitin32
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
         
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
             
        
        
            for(int j=1;j<=n-i+1;j++)
            {
                
                System.out.print("*   ");
                
            }
             System.out.println();
        }
            
         
        
            
        
    }
}