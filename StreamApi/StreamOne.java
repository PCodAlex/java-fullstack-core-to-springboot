// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamOne {
    public static void main(String[] args) {
        // List<Integer>nums=new ArrayList<>();
        List<Integer>nums=Arrays.asList(4,6,2,3,7,9,8);
        // for(int i=0;i<nums.size();i++){
        //     System.out.println(nums.get(i));
        // }
        // for(int n:nums){
        //     System.out.println(n);
        // }
        int sum=0;
        nums.forEach(n->System.out.println(n));/*Java does NOT allow you to modify a local variable (sum) inside a lambda, because local variables used inside a lambda must be effectively final. */
        for(int n:nums){
            if(n%2==0){
                n=n*2;
                sum=sum+n;
            }
        }
        System.out.println(sum);
        System.out.println(nums);
    }
}
