import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamFour {
    public static void main(String[] args) {
        int size=1000;
        List<Integer> nums = new ArrayList<>(size);
        Random rand = new Random();    // no fixed seed  

        for (int i = 0; i < size; i++) {
            nums.add(rand.nextInt(100));   // random numbers 0–99
        }

        System.out.println(nums);

        // int result=nums.stream()
        //                 .filter(n->n%2==0)
        //                 .map(n->n*2)
        //                 .reduce(0,(c,e)->c+e);

        // System.out.println(result);
        Stream<Integer>s1=nums.stream()
                                .filter(n->n%2==0)
                                .map(n->n*2)
                                .sorted();
        
        s1.forEach(n->System.out.print(n+" | "));
    }    
}
