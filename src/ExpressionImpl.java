public class ExpressionImpl implements Expression{
    protected Expression[] subExpressions=new Expression[2];

    public ExpressionImpl(String expression) {
        parse(expression);
    }

    @Override
    public void parse(String expression) {
        if (expression.contains("+")) subExpressions[0] = new Addition(expression);
        else if (expression.contains("-")) subExpressions[0] = new Subtraction(expression);
        else if (expression.contains("*")) subExpressions[0] = new Multiplication(expression);
        else if (expression.contains("/")) subExpressions[0] = new Division(expression);
        else subExpressions[0] = new Value(expression);
    }

    public void parse(String sub1, String sub2){
        if (sub1.contains("+")) subExpressions[0] = new Addition(sub1);
        else if (sub1.contains("-")) subExpressions[0] = new Subtraction(sub1);
        else if (sub1.contains("*")) subExpressions[0] = new Multiplication(sub1);
        else if (sub1.contains("/")) subExpressions[0] = new Division(sub1);
        else subExpressions[0] = new Value(sub1);

        if(sub2!=null){
            if (sub2.contains("+")) subExpressions[1] = new Addition(sub2);
            else if (sub2.contains("-")) subExpressions[1] = new Subtraction(sub2);
            else if (sub2.contains("*")) subExpressions[1] = new Multiplication(sub2);
            else if (sub2.contains("/")) subExpressions[1] = new Division(sub2);
            else subExpressions[1] = new Value(sub2);
        }
    }

    @Override
    public double evaluate() {
        return subExpressions[0].evaluate();
    }
}
