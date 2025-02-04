package Ex_04_Operators;

public class Lab047_OR_AND_GATE {
    public static void main(String[] args) {

        // || OR --> only false || false will be false, rest all should be true
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // AND &&  --> Only true && true should be true, rest all should be fasle

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

    }
}
