import java.util.Arrays;
import java.util.Scanner;

class Jagged3DArray{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr1[][]=new int[4][];//jagged Array 
        arr1[0]=new int[2];
        arr1[1]=new int[4];
        arr1[2]=new int[3];
        arr1[3]=new int[4];

        // for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr1[i].length;j++){
        //         System.out.print("enter the value : ");
        //         arr1[i][j]=input.nextInt();
        //         System.out.println();
        //     }
        // }

        for (int arr[] : arr1) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("enter the value : ");
                arr[j] = input.nextInt();
                System.out.println();
            }
        }

        System.out.println(Arrays.deepToString(arr1));
    }
}

/* */