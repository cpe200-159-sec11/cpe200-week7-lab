package cpe200;

/**
 * Created by Pattakorn on 27/10/2016.
 */
public class BinaryCalculator extends BaseCalculator{
    protected IOperand firstOperand;
    protected IOperand secondOperand;

    public BinaryCalculator(){
    }

    public void setFirstOperand(IOperand operand) {
        this.firstOperand = operand.getOperand().matches("^[0-1]{1,}")?operand:null;
    }

    public void setSecondOperand(IOperand operand) {
        this.secondOperand = operand.getOperand().matches("^[0-1]{1,}")?operand:null;
    }

    public String add() throws RuntimeException {
        int first_op = Integer.parseInt(firstOperand.getOperand(), 2);
        int second_op = Integer.parseInt(secondOperand.getOperand(), 2);
        super.operandCondition(first_op, second_op);
        return Integer.toBinaryString(first_op + second_op);
    }

    public String subtract() throws RuntimeException {
        int first_op = Integer.parseInt(firstOperand.getOperand(), 2);
        int second_op = Integer.parseInt(secondOperand.getOperand(), 2);
        super.operandCondition(first_op, second_op);
        return Integer.toBinaryString(first_op - second_op);
    }

    public String multiply() throws RuntimeException {
        int first_op = Integer.parseInt(firstOperand.getOperand(), 2);
        int second_op = Integer.parseInt(secondOperand.getOperand(), 2);
        super.operandCondition(first_op, second_op);
        return Integer.toBinaryString(first_op * second_op);
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        int first_op = Integer.parseInt(firstOperand.getOperand(), 2);
        int second_op = Integer.parseInt(secondOperand.getOperand(), 2);
        super.operandCondition(first_op, second_op);
        super.divideByZero(first_op, second_op);
        return Integer.toBinaryString(first_op / second_op);
    }
    public String power() throws RuntimeException {
        int first_op = Integer.parseInt(firstOperand.getOperand(), 2);
        int second_op = Integer.parseInt(secondOperand.getOperand(), 2);
        super.operandCondition(first_op, second_op);
        return Integer.toBinaryString((int)Math.pow(first_op, second_op));
    }
}
