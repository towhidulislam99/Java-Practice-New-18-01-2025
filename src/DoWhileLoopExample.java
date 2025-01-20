import java.util.*;
public class DoWhileLoopExample {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter The Number Given: ");
         int number = sc.nextInt();

          do {
              System.out.println("The Value is: "+number);
              number++;
          }
          while (number < 10);
    }

}
