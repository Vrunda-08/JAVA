import java.util.Scanner;

class College19 {

    String collegeName;

    College19(String name) {
        collegeName = name;
    }

    class Admission {

        String studentName;
        String course;

        void accept() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Vrunda Vaghela (250393107016)\n");
            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        void display() {
            System.out.println("\nAdmission Details:");
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {

        College19 c = new College19("GTU");

        College19.Admission a = c.new Admission();

        a.accept();
        a.display();
    }
}