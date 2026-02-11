import java.util.Arrays;
import java.util.Scanner;

class SdArray{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr1[][]=new int[3][4];
        System.out.println(Arrays.deepToString(arr1));
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print("Enter the value for the position [ "+i+" ] [ "+j+" ] :");
                arr1[i][j]=input.nextInt();
                System.out.println();
            }
        }

        System.out.println(Arrays.deepToString(arr1));//Arrays.deepToString() is used to print multi-dimensional arrays (like 2D, 3D arrays).
    }
}