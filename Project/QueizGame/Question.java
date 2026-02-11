public class Question{
    private int qstId;
    private String qst;
    private String qstOpt[]=new String[4];
    private int qstAns;

    public Question(int qstId,String qst,String qstOpt1,String qstOpt2,String qstOpt3,String qstOpt4, int qstAns) {
        this.qstId = qstId;
        this.qst = qst;
        this.qstOpt[0]=qstOpt1;
        this.qstOpt[1]=qstOpt2;
        this.qstOpt[2]=qstOpt3;
        this.qstOpt[3]=qstOpt4;
        this.qstAns = qstAns;
    }

    public int getQstId() {
        return qstId;
    }

    public void setQstId(int qstId) {
        this.qstId = qstId;
    }

    public String getQst() {
        return qst;
    }

    public void setQst(String qst) {
        this.qst = qst;
    }

    public void getQstOpt() {
        for(String i:qstOpt){
            System.out.println(i);
        }
    }

    public void setQstOpt(String[] qstOpt) {
        this.qstOpt = qstOpt;
    }

    public int getQstAns() {
        return qstAns;
    }

    public void setQstAns(int qstAns) {
        this.qstAns = qstAns;
    }
}