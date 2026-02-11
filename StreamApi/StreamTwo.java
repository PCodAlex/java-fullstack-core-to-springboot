import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;

public class StreamTwo {
    public static void main(String[] args) {
        // List<Integer>nums=new ArrayList<>();
        List<Integer>nums=Arrays.asList(4,6,2,3,7,9,8);
        // Consumer<Integer>con=n->System.out.println(n);

        // Consumer<Integer>con=new Consumer<Integer>() {
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };
        // nums.forEach(con);
        nums.forEach(n->System.out.println(n));
    }
}
