import java.util.*;

public class Practical51 {

    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        System.out.println("Vrunda Vaghela (250393107016)\n");
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        sc.nextLine();

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }

        System.out.println("\nNumbers before sorting: " + numbers);
        sortList(numbers);
        System.out.println("Numbers after sorting : " + numbers);

        System.out.println("\nNames before sorting: " + names);
        sortList(names);
        System.out.println("Names after sorting : " + names);

        sc.close();
    }
}