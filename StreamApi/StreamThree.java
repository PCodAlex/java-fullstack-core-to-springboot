import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamThree {
    public static void main(String[] args) {
        List<Integer>nums=Arrays.asList(4,6,2,3,7,9,8);

        Predicate<Integer>p1=n->n%2==0;
        // Predicate<Integer>p1=new Predicate<Integer>() {
        //     public boolean test(Integer n){
        //         if(n%2==0){
        //             return true;
        //         }
        //         return false;
        //     }
        // };
        Function<Integer,Integer> f1= n->n*2;
        // Function<Integer,Integer> f1=new Function<Integer,Integer>() {
        //     @Override
        //     public Integer apply(Integer n) {
        //         return n*2;
        //     }
        // };

        Stream<Integer> s1=nums.stream();
        // Stream<Integer> s2=s1.filter(n->n%2==0);
        Stream<Integer> s2=s1.filter(p1);
        // Stream<Integer> s3=s2.map(n->n*2);
        Stream<Integer> s3=s2.map(f1);
        int result=s3.reduce(0,(c,e)->c+e);//0 is the intialization of sum c first value and e second and it goes 
        System.out.println(result);
        
    }
}
