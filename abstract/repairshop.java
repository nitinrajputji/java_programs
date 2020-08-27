public class repairshop 
{
    
    public static void main(String args[])
    {
        wagonr Wagonr=new wagonr();
        audi Audi=new audi();
        repaircar(Wagonr);
        repaircar(Audi);


    }
    public static void repaircar(car car)
    {
        System.out.println("car is repaired");

    }
    
}