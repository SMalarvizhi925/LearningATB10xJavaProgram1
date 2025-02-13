package Ex_06_Ternary_Operator;

public class Lab066_TO_Three_Num_Max {
    public static void main(String[] args) {

        //Finding the largest number of three n1,n2, n3

        int n1 = 2, n2 = 9, n3 = -11;

        int Largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
       // Logics:
        //  ((n1 >= n3) ? n1 : n3) --> (2 >= -11) ? n1 : n3 --> n1
        // ((n2 >= n3) ? n2 : n3) --> (9 >= -11) ? n2 : n3 --> n2
        // (n1>=n2) ? n1 : n2 --> (2 >= 9) ? n1 : n2 --> n2

        System.out.println("The largest Number is: " + Largest);





    }
}
