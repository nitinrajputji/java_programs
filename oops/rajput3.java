class dog
{
    int legs;
} 
 
 
 class rajput3
{
    public static void main(String args[])
    {
       // int c=34;
      //  int d=12;
      //  swap(c, d);
      //  System.out.println(c+" "+d);
      //  dog c=new dog();
        //c.legs=5;
       // dog d=new dog();
        //d.legs=6;
       // System.out.println(c.legs+" "+d.legs);
       dog a=new dog();
       a.legs=4;
       changeDog(a);
       System.out.println(a.legs);


    }

   // static void swap(dog a, dog b)
   // {
        //dog temp=a;
      //  a=b;
      //  b=temp;
   // }
  static  void swap(int a, int b)
    {
        int temp=a;
        a=b;
       
        b=temp;
    }
    static void changeDog(dog dog)
    {
        dog.legs=6;

    }
}


