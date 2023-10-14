import java.util.Scanner;

public class Main {
    public static int deposit;
    public static int term;
    public static int percent = 8;

    public static void main(String[] args) {
        System.out.println("Введіть суму вкладу: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            deposit = scanner.nextInt();
        }
        else {
            System.out.println("Введіть ціле число: ");
        }

        System.out.println("Введіть термін вкладу: ");
        if (scanner.hasNextInt()){
            term  = scanner.nextInt();
        }
        else {
            System.out.println("Введіть ціле число: ");
        }

        double result = deposit * Math.pow((1+0.01*percent), term);
        System.out.printf("Сума вкладу через " + term + " років буде становити: %.2f", result);
    }
}
