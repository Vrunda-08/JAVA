import java.util.Scanner;

class PasswordCheck20 {

    static boolean isValidPassword(String password) {

        if(password.length() < 8)
            return false;

        int digitCount = 0;

        for(int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if(Character.isLetterOrDigit(ch)) {

                if(Character.isDigit(ch)) {
                    digitCount++;
                }

            } else {
                return false;
            }
        }

        if(digitCount >= 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vrunda Vaghela (250393107016)\n");
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if(isValidPassword(password))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
}