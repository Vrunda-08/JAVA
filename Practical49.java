import java.util.*;

class Box<T> {
    ArrayList<T> list = new ArrayList<>();

    void addItem(T item) {
        list.add(item);
    }

    void display() {
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

public class Practical49 {
    public static void main(String[] args) {
        System.out.println("Vrunda Vaghela (250393107016)\n");
        Scanner sc = new Scanner(System.in);

        Box<String> names = new Box<>();
        Box<Integer> rolls = new Box<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names.addItem(sc.nextLine());

            System.out.print("Enter roll number: ");
            rolls.addItem(sc.nextInt());
            sc.nextLine();
        }

        System.out.println("\nNames:");
        names.display();

        System.out.println("Roll Numbers:");
        rolls.display();

        sc.close();
    }
}