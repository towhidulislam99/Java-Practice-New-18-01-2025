import java.util.*;
public class odd_even {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value You Check Odd Even");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("This Number is Even Number");
        }

        else{
            System.out.println("This Number is Odd Number");
        }



    }
}
