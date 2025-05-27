# ESERCIZI SEMPLICI CON SCANNER

### PromptBioUtente.java

esercizio svolto in modo basico senza funzioni e condizioni di if con weekend calcolato in modo statico 6-giorno inserito dall'utente

### CalcoloGiorniSettimana.java

esercizio svolto con l'utilizo di funzioni calcola anno di nascita in modo dinamico utilizzando LocalDate.now().getYear()
e sottraendolo al l'anno di nascita inserito da l'utente--> calcolaEta(int annoNascita)
un controllo su l'inserimento del giorno della settimana e calcolo dei giorni mancanti a sabato--> calcolaGiorniAlWeekend(int giorno)

# Casting Java (implicita o esplicita)

esplicita si può eseguire utilizando un Casting o operatori di conversione
implicita viene gestita da java stesso durante la lettura e compilazione (coercion)

es implicita
int numInt = 10
double numDouble = 10.35
int numInt2 = numDouble ---> 10
es esplicita
double numDouble2 =(double) numInt -->10.00

implicito
byte->short->char->int->long->float->double
esplicito
double->float->long->int->char->short->boolean

# Gli Operatori in Java

## Operatori Matematici (Aritmetici)

Usati per eseguire operazioni matematiche.

- (Addizione):
  Somma valori numerici (es. 5 + 3 = 8).
  Concatena stringhe (es. "Ciao" + " Mondo" = "Ciao Mondo").

* (Sottrazione):
  Sottrae valori numerici (es. 8 - 3 = 5).

- (Moltiplicazione):
  Moltiplica valori numerici (es. 4 \* 2 = 8).
  / (Divisione):
  Divide valori numerici.
  Attenzione: Se entrambi gli operandi sono interi, il risultato sarà un intero (la parte decimale viene troncata, es. 7 / 2 = 3).
  Se almeno un operando è un numero in virgola mobile, il risultato sarà in virgola mobile (es. 7.0 / 2 = 3.5).
  % (Modulo):
  Calcola il resto della divisione tra due valori numerici (es. 7 % 2 = 1, perché 7 diviso 2 fa 3 con resto di 1).

## Operatori di Assegnazione Composti

Una scorciatoia per eseguire un'operazione e assegnare il risultato alla stessa variabile.

+= (Addizione e Assegnazione): x += y è equivalente a x = x + y.
-= (Sottrazione e Assegnazione): x -= y è equivalente a x = x - y.
_= (Moltiplicazione e Assegnazione): x _= y è equivalente a x = x \* y.
/= (Divisione e Assegnazione): x /= y è equivalente a x = x / y.
%= (Modulo e Assegnazione): x %= y è equivalente a x = x % y.

## Operatori di Incremento e Decremento

Modificano il valore di una variabile aggiungendo o sottraendo 1.

++ (Incremento): Aumenta il valore di una variabile di 1.
Prefisso (++x): Incrementa x prima di usarlo nell'espressione.
Postfisso (x++): Incrementa x dopo averlo usato nell'espressione.
-- (Decremento): Diminuisce il valore di una variabile di 1.
Prefisso (--x): Decrementa x prima di usarlo nell'espressione.
Postfisso (x--): Decrementa x dopo averlo usato nell'espressione.

## Operatori di Confronto (Relazionali)

Confrontano due valori e restituiscono un valore booleano (true o false).

== (Uguaglianza): Verifica se due valori sono uguali (es. 5 == 5 è true).
!= (Diversità): Verifica se due valori sono diversi (es. 5 != 3 è true).

> (Maggiore di): Verifica se il primo valore è maggiore del secondo (es. 5 > 3 è true).
> < (Minore di): Verifica se il primo valore è minore del secondo (es. 3 < 5 è true).
> = (Maggiore o uguale a): Verifica se il primo valore è maggiore o uguale al secondo (es. 5 >= 5 è true).
> <= (Minore o uguale a): Verifica se il primo valore è minore o uguale al secondo (es. 3 <= 5 è true).
> Operatori Logici
> Combinano espressioni booleane e restituiscono un valore booleano (true o false).

&& (AND Logico): Restituisce true se entrambe le condizioni sono true. (Short-circuiting: valuta la seconda solo se la prima è true).
|| (OR Logico): Restituisce true se almeno una delle condizioni è true. (Short-circuiting: valuta la seconda solo se la prima è false).
! (NOT Logico): Inverte il valore booleano di un'espressione (es. !true è false).

## Operatore Condizionale (Ternario)

Un operatore a tre operandi che fornisce un modo conciso per scrivere una clausola if-else.

condizione ? espressione1 : espressione2
Se la condizione è true, il risultato è espressione1.
Se la condizione è false, il risultato è espressione2.
Esempio: String messaggio = (eta >= 18) ? "Maggiorenne" : "Minorenne";

# Funzioni string

## string.length()

Restituisce un int che rappresenta la lunghezza della stringa (numero di caratteri).
Esempio: "ciao".length() → 4

## string.toUpperCase()

Restituisce una nuova stringa con tutti i caratteri maiuscoli.
Esempio: "ciao".toUpperCase() → "CIAO"

## string.toLowerCase()

Restituisce una nuova stringa con tutti i caratteri minuscoli.
Esempio: "CIAO".toLowerCase() → "ciao"

## string.indexOf("substring")

Restituisce l'indice (basato su zero) della prima occorrenza della sottostringa, oppure -1 se non trovata.
Esempio: "programmare".indexOf("gram") → 3

## string.concat("altra stringa")

Restituisce una nuova stringa risultante dalla concatenazione della stringa originale con quella passata come parametro.
Esempio: "Java".concat("Script") → "JavaScript"

## string.contains("substring")

Restituisce true se la stringa contiene la sottostringa specificata.
Esempio: "ciao mondo".contains("mondo") → true

## string.isEmpty()

Restituisce true se la stringa è vuota (cioè ha lunghezza 0).
Esempio: "".isEmpty() → true

## string.equals("altra stringa")

Confronta due stringhe per verificare se sono esattamente uguali, distinguendo tra maiuscole e minuscole.
Esempio: "ciao".equals("Ciao") → false

## string.split("delimitatore")

Divide la stringa in un array di sottostringhe, usando il delimitatore specificato.
Esempio: "a,b,c".split(",") → ["a", "b", "c"]

## es split di una string salvata in un array e stampata

public class Main{
public static void main(String[] args){
String str = "Hello World";
String[] words = str.split("\\s");
System.out.println(Arrays.toString(words));
}

## string.trim()

Restituisce una nuova stringa con gli spazi bianchi iniziali e finali rimossi.
Esempio: " ciao ".trim() → "ciao"

# La classe Math

## Math.max(x, y)

Restituisce il valore maggiore tra x e y.
Esempio: Math.max(5, 10) → 10

## Math.min(x, y)

Restituisce il valore minore tra x e y.
Esempio: Math.min(5, 10) → 5

## Math.sqrt(x)

Restituisce la radice quadrata di x.
Esempio: Math.sqrt(64) → 8.0

## Math.abs(x)

Restituisce il valore assoluto di x (cioè senza segno).
Esempio: Math.abs(-7) → 7

## Math.pow(x, y)

Restituisce x elevato alla potenza y.
Esempio: Math.pow(2, 3) → 8.0

## Math.round(x)

Arrotonda x al numero intero più vicino.
Esempio: Math.round(4.6) → 5

## Math.floor(x)

Restituisce il più grande intero minore o uguale a x.
Esempio: Math.floor(4.8) → 4.0

## Math.ceil(x)

Restituisce il più piccolo intero maggiore o uguale a x.
Esempio: Math.ceil(4.2) → 5.0

## Math.random()

Restituisce un numero casuale compreso tra 0.0 (incluso) e 1.0 (escluso).
Esempio: Math.random() → 0.537... (varia ogni volta)

## il Costrutto if , else and else if or switch operatore ternario

### if else elseif(Istruzioni condizionali o Branching Statements)

-->Consentono di eseguire blocchi di codice diversi in base a condizioni booleane.

### switch( Selezione multipla o Multi-way Branch)

-->Valuta un'espressione e seleziona uno tra molti blocchi possibili.

### operatore ternario(Operatore condizionale ternario o Conditional operator)

--> Versione compatta di if-else, usata in espressioni.

Utilizzare if per specificare un blocco di codice da
eseguire, se una condizione specificata è vera

Utilizzare else per specificare un blocco di codice da
eseguire, se la stessa condizione è falsa

Utilizzare else if per specificare una nuova condizione da
testare, se la prima condizione è falsa

Utilizzare switch per specificare molti blocchi alternativi
di codice da eseguire
