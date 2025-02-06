package Ex_05_Type_Casting;

public class Lab060_TypeCasting_Uses {
    public static void main(String[] args) {
        //GST = 18.45f

        int course = 100;
        float GST = 18.45f;
        float total = course+GST; //Widening -->Implicit
        float total1 = (float)course+GST; // widening -Explicit
        int total_int = course+(int)GST; // explicit --> Narrowing -->Data loss will occur ->.45
//        int total2 = course+GST; // Narrow -->Implicit is not possible
        System.out.println(total);






    }



}
