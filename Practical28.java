import java.util.Scanner;

interface Exam {

    boolean isPassed(int mark);
}

interface Classify {

    String getDivision(double average);
}

class Result implements Exam, Classify {

    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double average) {
        if(average >= 60)
            return "First Division";
        else
            return "No Division";
    }
}

class Practical28 {

    public static void main(String[] args) {

        System.out.println("Vrunda Vaghela (250393107016)\n"); 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int mark = sc.nextInt();

        System.out.print("Enter Average: ");
        double avg = sc.nextDouble();

        Result r = new Result();

        boolean result = r.isPassed(mark);
        String division = r.getDivision(avg);

        System.out.println("Result: " + result);
        System.out.println("Division: " + division);
    }
}