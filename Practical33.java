public class Practical33 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Please provide exactly 2 arguments");
            }

            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Vrunda Vaghela (250393107016)\n");
            System.out.println("Numerator   : " + numerator);
            System.out.println("Denominator : " + denominator);
            System.out.println("Result      : " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer values");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error: Unexpected error occurred");
        }
    }
}