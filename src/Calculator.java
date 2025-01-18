import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        //int a = 20;
        //int b = 20;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        float a= sc.nextFloat();
        System.out.println("Enter Secon Number: ");
        float b= sc.nextFloat();


        float addition = a + b;
        float substraction = a - b;
        float multification = a * b;
        float division = a / b;

        System.out.println("Addition = "+ addition);
        System.out.println("Substraction = "+ substraction);
        System.out.println("Multiication = "+ multification);
        System.out.println("Division = " + division);


    }
}
