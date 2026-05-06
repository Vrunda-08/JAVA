import java.io.*;

public class Practical45 {
    public static void main(String[] args) {
        System.out.println("Vrunda Vaghela (250393107016)\n");

        if (args.length < 2) {
            System.out.println("Invalid arguments");
            return;
        }

        try {
            String command = args[0];
            File file = null;

            if (command.equalsIgnoreCase("copy")) {
                File source = new File(args[1]);
                File dest = new File(args[2]);

                FileInputStream fis = new FileInputStream(source);
                FileOutputStream fos = new FileOutputStream(dest);

                int ch;
                while ((ch = fis.read()) != -1) {
                    fos.write(ch);
                }

                fis.close();
                fos.close();

                System.out.println("File copied successfully");
                file = dest;
            }
            else if (command.equalsIgnoreCase("delete")) {
                file = new File(args[1]);

                if (file.delete()) {
                    System.out.println("File deleted successfully");
                } else {
                    System.out.println("Unable to delete file");
                }
            }
            else if (command.equalsIgnoreCase("rename")) {
                File oldFile = new File(args[1]);
                File newFile = new File(args[2]);

                if (oldFile.renameTo(newFile)) {
                    System.out.println("File renamed successfully");
                    file = newFile;
                } else {
                    System.out.println("Rename failed");
                }
            }

            if (file != null && file.exists()) {
                System.out.println("File Name       : " + file.getName());
                System.out.println("Absolute Path   : " + file.getAbsolutePath());
                System.out.println("File Size       : " + file.length() + " bytes");
                System.out.println("Readable        : " + file.canRead());
                System.out.println("Writable        : " + file.canWrite());
                System.out.println("Last Modified   : " + file.lastModified());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid operation");
        }
    }
}