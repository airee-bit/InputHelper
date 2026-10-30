import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is where we test InputHelper methods
        Scanner scan = new Scanner(System.in);
        String name = InputHelper.getNonZeroLenString(scan, "Please enter your full name.");
        int age = InputHelper.getInt(scan, "Please enter your age.");
        double decimal = InputHelper.getDouble(scan, "Please enter your decimal value.");
        int rangedNumInt = InputHelper.getRangedInt(scan, "Please enter a number in the rang.", 10, 20);
        double rangedNumDob = InputHelper.getRangedDouble(scan, "Please enter a decimal number in the range.", 6.7, 6.9);
        int PositiveNonZeroNum = InputHelper.getPositiveNonZeroInt(scan, "Please enter a positive non zero number.");
        boolean yesOrNo = InputHelper.getYNConfirm(scan, "Would you like to continue?");
        String phoneNum = InputHelper.getRegExString(scan, "Enter your phone number [xxx-xxx-xxxx]", "\\d{3}\\d{3}\\d{4}");
        String bDay = InputHelper.getRegExString(scan, "Enter your birthday [mm/dd/yyyy]", "\\d{2}\\d{2}\\d{4}");

        System.out.println("Hello, " + name + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your decimal value is: " + decimal);
        System.out.println("You entered the number: " + rangedNumInt);
        System.out.println("Your positive non zero number is: " + PositiveNonZeroNum);
        System.out.println("You entered: " + yesOrNo);
        System.out.println("Phone Number: " + phoneNum);
        System.out.println("Birth Date: " + bDay);
    }
}
