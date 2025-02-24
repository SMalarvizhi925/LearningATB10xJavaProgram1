package Task_Programs;

public class Task_02_19thJan_LargestofThreeNumbers {

    public static void main(String[] args) {

        // Find the largest of three numbers a,b,c

        int a = 10, b =20, c = 45;

        int LargestNum = (b >= c) ? ((a >= b) ? a : b) : ((b >= c) ? b : c);
        //(20 >= 45) ? ((10 >= 20 ? a : b)  --> b
        //((20 >= 45) ? b : c); --? c
       //(b >= c) ? b: c); --> (20 >= 45) ? b : c ; --> c

        System.out.println(LargestNum);

    }
}
