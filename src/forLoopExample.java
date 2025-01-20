import java.util.*;
public class forLoopExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int number = sc.nextInt();

        for( int i = 0; i<=10; i++){
            System.out.println("The Output is "+number+" * "+i+" = "+i*number);
        }

    }
}
