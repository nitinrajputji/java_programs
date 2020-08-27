import java.util.Scanner;
class nitin10
{

    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int dayOfWeek=s.nextInt();
       switch(dayOfWeek)
       {
           case 1:
           System.out.println("i am on leave");
           break;

        
            case 2:
            System.out.println("i am in office");
            break;

            case 3:
            System.out.println("i am playing");
            break;
            default:
            System.out.println("i dont know what day it is");
        } 
    }
}