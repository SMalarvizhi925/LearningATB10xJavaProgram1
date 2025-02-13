package Ex_05_Type_Casting;

public class Lab058_TypeCasting_Narrowing {

    public static void main(String[] args) {
        int val = 200;
//        byte b = val; //Implicit Narrowing --> Is not allowed --> Invalid case
        byte b = (byte)val; // Explicit Narrowing --> Is allowed --> Valid
        // Data loss will be occur




    }
}
