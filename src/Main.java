import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expression = scanner.nextLine();
        System.out.println("Result is " + new ExpressionImpl(expression).evaluate());
    }
}
