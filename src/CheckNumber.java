import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci tre numeri interi");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 == num2 || num1 == num3 || num3 == num2) {
            System.out.println("ci sono almeno due numeri uguali " + num1 + " " + num2 + " " + num3);
        } else if (num1 > num2 && num1 > num3) {
            System.out.println("il numero più grande è " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("il numero più grande è " + num2);
        } else {
            System.out.println("il numero più grande è " + num3);
        }
        // else {
        // System.out.println("il numero più grande è : " + Math.max(num1,
        // Math.max(num2, num3)));
        // }
        scanner.close();

    }
}
