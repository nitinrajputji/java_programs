public class mylinkedlist<E>
{
    Node<E> head;
   public void add(E data)
    {  
        Node<E> toadd=new Node<E>(data);
    

        Node<E> temp=head;
        while(temp.next !=null)
        {
            temp=temp.next;

        }
        temp.next=toadd;
    }
    

  public E remove() throws Exception
    {
        Node<E> temp=head;
    
        while(temp.next.next!=null)
        {
            temp=temp.next;

        }
        Node<E> toremove=temp.next;
        temp.next=null;
         return toremove.data;
    }
    
    public E get()
    {
        Node<E> temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;

        }
        return temp.data;
        
    }


    static class Node<E>
    {
        E data;
        Node<E> next;
        public Node(E data)
        {
            this.data=data;
            next=null;

        }
    }
}