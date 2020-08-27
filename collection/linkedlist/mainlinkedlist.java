import java.util.*;
public class mainlinkedlist
{
    public static void main(String args[])
    {

    

    List<Integer> list1=new LinkedList<Integer>();
    List<Integer> list2=new ArrayList<Integer>();
    
     gettimediff(list1);
     gettimediff(list2);
    }
    static void gettimediff(List<Integer> list)
    {
        long start=System.currentTimeMillis();
        for(int i=0;i<100000;i++)
        {
            list.add(0,i);
        }
          long end=System.currentTimeMillis();
          System.out.println(list.getClass().getName() +"  -->" + (end-start) );
    }

}