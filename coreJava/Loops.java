class Loops{
    public static void main(String[]args){
    //loops -- while , do-while , for

    //While-Loop
        int end=5;
        int strt=1;
        while(strt<=end){ //true condition will print infinite time 
            System.out.println("hi");
            strt++;
        }

    //do-while-loop [when we have to do something if the the condition is not true still]
        strt=1;
        do{
            System.out.println("hellow!");
            strt++;
        }while(strt<=end);

    //for-loop [when we have the range of values mentioned - 1.initialization value,condition,Increment and Decrement]
        for(strt=1;strt<=end;strt++){
            System.out.println("Byee!");
        }

        int first=1;
        int last=5;
        for(;first<=last;){
            System.out.println("Hii ! My name is Akash Samanta ");
            first++;
        }


    //for-each-loop
        int []arr={1,2,3,4,5,6,7,8,9};
        for(int num:arr){
            System.out.println(num);
        }
    }
}