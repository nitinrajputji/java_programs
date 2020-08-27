public class student
{
    private  String name;
     private int age;

     public int getAge()

     {
         return age;


     }
     public void setAge(int age)
     {
         if(age>20)
         {
             System.out.println("you are not select");

         }
         else{
         this.age=age;
         }
     }
    
}