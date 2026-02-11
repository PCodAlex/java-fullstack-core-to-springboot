class TypeConversionAndCasting{
    public static void main(String[]args){

        //Type-conversion and Type-Casting

        //narrowing--explicitely [Type-Casting]
        int num=257;
        byte num2=(byte)num; //the range of byte is 256 so it will (num[257]%256==1) store 1
        System.out.println(num +" : "+num2);

        //widening--implicitly  [Type-Conversion]
        byte num3=125;
        int num4=num3;
        System.out.println(num3 +" : "+num4);

        //if you tru to convert int to byte or any smaller type it will through an error called incompatible type

        //float to int [Type-Casting]
        float num5=5.6f;
        int num6=(int)num5; //it will loss .6 value in the Casting
        System.out.println(num5 +" : "+num6);

        //Type-Promotion
        byte num7=20;
        byte num8=40;
        int num9=num7 * num8; //when the operation return a value which is greater than the max size of the current datatype it will promote the data type to the upper datatype thats called type Promotion
        System.out.println(num7 +" * "+num8+" : "+num9);
    }
}