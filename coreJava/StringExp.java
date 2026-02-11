class StringExp{
    public static void main(String[] args) {
        //imuteable string
        //String is a class
        String str1="Akash";//asume in static pool area it is stored in the location of 101
        // String str2=new String("Akash");
        String str2="Akash";//then it will reffer to the stored location of 101
        System.out.println(str1.equals(str2)); //String is a non premitive datatype and stores in the heap memory and still its shown true just because of string constant pool area 
        //in heap meamory constant pool area is an area where the string get stored according to their equality if one string got stored previously then next time if same string data stored in the another variable then actually its reffers to the first string literals or data location in string pool area 
        str1=str1+" Samanta";//when you modify it then it will create another location after concat asume like the new string will be stored in the location of 103 and if the first string does not use further I mean to say that the literal stored in the location of 101 will gone for gurbage collection 
        System.out.println(str1);


        //meutable string
        //every time you changed data and if it is consumes a continues meamory location inside your heap memory and what if there is no continious new locaton or space available in that case it has to relocate ,so to reduce the relocation of the sting its gives you a buffer
        //by default its capacity or size is 16 if you add 5 char ststring it becomes 16+5=21;

        StringBuffer str3=new StringBuffer();
        System.out.println(str3.capacity());
        str3=new StringBuffer("Akash");
        System.out.println(str3.capacity());
        System.out.println(str3.length());// mind it length and the capacity is not same 
        str3.append(" Samanta");
        System.out.println(str3);

        //mind it string and StringBuffer is not same 
        String str4=str3.toString();
        System.out.println(str4);
        // System.out.println(str4.equals(str3));

        //other methods 
        str3.deleteCharAt(5);
        System.out.println(str3);

        str3.insert(5, " Kumar ");
        System.out.println(str3);

        str3.setLength(64);
        str3.ensureCapacity(80);
        System.out.println(str3);
    }
}