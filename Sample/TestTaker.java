
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestTaker {
    public static String calculator(List<String>dest,List<int>dis){
        double fulePrice=1.30;
        int mileAge=8;

        return "null";
    }
    public static void main(String[]args){
        List<String>originDestination=new ArrayList();
        List<int>distanceInKilometers=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("you want to add destination ?-->Y/N");
        String ans=sc.next();
        if(ans.equalsIgnoreCase("Y")||ans.equalsIgnoreCase("N")){
            System.out.println("retry from start");
        }
        while(ans.equalsIgnoreCase("Y")){
            System.out.println("enter the destination:");
            originDestination.add(sc.nextLine());
            System.out.println("enter the distance:");
            distanceInKilometers.add(sc.nextInt());
            ans=sc.next();
        }
        calculator(originDestination,distanceInKilometers);

    }
}
