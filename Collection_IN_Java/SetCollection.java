//iterable -->Collection ->Set -->hashset and treeset(e.AbstractSet & i.NavigableSet-->e.sortedSet )

// import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
        // Set s1=new HashSet<>();
        Collection<Integer> s1=new TreeSet<Integer>();//treeset issorted because of sortedSet

        s1.add(5);
        s1.add(9);
        s1.add(11);
        s1.add(9);
        s1.add(25);
        System.out.println(s1);
        Iterator<Integer> s2=s1.iterator();//iiterator- interface

        while (s2.hasNext()){
            System.out.println(s2.next());
        }
    }
}
