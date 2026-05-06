public class Practical35 {

    public static double average(String[] values) throws NullPointerException, NumberFormatException {
        double sum = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] == null) {
                throw new NullPointerException();
            }
            sum += Double.parseDouble(values[i]);
        }

        return sum / values.length;
    }

    public static void main(String[] args) {

        System.out.println("Vrunda Vaghela (250393107016)\n");
        String[] arr = {"10", "20.5", "30"};

        try {
            double result = average(arr);
            System.out.println("Average = " + result);
        }
        catch (NullPointerException e) {
            System.out.println("Error: Null value found");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        }
        finally {
            System.out.println("Validation process completed");
        }
    }
}