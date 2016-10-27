package cpe200;

import java.text.DecimalFormat;

public class DecimalCalculator {
    protected IOperand firstOperand;
    protected IOperand secondOperand;
    private DecimalFormat d_format = new DecimalFormat("0.#####");

    public DecimalCalculator() {
    }

    public void setFirstOperand(IOperand operand) {
        this.firstOperand = operand;
    }

    public void setSecondOperand(IOperand operand) {
        this.secondOperand = operand;
    }

    public String add() throws RuntimeException {
        double first_op = Double.valueOf(firstOperand.getOperand());
        double second_op = Double.valueOf(secondOperand.getOperand());
        if (first_op < 0 || second_op < 0) throw new RuntimeException();
        return String.valueOf(d_format.format(first_op + second_op));
    }

    public String subtract() throws RuntimeException {
        double first_op = Double.valueOf(firstOperand.getOperand());
        double second_op = Double.valueOf(secondOperand.getOperand());
        if (first_op < 0 || second_op < 0) throw new RuntimeException();
        return String.valueOf(d_format.format(first_op - second_op));
    }

    public String multiply() throws RuntimeException {
        double first_op = Double.valueOf(firstOperand.getOperand());
        double second_op = Double.valueOf(secondOperand.getOperand());
        if (first_op < 0 || second_op < 0) throw new RuntimeException();
        return String.valueOf(d_format.format(first_op * second_op));
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        double first_op = Double.valueOf(firstOperand.getOperand());
        double second_op = Double.valueOf(secondOperand.getOperand());
        if (first_op == 0 || second_op == 0) throw new ArithmeticException();
        if (first_op < 0 || second_op < 0) throw new RuntimeException();
        return String.valueOf(d_format.format(first_op / second_op));
    }

    public String power() throws RuntimeException {
        double first_op = Double.valueOf(firstOperand.getOperand());
        double second_op = Double.valueOf(secondOperand.getOperand());
        if (first_op < 0 || second_op < 0) throw new RuntimeException();
        return String.valueOf(d_format.format(Math.pow(first_op, second_op)));
    }

}
