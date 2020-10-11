//programma che legge due numeri da tastiera e stampa il risultato

import java.util.Scanner;

public class Somma {
	public static void main(String[] args) {
		System.out.println("Ciao!\nEseguo la somma di due numeri.\nDigita i numeri da tastiera:");
		
		Scanner tastiera = new Scanner(System.in);		
		
		int n1, n2;
		
		n1 = tastiera.nextInt();
		n2 = tastiera.nextInt();
		
		System.out.print("La somma dei due numeri è ");			
		//la differenza tre print e println è che con la prima il cursore sta sulla stessa riga, mentre con l'altra va a capo.
		
		System.out.println(n1+n2);
	
		tastiera.close();								
		//mi chiude tastiere che altrimenti non verrebbe presa dal garbage collectore, ma attenzione che chiude anche scanner
	}
}
