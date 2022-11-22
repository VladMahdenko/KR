public interface Expression {
    void parse(String expression);

    double evaluate();
}
