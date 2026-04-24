import java.util.Scanner;

interface Classify {

    String getDivision(double average);
}

class Result implements Classify {

    public String getDivision(double average) {

        if(average >= 60) {
            return "First Division";
        } else {
            return "No Division";
        }
    }
}

class Practical27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vrunda Vaghela (250393107016)\n");        

        System.out.print("Enter Average: ");
        double avg = sc.nextDouble();

        Result r = new Result();

        String division = r.getDivision(avg);

        System.out.println("Division: " + division);
    }
}