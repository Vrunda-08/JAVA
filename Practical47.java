import java.util.*;

public class Practical47 {
    public static void main(String[] args) {
        System.out.println("Vrunda Vaghela (250393107016)\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String input = sc.nextLine();

        String[] words = input.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}