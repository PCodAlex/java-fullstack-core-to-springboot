// package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamFive {
    public static void main(String[] args) {
        int size=10000;
        List<Integer> nums = new ArrayList<>(size);
        Random rand = new Random();    // no fixed seed  

        for (int i = 0; i < size; i++) {
            nums.add(rand.nextInt(100));   // random numbers 0–99
        }

        long strtTime=System.currentTimeMillis();
        int result1=nums.stream()
                        .map(n->{
                            try {
                                Thread.sleep(10);
                            } catch (Exception e) {
                            }
                            return n*2;
                        })
                        // .filter(n->n%2==0)
                        // .map(n->n*2)
                        .mapToInt(n->n)
                        .sum();

        long endTime=System.currentTimeMillis();
        long strt=System.currentTimeMillis();
        int result2=nums.parallelStream()
                        .map(n->{
                            try {
                                Thread.sleep(10);
                            } catch (Exception e) {
                            }
                            return n*2;
                        })
                        // .filter(n->n%2==0)
                        // .map(n->n*2)
                        .mapToInt(n->n)
                        .sum();
        long end=System.currentTimeMillis();
        System.out.println(result1+"{"+(endTime-strtTime)+"} : "+result2+"{"+(end-strt)+"}");
    }
}
