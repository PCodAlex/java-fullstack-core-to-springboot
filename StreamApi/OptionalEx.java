import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.Optional;

class Student{
    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

}

public class OptionalEx {
    public static void main(String[] args) {
        List<String>names=Arrays.asList("Akash","Nikash","Ankan","Chayan","Dinesh"); 
    String name=names.stream()
                        .filter(str->str.contains("B"))
                        .findFirst()
                        .orElse("Not Found");
    // Optional<String> name=names.stream()
    //                     .filter(str->str.contains("B"))
    //                     .findFirst();
                        
    System.out.println(name);
    // System.out.println(name.orElse("Not Found"));

    List<String>uNames=names.stream()
                            .map(String::toUpperCase)//:: -->is the method reference (class {from where the method belongs to})
                            .toList();
    // List<String>uNames=names.stream()
    //                         .map(str->str.toUpperCase())
    //                         .toList();
    // System.out.println(uNames);
    uNames.forEach(System.out::println);
    // uNames.forEach(str->System.out.println(str));

    List<Student>students=new ArrayList<>();

    students=names.stream()
                    .map(Student::new)//-->Constructor reference
                    .toList();
    // students=names.stream()
    //                 .map(str->new Student(str))
    //                 .toList();
    System.out.println(students);
    }
}
/*method shadowing or method hiding */
//charSequence->string,string buffer and string builder
//composition and aggregation
