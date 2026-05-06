import java.io.*;

public class Practical44 {
    public static void main(String[] args) {
        System.out.println("Vrunda Vaghela (250393107016)\n");
        BufferedReader br = null;
        int lineCount = 0, wordCount = 0, charCount = 0;

        try {
            br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        charCount++;
                    }
                }
            }
            System.out.println("Lines      : " + lineCount);
            System.out.println("Words      : " + wordCount);
            System.out.println("Characters : " + charCount);
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if (br != null) br.close();
            }
            catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}