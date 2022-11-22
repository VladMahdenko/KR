public class Multiplication extends ExpressionImpl{

    public Multiplication(String expression){
        super(expression);
    }

    @Override
    public void parse(String expression) {
        String[] subs = expression.split("\\*",2);
        super.parse(subs[0], subs[1]);
    }

    @Override
    public double evaluate() {
        if (subExpressions[0]==null) return subExpressions[1].evaluate();
        if (subExpressions[1]==null) return subExpressions[0].evaluate();
        return subExpressions[0].evaluate() * subExpressions[1].evaluate();
    }
}
