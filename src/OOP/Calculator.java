package OOP;

public class Calculator {

    float result;
    float doSummation(int a, int b){
        result = a + b;
        return result;
    }

    float doSubstruction(int a, int b){
        result = a - b;
        return result;
    }

    float doMultification(int a, int b){
        result = a * b;
        return  result;
    }

    float doDivision(int a, int b){
        result = a/b;
        return result;
    }

    int doSqure(int x){
        return x * x;
    }

    int maxReturn(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }

    }
}
