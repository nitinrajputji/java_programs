
public class mystack<E>
{
     mylinkedlist<E> ll=new mylinkedlist<E>();
    void push(E e)
    {
        ll.add(e);


    }
    E pop(){
       return ll.remove();

    }
    E peek()
    {
        return ll.get();

    }
}