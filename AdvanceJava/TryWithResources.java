
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // BufferedReader bf =null;
        // try {
        //     InputStreamReader in =new InputStreamReader(System.in);
        //     bf=new BufferedReader(in);
        //     int num=Integer.parseInt(bf.readLine());
        //     System.out.println(num);
        // } 
        // finally{
        //     bf.close();
        //     System.out.println("bye");
        // }
        try (BufferedReader bf =new BufferedReader(new InputStreamReader(System.in)))
        {
            int num=Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
    }
}
