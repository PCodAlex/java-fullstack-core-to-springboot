public class Literals{
    public static void main(String[]args){
        int binaryNum=0b101;
        System.out.println(binaryNum);//5

        int styleChangeNum=10_00_000;
        System.out.println(styleChangeNum);//1000000

        double epsilumValue=12e10;
        System.out.println(epsilumValue);//1.2E11

        char ch='a';
        ch++;
        System.out.println(ch);//b
    }
}