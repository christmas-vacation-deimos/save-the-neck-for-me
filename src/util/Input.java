package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(String msg){
        System.out.println(msg);
        return scanner.nextLine().trim().toLowerCase();
    }

    public String getString(){
        return getString("Please write something: ");
    }

    public boolean yesNo(){
        String input = getString("Please type yes or no: ");
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }

    public int getInt(int min, int max){
        int num = getInt();
        if (num < min  || num > max){
            System.out.println("Error, please try again");
            return getInt(min, max);
        }
        return num;
    }

    public  int getInt(){
        int number;

        try {
            number = Integer.valueOf(getString("Please give me a number: "));
        } catch (NumberFormatException nfe){
            System.out.println("Input is not a number, please put in a number");
            return getInt();
        }
        return number;
    }

    public double getDouble(){
        return Double.valueOf(getString("Please give me a number with a decimal"));
    }

    public double getDouble(double min, double max){
        double num = getDouble();

        if (num < min  || num > max){
            System.out.println("Error, please try again");
            return getDouble();
        }
        return num;
    }



}