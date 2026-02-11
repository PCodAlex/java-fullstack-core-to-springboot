public class MemoryStory {

    // ---------- Method Area (class info + static vars) ----------
    static String appName = "MemoryStory App";   // in Method Area (static)
    static int instanceCount = 0;                // in Method Area (static)

    // ---------- Instance fields (layout known in Method Area, 
    //           actual values stored in Heap for each object) ----
    int id;                                      // in Heap (per object)
    String name;                                 // in Heap (per object)

    // ---------- Constructor (bytecode stored in Method Area) ----
    public MemoryStory(int id, String name) {
        this.id = id;                            // uses Stack + Heap
        this.name = name;                        // uses Stack + Heap
        instanceCount++;                         // static in Method Area
    }

    // ---------- Instance method (bytecode in Method Area) -------
    public void greet() {
        String msg = "Hello, " + name;           // msg → Stack, String obj → Heap/SCP
        System.out.println(msg);                 // uses Native Method Stack inside println
    }

    // ---------- Another instance method -------------------------
    public int computeSum(int a, int b) {        // a,b → Stack
        int sum = a + b;                         // sum → Stack
        log("Sum computed: " + sum);             // calls another method
        return sum;                              // value returned via Stack frame
    }

    // ---------- Helper method (bytecode in Method Area) ---------
    private void log(String text) {
        long time = System.currentTimeMillis();  // native call → Native Method Stack
        String full = "[" + time + "] " + text;  // full → Stack, String → Heap/SCP
        System.out.println(full);                // again uses native println
    }

    // ---------- main method (entry point) -----------------------
    public static void main(String[] args) {

        // main() frame created on Stack
        System.out.println(appName);             // uses static from Method Area

        MemoryStory m1 = new MemoryStory(1, "Akash"); // new object in Heap
        MemoryStory m2 = new MemoryStory(2, "Java");  // another object in Heap

        m1.greet();                              // new frame on Stack for greet()
        m2.greet();                              // another greet() call

        int result1 = m1.computeSum(5, 7);       // Stack frame for computeSum()
        int result2 = m2.computeSum(10, 20);     // another computeSum() frame

        System.out.println("Results: " 
                           + result1 + ", " + result2);
                                                 // again native println

        System.out.println("Instances: " + instanceCount);
    }
}
