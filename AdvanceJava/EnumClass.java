enum Laptop{
    Asus(99999),MacBook(159999),Hp(69999),Lenovo(20000),Me(79000),Dell(129999),Msi;
    private int price;
    private Laptop(){
        price=50000;
    }
    private Laptop(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public static void show(){
        for(Laptop lap:Laptop.values()){
            System.out.println(lap+" : "+lap.getPrice());
        }
    }
}
public class EnumClass {
    public static void main(String[] args) {
        Laptop l=Laptop.MacBook;
        System.out.println(l.getClass().getSuperclass());//-->class java.lang.Enum ----> means enums which is a final class it also extend enum class bydefault
        Laptop.show();
        System.out.println("******************");
        for(Laptop lap:Laptop.values()){
            System.out.println(lap+" : "+lap.getPrice());
        }
    }
}
