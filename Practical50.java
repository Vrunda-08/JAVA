import java.util.*;

public class Practical50 {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        System.out.println("Vrunda Vaghela (250393107016)\n");
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> rolls = new LinkedList<>();
        LinkedList<String> names = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number: ");
            rolls.add(sc.nextInt());
        }

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names.add(sc.nextLine());
        }

        System.out.print("Enter roll number to search: ");
        int r = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        boolean rollFound = searchElement(rolls, r);
        boolean nameFound = searchElement(names, name);

        System.out.println("Roll number found: " + rollFound);
        System.out.println("Name found: " + nameFound);

        sc.close();
    }
}