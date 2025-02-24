package Ex_07_Incre_Decre_Op;

public class Lab069_Multiple_Input_User {

    public static void main(String[] args) {

        // Input from user

        String age_String = args[0]; // args always should be String
        int age = Integer.parseInt(age_String);
        // we want to convert from String to Int means we have to follow ParseInt.
        System.out.println(age);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        System.out.println(args[4]);



        String CanIVote = age >= 18 ? "Yes, You can Vote" : "No, You can't vote";

        System.out.println(CanIVote);

    }
}
