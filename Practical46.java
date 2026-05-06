import java.util.*;

public class Practical46 {
    public static void main(String[] args) {
        System.out.println("Vrunda Vaghela (250393107016)\n");

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("Enter 5 marks:");
        for (int i = 0; i < 5; i++) {
            marks.add(sc.nextInt());
        }

        System.out.println("Marks:");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks : " + min);

        sc.close();
    }
}