import java.util.*;
public class mystack<E>
{
    private mylinkedlist<E> mll=new mylinkedlist<E>();


    void push(E e)
    {
        mll.add(e);

    }
    E pop() throws Exception{
        if(mll.isEmpty())
        throw new Exception("popping from empty stack is not allowed");
        return mll.removelast();

    }
    E peek() throws Exception
    {
           
            if(mll.isEmpty()){
        throw new Exception("peeking from empty stack is not allowed");
            }
            return mll.getlast();



    }
}