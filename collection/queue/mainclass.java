import java.util.*;
public class mainclass
{
    public static void main(String args[])
    {
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(5);
        q.add(7);
        q.add(8);
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}