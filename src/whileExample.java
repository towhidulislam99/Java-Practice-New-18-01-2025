import java.util.*;
public class whileExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number wich Number Multiply: ");
        int number = sc.nextInt();
        int i = 0;
        while( i<=10){
           System.out.println("The Number is "+number+" * "+i+"= "+i*number);
           i++;
        }

    }
}
