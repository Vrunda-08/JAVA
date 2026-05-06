import java.util.*;

public class Practical48 {
    public static void main(String[] args) {
        System.out.println("Vrunda Vaghela (250393107016)\n");
        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();

        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter song name: ");
            playlist.add(sc.nextLine());
        }

        System.out.println("\nPlaylist:");
        System.out.println(playlist);

        if (!playlist.isEmpty()) {
            String first = playlist.removeFirst();
            System.out.println("\nPlaying: " + first);
            System.out.println("Playlist after playing first song:");
            System.out.println(playlist);
        }

        if (!playlist.isEmpty()) {
            String last = playlist.removeLast();
            System.out.println("\nSkipped: " + last);
            System.out.println("Playlist after skipping last song:");
            System.out.println(playlist);
        }

        sc.close();
    }
}