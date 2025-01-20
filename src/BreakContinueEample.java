import java.util.*;
public class BreakContinueEample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number: ");
        int number = sc.nextInt();

        for(int i =0; i<number; i++){

            if(i % 2 == 0){
                continue;
            }
            System.out.println("Continue Number Print: "+i);

            if(i == 5){
                break;
            }

            //System.out.println("Continue Number Print: "+i);


        }

    }

}
