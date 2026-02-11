public class ExceptionDemo {
    public static void main(String[] args) {
        
        int i=3;
        int j=0;
        String str="null";
        int arr[]=new int[8];
        try {
            j=18/i;
            System.out.println(j);
            System.out.println(str.length());
            System.out.println(arr[5]);
            Class.forName("abcd");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index number is not match :"+e);
        }catch (Exception e) {
            System.out.println("Other Exception: " + e);
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
