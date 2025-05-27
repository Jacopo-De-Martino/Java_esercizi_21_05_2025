import java.util.Scanner;

public class CheckPatente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("come ti chiami?");
        String nome = scanner.nextLine();
        System.out.println("Quanti anni hai?");
        int anni = scanner.nextInt();

        if (anni >= 18) {
            System.out.println("Hai la patente?(true/false)");
            boolean haPatente = scanner.nextBoolean();
            /* controllo patente */
            if (haPatente) {
                System.out.println("hai bevuto(si/no)");
                scanner.nextLine();
                String haBevutoString = scanner.nextLine().toLowerCase();
                /* controllo se ha bevuto */
                if (haBevutoString.equals("no")) {
                    System.out.printf("%s puoi guidare", nome);
                } else {
                    System.out.printf("%s hai bevuto : %s, sei ubriaco non puoi guidare", nome, haBevutoString);
                }
            } else {
                System.out.printf(" %s non hai la patente%n patente :%b, non puoi guidare", nome, haPatente);
            }
        } else {
            System.out.printf("%s eta : %d ,non sei maggiorenne non puoi guidare", nome, anni);
        }
        scanner.close();
    }
}
