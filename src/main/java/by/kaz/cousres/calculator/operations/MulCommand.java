package by.kaz.cousres.calculator.operations;

public class MulCommand implements Command {

    public double execute(double... operand) {
        return operand[0] * operand[1];
    }
}
