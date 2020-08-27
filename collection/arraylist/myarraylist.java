import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class myarraylist
{
    public static void main(String args[])
    {
        List<String> fruit=new LinkedList<String>();
        List<String> vegetable=new ArrayList<String>();
         List<String> toremove=new ArrayList<String>();
        fruit.add("apple");
        fruit.add("banana");
        vegetable.add("tomato");
          vegetable.add("potato");
            vegetable.add("carrot");
            fruit.set(1,"orange"); 
            fruit.remove(0);
            fruit.clear();
             fruit.addAll(vegetable);
            toremove.add("banana");
            toremove.add("tomato");
            fruit.removeAll(toremove);

        System.out.println(fruit);
       pair<String, Integer> p1=new pair<String, Integer>("nitin", 224);
      pair<Boolean,  String> p2=new pair<Boolean, String>(true, "helo");
     
      p1.getdescription();
       p2.getdescription(); 
        
    }
}