public class StringBuilderEx {

    public static void main(String[]xyz){
        StringBuilder str = new StringBuilder("HelloWorld");
        str.setLength(2);
        str.setLength(10);
        System.out.println(str);
        System.out.println(str.length());
    }
}
