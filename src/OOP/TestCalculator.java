package OOP;

public class TestCalculator {

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        float sum = cal.doSummation(10, 20);
        System.out.println("The Summation is: "+sum);

        float sub = cal.doSubstruction(50, 30);
        System.out.println("The Substractions is: "+ sub);

        float mul= cal.doMultification(20, 6);
        System.out.println("The Multification is "+mul);

        float div = cal.doDivision(70, 7);
        System.out.println("The Division is: "+div);

        int sqr = cal.doSqure(10);
        System.out.println("The Squre Value is: "+ sqr);

        int max = cal.maxReturn(90, 40);
        System.out.println("The Max Value is: "+max);


    }


}
