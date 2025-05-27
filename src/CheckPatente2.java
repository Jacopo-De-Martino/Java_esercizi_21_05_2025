import java.util.Scanner;

public class CheckPatente2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("come ti chiami?");
        String nome = scanner.nextLine();
        System.out.println("Quanti anni hai?");
        int anni = scanner.nextInt();
        System.out.println("Hai la patente?(true/false)");
        boolean haPatente = scanner.nextBoolean();
        System.out.println("hai bevuto(si/no)");
        scanner.nextLine();
        String haBevutoString = scanner.nextLine().toLowerCase();

        if (anni <= 18) {
            System.out.println("non sei maggiorenne");
        } else if (!haPatente) {
            System.out.println("non puoi guidare non hai la patente");
        } else if (haBevutoString.equals("si")) {
            System.out.println("non puoi guidare hai bevuto");
        } else {
            System.out.println(nome + " puoi guidare");
        }
        scanner.close();

    }
}