package Task_Programs;

public class Task_01_Grade_Calculator {

    public static void main(String[] args) {

        int Score = 67;

        String Grade = (Score >= 90) ? "A" : (Score >= 80) ? "B" : (Score >= 70) ? "C" : (Score >= 60) ? "D" : "Fail";

        System.out.println("The grade of the student is: " +Grade);

    }
}
