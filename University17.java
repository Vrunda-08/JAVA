class University17 {

    static int totalStudents;
    static String universityName;

    static {
        universityName = "GTU";
        System.out.println("Vrunda Vaghela (250393107016)\n");
        System.out.println("Static Block Executed");
        System.out.println("University Name: " + universityName);
    }

    {
        totalStudents++;
        System.out.println("Instance Block Executed");
    }

    University17() {
        System.out.println("Constructor Executed");
    }

    static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {

        System.out.println("Main Method Started");

        University17 u1 = new University17();
        University17 u2 = new University17();
        University17 u3 = new University17();

        System.out.println("Total Students Created: " + University17.getTotalStudents());
    }
}