mport java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password to check its strength: ");
        String password = sc.nextLine();

        String strength = checkPasswordStrength(password);
        System.out.println("Password Strength: " + strength);
    }

    public static String checkPasswordStrength(String password) {
        int score = 0;

        if (password.length() >= 8) {
            score++;
        }
        if (password.matches(".[A-Z].")) {
            score++;
        }
        if (password.matches(".[a-z].")) {
            score++;
        }
        if (password.matches(".\\d.")) {
            score++;
        }
        if (password.matches(".[!@#$%^&()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*")) {
            score++;
        }

        switch (score) {
            case 5:
                return "Very Strong";
            case 4:
                return "Strong";
            case 3:
                return "Moderate";
            case 2:
                return "Weak";
            default:
                return "Very Weak";
        }
    }
}