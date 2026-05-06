import java.io.*;

public class Practical43 {
    public static void main(String[] args) {
        System.out.println("Vrunda Vaghela (250393107016)\n");
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");
            fw.write("101 Visha 85\n");
            fw.write("102 Riya 78\n");
            fw.write("103 Nishi 92\n");
            fw.close();

            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            System.out.println("Student Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if (fw != null) fw.close();
                if (br != null) br.close();
            }
            catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}