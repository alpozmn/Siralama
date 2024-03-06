import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üç sayı giriniz:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("Sıralama: " + num1 + " " + num2 + " " + num3);
            } else {
                System.out.println("Sıralama: " + num1 + " " + num3 + " " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Sıralama: " + num2 + " " + num1 + " " + num3);
            } else {
                System.out.println("Sıralama: " + num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Sıralama: " + num3 + " " + num1 + " " + num2);
            } else {
                System.out.println("Sıralama: " + num3 + " " + num2 + " " + num1);
            }
        }
    }
}
