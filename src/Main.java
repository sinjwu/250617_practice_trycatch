public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Error: Divided by Zero");
        }
    }
}