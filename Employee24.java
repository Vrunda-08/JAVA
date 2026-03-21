class Employee {

    String name = "Vaani";
    String department = "IT";

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {

    int teamSize = 5;
    String project = "Banking System";

    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + project);
    }
}

class Employee24 {

    public static void main(String[] args) {

        Employee e = new Employee();
        Manager m = new Manager();

        System.out.println("Vrunda Vaghela (250393107016)\n");
        System.out.println("Employee Details:");
        e.displayDetails();

        System.out.println();

        System.out.println("Manager Details:");
        m.displayDetails();
    }
}