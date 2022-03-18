import java.util.Scanner;
public class basic_calculator {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double x = input.nextDouble();

        System.out.println("Enter a math operation: ");
        String operator = input.next();

        System.out.println("Enter a second number: ");
        double y = input.nextDouble();

        if(operator.equals("+")){
            System.out.println(x + y);
        } else if(operator.equals("-")){
            System.out.println(x - y);
        } else if(operator.equals("*")){
            System.out.println(x * y);
        } else if(operator.equals("/")){
            System.out.println(x / y);
        } else {
            System.out.println("Invalid operator, please try again.");

        }
    }
}
