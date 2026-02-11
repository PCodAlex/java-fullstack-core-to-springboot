
import java.util.Scanner;

public class QuestionService{
    Question qstArr[]=new Question[4];
    public QuestionService(){
        qstArr[0] = new Question(1,"Which of the following is the size of int in Java?",
"1) 2 bytes","2) 4 bytes","3) 8 bytes","4) Depends on system",2);

qstArr[1]= new Question(2,"Which keyword is used to inherit a class in Java?",
"1) implement","2) inherits","3) extends","4) super",3);

qstArr[2] = new Question(3,"What will be the default value of an instance variable of type boolean?",
"1) true","2) false","3) 0","4) null",2);

qstArr[3] = new Question(4,"Which method is the entry point of a Java program?",
"1) start()","2) main()","3) run()","4) execute()",2);
    }
    public void Questioning(){
        int result=0;
        boolean problemOccurd = false;
        Scanner sc=new Scanner(System.in);
        for(Question q:qstArr){
            System.out.println(q.getQstId()+" "+q.getQst());
            q.getQstOpt();
            System.out.print("Ans : ");
            int ans=sc.nextInt();
            if(ans>0 && ans<5){
                AnswerCheck ansc=new AnswerCheck(ans,q.getQstAns());
                result=ansc.check()+result;
            }
            else{
                someWrong();
                problemOccurd=true;
                break;
            }
        }
        if(!problemOccurd){
            printResult(result); 
        }
        else{
            System.out.println("---Retry---");
        }
    }
    public void printResult(int result){
        System.out.println("Your scored :"+result*25+"%");
    }
    public void someWrong(){
        System.out.println("Something Went Wrong...Please Try Again...");
    }
}