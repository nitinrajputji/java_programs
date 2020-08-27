
public class mainstack
{
    public static void main(String args[])
    {
        mystack<Integer> s=new mystack<Integer>();
        s.push(12);
        s.push(13);
        s.push(14);
         int popped=s.pop();
         System.out.println(popped);
          int peeked=s.peek();
           System.out.println(peeked);
    }
}