public class Value implements Expression{
    private double value;

    public Value(String expression) {
        parse(expression);
    }

    @Override
    public void parse(String expression) {
        if (expression.isEmpty()) value=0;
        else value = Double.valueOf(expression);
    }

    @Override
    public double evaluate() {
        return value;
    }

}
