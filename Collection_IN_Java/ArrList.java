import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrList{
    public static void main(String[] args) {
        // Collection cl=new ArrayList();//collection does not have the indexing 
        // Collection<Integer> cl=new ArrayList();//collection does not have the indexing 
        List<Integer> cl=new ArrayList<>();
        cl.add(5);
        cl.add(6);
        cl.add(7);
        cl.add(8);
        cl.add(9);

        System.out.println(cl);
        System.out.println(cl.get(3));
        System.out.println(cl.indexOf(7));

        Iterator<Integer> s2=cl.iterator();//iiterator- interface

        while (s2.hasNext()){
            System.out.println(s2.next());
        }
    }
}