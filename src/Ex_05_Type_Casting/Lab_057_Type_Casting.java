package Ex_05_Type_Casting;

public class Lab_057_Type_Casting {

    public static void main(String[] args) {

        byte b = 12;
//        int a = b; // Valid implicit widening --> Automatically -->Compiler.
        int a = (int)b; // Valid Explicit widening

        System.out.println(a);
    }
}
