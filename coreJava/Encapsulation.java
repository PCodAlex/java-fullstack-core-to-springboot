class Human{
    private int age;
    private String name;
    private String surName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void idCard(){
        System.out.println(name+" "+surName+" : "+age);
    }
    public void setSurName(String surName,Human obj){
        // Human obj1=obj;
        // obj1.surName=surName;
        obj.surName=surName;
    }

}
public class Encapsulation{
    public static void main(String[] args) {
        Human man=new Human();
        man.setAge(23);
        man.setName("Akash");
        man.setSurName("Samanta",man);
        man.idCard();

        Human woMan=new Human();
        woMan.setAge(16);
        woMan.setName("Jannat");
        woMan.setSurName("Samanta",woMan);
        woMan.idCard();
    }
}