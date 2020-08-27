class cat
{
    boolean hasFur;
    String color,breed;

    int legs,eyes;
    public void walk()
    {
        System.out.println("cat is walking");

    }
    public void eat()
    {
        System.out.println("cat is eating");
    }
    public void description()
    {
        System.out.println("my cat has  " + legs +  " legs and  " + eyes + "  eyes  ");
    }
}
    class dog
    {
        String breed,name;
        public void jump()
        {
            System.out.println(" my dog " + name + " jumped ");
        }
        public void decription()
        {
            System.out.println("my dogs name is "  + name  +  "  and its breed is  " +  breed);
        }
        

    }
    public class rajput1
    {
        public static void main(String args [])
        {

            dog dog1=new dog();
            dog dog2=new dog();

            dog1.name="silpa";
            dog1.breed="desi";

            dog2.name="tiger";
            dog2.breed="germnsapt";
            
            dog1.decription();
            dog2.decription();

            dog1.jump();
            dog2.jump();

            
            cat cat1=new cat();
            cat cat2=new cat();

            cat1.legs=3;
            cat1.eyes=2;

            cat2.legs=4;
            cat2.eyes=1;




         cat1.description();
         cat2.description();
            
            
        }

    }

    
