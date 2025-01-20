import java.util.*;
public class SwitchCaseExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Month Value: ");
        int month = sc.nextInt();
        String monthnames = "";

        switch (month){

            case 1 : monthnames = "January";
            break;
            case 2 : monthnames = "February";
            break;
            case 3 : monthnames = "March";
            break;
            case 4 : monthnames = "April";
            break;
            case 5 : monthnames = "May";
            break;
            case 6 : monthnames = "June";
            break;
            case 7 : monthnames = "July";
            break;
            case 8 : monthnames = "August";
            break;
            case 9 : monthnames = "September";
            break;
            case 10 : monthnames = "October";
            break;
            case 11 : monthnames = "November";
            break;
            case 12 : monthnames = "December";
            break;
            default:
                System.out.println("Invalid Input Correct Input Please...");
        }
        System.out.println("The month is: " + monthnames);

    }
}
