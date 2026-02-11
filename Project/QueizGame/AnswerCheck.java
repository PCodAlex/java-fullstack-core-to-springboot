public class AnswerCheck{
    int givenAns;
    int actualAns;
    public AnswerCheck(int givenAns,int actualAns){
        this.givenAns=givenAns;
        this.actualAns=actualAns;
    }
    public int check(){
        if(givenAns!=actualAns){
            return 0;
        }
        return 1;
    }
}