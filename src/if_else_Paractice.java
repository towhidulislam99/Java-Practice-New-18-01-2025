import java.util.*;
public class if_else_Paractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Age: ");
        int age = sc.nextInt();

        //int age = 17;

        if(age <18){
            System.out.println("You Are Not Eligible in this Course");
        }
        else{
            System.out.println("Your Are Eligible This Course");
        }


    }
}
