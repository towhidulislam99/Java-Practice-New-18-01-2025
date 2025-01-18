import java.util.*;
public class Eligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Age: ");
        int age = sc.nextInt();
        System.out.println("Enter The Weight: ");
        int weight = sc.nextInt();

        if (age > 16) {
            if (weight > 49){
                System.out.println("You Are Eligible to Apply this Sainik Post");
            }
            else{
                System.out.println("Your Age is Right but Weight is Not Eligible");
            }
        }
        else {
            System.out.println("You Are not Eligible this Post");
        }

    }
}
