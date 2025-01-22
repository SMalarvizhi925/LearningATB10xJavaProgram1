package Ex_02_Java_Basics;

public class Lab024_printf {
    public static void main(String[] args) {

        int a = 10;
        int b = 23;
//        System.out.println(a);  // println --> New line
//        System.out.print(a);    // No New line
        System.out.printf("The variable value is %d", a);  // Formatting
        System.out.println();
        System.out.printf("The variable value is %d", b);
        // %d --> int, byte, short, long
        // %f --> float
        // %s --> String
        // %b --> boolean

    }
}
