import java.util.*;
public class result_marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Marks: ");
        int mark = sc.nextInt();

        if(mark > 79){
            System.out.println("You Got = A+");
        } else if (mark > 69) {
            System.out.println("You Got = A");
        } else if (mark > 59) {
            System.out.println("You Got = A-");
        } else if (mark > 49) {
            System.out.println("You Got = B");
        } else if (mark > 39) {
            System.out.println("You Got = C");
        } else if (mark > 32) {
            System.out.println("You Got = D");
        }
        else {
            System.out.println("You Got = F");
        }


    }
}
