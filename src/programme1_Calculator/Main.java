package programme1_Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaring the scanner object
        Scanner scanner=new Scanner(System.in);
        String answer;
        do{
            System.out.println("Please enter first number");//input wizard
            int a=scanner.nextInt();
            System.out.println("Please enter second number");//input wizard
            int b=scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,*, / :");//input wizard
            char symbol=scanner.next().charAt(0);
            Calculator obj=new Calculator();
            obj.calculateResult(a,b,symbol);
            System.out.println("Would you like to continue so please enter \"Y\" or \"N\" :");
            answer=scanner.next().toLowerCase(Locale.ROOT);
        }while (answer.startsWith("y"));
        //closing the scanner object
        scanner.close();
    }
}
