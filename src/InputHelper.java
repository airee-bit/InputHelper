import java.util.Scanner;

public class InputHelper {
    //All methods should be public and static


    public static String getNonZeroLenString(Scanner scan, String prompt) {
        String s;
        boolean valid = false;
        System.out.println(prompt);
        do {
            s = scan.nextLine();
            if (s.length() > 0){
                valid = true;
            } else {
                System.out.println("Error. Please try again. You entered a String of length 0");
            }
        } while (!valid);
        return s;
    }

    public static int getInt(Scanner scan, String prompt) {
        int x = 0;
        boolean valid = false;
        System.out.println(prompt);
        do {
            if (scan.hasNextInt()){
                x = scan.nextInt();
                valid = true;
            } else {
                System.out.println("Error. Please try again. You must enter an integer value.");
            }
            scan.nextLine();
        } while (!valid);
        return x;
    }

    public static double getDouble(Scanner scan, String prompt) {
        double d = 0;
        boolean valid = false;
        System.out.println(prompt);

        do {
            if (scan.hasNextDouble()){
                d = scan.nextDouble();
                valid = true;
            } else {
                System.out.println("Error. Please try again. Your must enter an double value.");
            }
            scan.nextLine();
        } while (!valid);
        return d;
    }

    public static int getRangedInt(Scanner scan, String prompt, int min, int max) {
        int ri = 0;
        boolean valid = false;
        System.out.println(prompt);
        do {
            if (scan.hasNextInt()){
                ri = scan.nextInt();
                if (ri >= min && ri <=max){
                    valid = true;
                }
                else{
                    System.out.println("Error. Please try again. You must enter a integer value between the range. " + min + " and " + max + ".");
                }
            }
            else{
                System.out.println("Error. Please try again. You must enter an integer value.");
            }
            scan.nextLine();
        } while (!valid);
        return ri;
    }

    public static double getRangedDouble(Scanner scan, String prompt, double min, double max) {
        double rd = 0;
        boolean valid = false;
        System.out.println(prompt);
        do {
            if (scan.hasNextDouble()){
                rd = scan.nextDouble();
                if (rd >= min && rd <=max){
                    valid = true;
                }
                else{
                    System.out.println("Error. Please try again. You must enter a decimal value between the range. " + min + " and " + max + ".");
                }
            }
            else{
                System.out.println("Error. Please try again. You must enter an decimal value.");
            }
            scan.nextLine();
        } while (!valid);
        return rd;
    }

    public static int getPositiveNonZeroInt(Scanner scan, String prompt) {
        int x = 0;
        boolean valid = false;
        System.out.println(prompt);
        do {
            if (scan.hasNextInt()){
                x = scan.nextInt();
                if ( x > 0){
                    valid = true;
                }
                else{
                    System.out.println("Error. Please try again. You entered a non positive int or a 0 int. ");
                }
            }
            else{
                System.out.println("Error. Please try again. You need to enter in a int");
            }
            scan.nextLine();
        } while (!valid);
        return x;
    }

    public static boolean getYNConfirm(Scanner scan, String prompt) {
        String yn;
        boolean valid = false;
        System.out.println(prompt + " (Enter Y/N)");
        do {
            yn = scan.nextLine();

            if (yn.equalsIgnoreCase("Y")){
                valid = true;
                return true;
            } else if(yn.equalsIgnoreCase("N")){
                valid = true;
                return true;
            }
            else{
                System.out.println("Error. You must enter Y or N");
            }
            scan.nextLine();
        } while (!valid);
        return false;
    }

    public static String getRegExString(Scanner scan, String prompt, String regexPattern){
        String s;
        boolean valid = false;

        System.out.println(prompt);
        do {
            s = scan.nextLine();
            if (s.matches(regexPattern)){
                valid = true;
            }
            else{
                System.out.println("Error. Your input must match the specified pattern.");
            }
        } while(!valid);
        return s;
    }
}
