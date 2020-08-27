import java.util.Scanner;
class nitin41
{
    public static void main(String args[])
    {

    
    Scanner s=new Scanner(System.in);
    System.out.println("enter rows and cols of matrix a is ");
    int m=s.nextInt();
    int n=s.nextInt();
    int a[][]=new int[m][n];
    System.out.println("enter rows and cols of matrix b is");
    int p=s.nextInt();
    int q=s.nextInt();
    int b[][]=new int[p][q];
    System.out.println("enter element of first matrix");
    

    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            a[i][j]=s.nextInt();
        }
    }

    System.out.println("enter elements of second matrix");
       for(int i=0;i<p;i++)
    {
        for(int j=0;j<q;j++)
        {
            b[i][j]=s.nextInt();
        }

    }
    int c[][]=new int[m][p];
    System.out.println("product of matrix");
       for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
        
            for(int k=0;k<m;k++)
            {
                c[i][j]+=a[i][k]*b[k][j];
            }
            System.out.print(c[i][j]+" ");

            
        }
        System.out.println();
    }

    }
}