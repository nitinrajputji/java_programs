public class mainclass
{
    public static void main(String args[])
    {
        
        teacher t1=new teacher();
        
        singer s1=new singer();
        person p=t1;//upcasting
        teacher t=(teacher)p;//downcasting

        
        
        boolean n=t1 instanceof teacher;

        System.out.println(t1 instanceof teacher);
        System.out.println(t1 instanceof person);
        System.out.println(s1 instanceof singer);
        System.out.println(s1 instanceof person);
        System.out.println(p instanceof singer);
    

      
    }
}