import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// class Student implements Comparable<Student>
class Student {
    int age ;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("age=").append(age);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }

    // @Override
    // public int compareTo(Student that){
    //     if(this.age%10>that.age%10){
    //                 return 1;
    //             }
    //             return -1;
    // }
}
public class Compare {
    public static void main(String[] args) {

        Comparator<Student> c1=(s1,s2)-> (s1.age%10>s2.age%10)? 1:-1;
        // Comparator<Student> c1=new Comparator<Student>() {
        //     public int compare(Student s1,Student s2){
        //         if(s1.age%10>s2.age%10){
        //             return 1;
        //         }
        //         return -1;
        //     }
        // };

        List<Student> li=new ArrayList<>();
        li.add(new Student(20, "Shibam Ghosh"));
        li.add(new Student(23, "Akash Samanta"));
        li.add(new Student(22, "Rittick Biswas"));
        li.add(new Student(21, "Akash Halder"));

        Collections.sort(li,c1);

        for(Student s:li){
            System.out.println(s.name+" : "+s.age);
        }
    }
}
