import java.util.Scanner;
class nitin38
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number of student");

        int n=s.nextInt();
        int[] marks=new int[n];
        System.out.println("enter the marks");
        for(int i=0;i<n;i++)
        {
            marks[i]=s.nextInt();
        }
        int averagemarks=0;
        for(int i=0;i<n;i++)
        {
            averagemarks +=marks[i];
            
        }
        averagemarks /=n;
        System.out.println("the average marks are"+averagemarks);

    }
}