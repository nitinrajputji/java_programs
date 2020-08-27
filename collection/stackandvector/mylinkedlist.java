public class mylinkedlist<E>
{
  Node<E> head;
  public void add(E data){
    Node<E> toAdd=new Node<E>(data);
     
     if(isEmpty())
     {
      head=toAdd;
      return;
     }

    Node<E> temp=head;
    while(temp.next !=null){
      temp=temp.next;
    }
    temp.next=toAdd;
  }

  }
  public E removelast() throws Exception
  {
    Node<E> temp=head;
    if(temp=null){
      throw new Exception("cannot remove last element from empty");
    }

    if(temp.next==null){
      Node<E> toRemove=head;
      head=null;
      return toRemove.data;

    }
    while(temp.next.next !=null){
      temp=temp.next;
    }
    Node<E> toRemove=temp.next;
    temp.next=null;
    return toRemove.data;
  }

  public E getlast() throws Exception
  {
      Node<E> temp=head;
    if(temp==null){
      throw new Exception("cannot peek last element from empty");
    }

  
    while(temp.next  !=null){
      temp=temp.next;
    }
   return temp.data;

  }




   static class Node<E>{
     E data;
     Node<E> next;

     public Node(E data)
     {
       this.data=data;
       next=null;
     }
   }
}