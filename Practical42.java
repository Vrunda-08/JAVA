import java.io.BufferedReader;
import java.io.FileReader;

public class Practical42 {
    public static void main(String[] args) {
        System.out.println("Vrunda Vaghela (250393107016)\n");
        int charCount = 0, wordCount = 0, lineCount = 0;

        try {
            if (args.length != 1) {
                System.out.println("Please provide file name");
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("Lines      : " + lineCount);
            System.out.println("Words      : " + wordCount);
            System.out.println("Characters : " + charCount);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}