public class mainclass implements  student, utube
{
    public static void main(String args[])
    {
        mainclass obj=new mainclass();
        obj.study();
        obj.makevideo();
        

    }
   public void study()
   {

        System.out.println("person is studying");

    }
    public void makevideo()
    {
        System.out.println("person is making video");

    }
}