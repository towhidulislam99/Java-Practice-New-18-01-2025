package OOP;

public class methodOverloadingExample {

    int result;
    int result1;

    int doAddition(int a, int b){
        return result = a + b;
    }

    int doAddition(int a, int b, int c){
        return result = a + b + c;
    }

    float doAddition(float a, float b){
        float result = a + b;
        return result;
    }

    void showDisplay(int a, double b){
        System.out.println("The two Number Addition is: " + (a+b));

    }

    void showDisplay(int a, int b, float c, float d){
        System.out.println(" The Two Integer Result is: "+(a+b));
        System.out.println("The Two Float Number Result is: "+(c+d));
    }


}
