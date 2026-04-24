interface Exam {

    boolean isPassed(int mark);
}

interface Classify {

    String getDivision(double average);
}

class Result implements Exam, Classify {

    public boolean isPassed(int mark) {
        if(mark >= 40)
            return true;
        else
            return false;
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

        Result r = new Result();

        int mark;
        double avg;

        boolean result = r.isPassed(mark);
        String division = r.getDivision(avg);

        System.out.println("Vrunda Vaghela (250393107016)\n");
        System.out.println("Marks: " + mark);
        System.out.println("Result: " + result);

        System.out.println("Average: " + avg);
        System.out.println("Division: " + division);
    }
}