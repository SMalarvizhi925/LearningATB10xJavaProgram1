package Ex_04_Operators;

public class Lab043_Interview_Concat_plus1 {

    public static void main(String[] args) {

        String first_name = "Malar";
        String last_name = "Barathi";
        int a = 20;
        int b = 20;

        System.out.println(first_name + last_name + a + b);
        // It will react as concat bcz the starting is had string output.

        System.out.println(a + b + first_name + last_name);
        // In this case, 1st --> Math, then concat will happen

        System.out.println(first_name + last_name + (a + b));
        //According to the rules, the values inside the brackets should be displayed first.
        //And only after that will the rest of the part be displayed.

        //BODMAS  --> Bracket of Div, Multi, Add, Sub


    }
}
