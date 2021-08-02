import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("Welcome To Caesar-Cipher :)");
        while (isRunning) {
            System.out.println("Press : \n1:-encrypt \n2:-decrypt \n3:-Exit");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    String enWord = wordInput();
                    System.out.println("Enter encryption shift key value");
                    int enKey = scanner.nextInt();
                    break;
                case 2:
                    String decWord = wordInput();
                    System.out.println("Enter decryption shift key value");
                    int decKey = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Exit. Thank you for using this application.");
                    System.exit(0);
                    isRunning = false;
                default:
                    System.out.println("Kindly select a valid input");
            }
        }
    }

    static String wordInput(){
        System.out.println("Enter a word or a statement:-");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
