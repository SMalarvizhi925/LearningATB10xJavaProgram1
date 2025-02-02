package Ex_03_Literals;

public class Lab034_Literals_Char {

    public static void main(String[] args) {

        // char --> Store
        char c1 ='A';
        char c2 = '@';
        char c3 = ' ';
        char c4 = '(';
        char c5 = '_';
        char c6 = '6';

        //predefined in literals --> Escape Char
        char new_line ='\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Malarvizhi");
        System.out.println("Malar" + new_line + "vizhi"); // New line
        System.out.println("Malar" + tab_line + "vizhi"); // tab space will happen
        System.out.println("Malar" + back_space + "vizhi"); // delete the previous words end letter
        System.out.println("Malar" + carriage_return + "vizhi"); // delete the previous word

    char c8 = 'A';
    //ASCII --> Limited numbers --> for eg A --> 65
        //UNICODE --> india, jap, china --> rupess - ₹

        char Rupees ='₹';

        System.out.println("Malarvizhi has " +Rupees + 40);


    }
}
