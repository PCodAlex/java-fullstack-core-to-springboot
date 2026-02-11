class Processor extends Object{
    String processorName;
    int price;

    @Override
    public String toString(){
        return processorName+" : "+price;
    }

    public boolean equals(Processor that){
        return this.processorName.equals(that.processorName) && this.price==that.price;
    }

}
public class ObjectMthd{
    public static void main(String[]args){
        Processor prc=new Processor();
        prc.processorName="AMD";
        prc.price=60000;
        Processor prc2=new Processor();
        prc2.processorName="AMD";
        prc2.price=60000;

        boolean result=prc.equals(prc2);

        System.out.println(prc.toString());
        System.out.println(prc);

        System.out.println(result);
    }
}

/*

toString()

Returns a String representation of an object.

Default (from Object) prints: ClassName@hexHashCode.

Override it to show meaningful object data.

equals(Object obj)

Compares two objects for logical equality.

Default checks reference equality (==).

Override it to compare object content.

hashCode()

Returns an integer hash value for the object.

Used by hash-based collections (HashMap, HashSet).

If you override equals(), you must also override hashCode() to maintain consistency.

*/