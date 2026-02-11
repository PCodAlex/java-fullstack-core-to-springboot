
import java.util.Arrays;

class ArrayFst{
    public static void main(String[] args) {

        //first way to declare array
        byte arr1[]={2,3,4,9,1,6,7};
        System.out.println(arr1[1]);//it will print the value present in the array
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));//it will print the whole array and if you only print the reference variable value it will print the address where the array is stored in the heap memory 

        byte arr2[]=new byte[5];
        System.out.println(Arrays.toString(arr2));
        arr2[1]=2;
        arr2[3]=4;
        System.out.println(Arrays.toString(arr2));
    }
}