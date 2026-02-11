import java.util.Arrays;
class Students{
    int rollNo;
    String name;
    int marks;
}
public class ObjectArray{
    public static void main(String[] args) {
        int arr1[]=new int[6];
        arr1[0]=1;
        arr1[2]=3;
        arr1[4]=5;

        System.out.println(Arrays.toString(arr1));

        Students std1=new Students();
        std1.rollNo=01;
        std1.name="Akash";
        std1.marks=87;

        Students std2=new Students();
        std2.rollNo=02;
        std2.name="Bikash";
        std2.marks=93;

        Students std3=new Students();
        std3.rollNo=03;
        std3.name="Prakash";
        std3.marks=89;

        Students std[]=new Students[3];
        std[0]=std1;
        std[1]=std2;
        std[2]=std3;

        for (Students s:std){
            System.out.println(s.rollNo +" : "+s.name+" : "+s.marks);
        }//Enhanced For loops
    }
}