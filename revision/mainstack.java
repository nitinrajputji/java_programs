
public class mainstack
{
    public static void main(String args[])
    {
        mystack<Integer> s=new mystack<Integer>();
        s.push(5);
        s.push(6);
        s.push(8);
        
        int popped=s.pop();
        System.out.println(popped);
        int peeked=s.peek();
        System.out.println(peeked);

    }
}

