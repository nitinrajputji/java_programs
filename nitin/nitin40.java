import java.util.Scanner;
class nitin40
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter rows");
        int rows=s.nextInt();
        System.out.println("enter cols");
        int cols=s.nextInt();
        int a[][]=new int [rows][cols];
        int b[][]=new int [rows][cols];
        System.out.println("enter array a");

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                
                a[i][j]=s.nextInt();
            }

        }
        System.out.println("enter array b");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                b[i][j]=s.nextInt();
            }
        }
        int c[][]=new int[rows][cols];
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("result array is");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
        System.out.print(c[i][j]+" "); 
            }
            System.out.println();
        }



    }
}