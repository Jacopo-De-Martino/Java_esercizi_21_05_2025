
import java.util.Scanner;

public class PromptBioUtente {
    public static void main(String[] args) {
        //!Instazio lo scanner
        Scanner scanner = new Scanner(System.in);
        
        //* chiedo a l'utente di inserire i dati richiesti e catturo le risposte con scanner
        System.out.println("Inserisci il tuo nome:");
        String nome = scanner.nextLine();
        System.out.println("Inserisci il tuo anno di nascita:");
        int annoNascita = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Che giorno è oggi(numero)");
        int giornoSettimana = scanner.nextInt();
        
        //* stampo il risultato */
        System.out.printf(" Buongiorno sono :%s%n sono nato il:21/07%d%n  ",nome,annoNascita);
        System.out.println("mancano : " + (6-giornoSettimana) + " giorni al weekend(Sabato)");

        scanner.close();
        
    }


}
