public class mainclass
{
    public static void main(String args[])
    {
        dog d=new dog();
        pet p=d;
        animal a=d;
        d.walk();
        p.walk();
    }
}