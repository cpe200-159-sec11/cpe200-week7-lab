package cpe200;

/**
 * Created by Pattakorn on 27/10/2016.
 */
public class BaseCalculator {

    public BaseCalculator(){
    }

    public void operandCondition(Double a, Double b){
        if (a < 0 || b < 0) throw new RuntimeException();
    }
    public void operandCondition(int a, int b){
        if (a < 0 || b < 0) throw new RuntimeException();
    }
    public void divideByZero(Double a, Double b){
        if (a == 0 || b == 0) throw new ArithmeticException();
    }
    public void divideByZero(int a, int b){
        if (a == 0 || b == 0) throw new ArithmeticException();
    }


}
