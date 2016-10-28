package cpe200;

/**
 * Created by pruet on 26/9/2559.
 */
public class DoubleOperand implements IOperand{
    protected double operand;

    public DoubleOperand(Double d) {this.operand = d;}

    @Override
    public String getOperand() {
        return String.valueOf(this.operand);
    }
}
