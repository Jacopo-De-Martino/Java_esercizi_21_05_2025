import java.time.LocalDate;
import java.util.Scanner;

public class CalcoloGiorniSettimana {
    public static void main(String[] args) {
        //! instazio lo scanner
                Scanner scanner = new Scanner(System.in);
        //* chiedo a l'utente di inserire i dati richiesti e catturo le risposte con scanner
        System.out.println("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        System.out.println("Inserisci il tuo anno di nascita: ");
        int annoNascita = scanner.nextInt();

        System.out.println("Inserisci il giorno della settimana odierno (1-7): ");
        int giorno = scanner.nextInt();
        //! utilizzo le funzioni per calcolare giorni al weekend e l'eta dell'utente
        int giorniAlWeekend = calcolaGiorniAlWeekend(giorno);
        int eta = calcolaEta(annoNascita);

        System.out.println(
                "Il tuo nome è " + nome + ", hai " + eta + " anni e mancano "
                        + giorniAlWeekend
                        + " giorni al prossimo weekend.");
        scanner.close();
    }
    //* funzione che restituisce un numero intero a seconda del'imput dell'utente che rappresenta i giorni mancanti a sabato */
    public static int calcolaGiorniAlWeekend(int giorno) {
        if (giorno < 1 || giorno > 7) {
            throw new IllegalArgumentException("Il giorno deve essere compreso tra 1 e 7.");
        }
        // else if (giorno >= 6) {
        // return 13 - giorno;
        // }
        else
            return 6 - giorno;
    }
    //* funzione che restituisce un numero intero a seconda del'imput dell'utente che calcola l'età dell'utente sottraendo anno di nascita a l'anno attuale*/
    public static int calcolaEta(int annoNascita) {
        if (annoNascita > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("L'anno di nascita non può essere maggiore dell'anno corrente.");
        }
        return LocalDate.now().getYear() - annoNascita;
   }


}
