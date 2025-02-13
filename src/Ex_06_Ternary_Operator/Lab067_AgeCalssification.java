package Ex_06_Ternary_Operator;

public class Lab067_AgeCalssification {
    public static void main(String[] args) {

        // Minor, Adult, Senior
        // Minor < 18 , Adult > 18 , Senior > 65

        int age = 35;

        String result = (age < 18) ? "Minor" : (age > 18) ? "Adult" : "Senior" ;

        System.out.println(result);




    }

}
