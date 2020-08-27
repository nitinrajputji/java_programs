import java.util.Scanner;
class nitin11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no.");
        int a=sc.nextInt();

        System.out.println("enter second no.");
        int b=sc.nextInt();

        System.out.println("enter the operation");
         sc.nextLine();
         char operation=sc.nextLine().charAt(0);
         int result=0;
         switch(operation)
         {
             case '+':
             result=a+b;
             break;
             case '-':
             result=a-b;
             break;
             case '*':
             result=a*b;
             break;
             case '/':
             result=a/b;
             break;
             default:
             System.out.println("invalid opreation");

         }
         System.out.println("the result is"+result);


    }
}