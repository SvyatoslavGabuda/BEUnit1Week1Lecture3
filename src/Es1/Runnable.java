package Es1;

import java.util.Scanner;

public class Runnable {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("la stringa inserita è pari? " + FunzionioniEs1.stringaPariDispari("ciao"));
		System.out.println("la stringa inserita è pari? " + FunzionioniEs1.stringaPariDispari("asdhhagadfhasiufybd"));
		System.out.println("l'anno è bisestile? " + FunzionioniEs1.annoBisestile(2000));
		System.out.println("l'anno è bisestile? " + FunzionioniEs1.annoBisestile(219846));
		System.out.println("stampa il numero: " +Switch.funzioneSwitch(0));
		System.out.println("stampa il numero: " +Switch.funzioneSwitch(5));
		
		For.contoAllaRovescia(9);
		
		While.separatore();
		
		
		
	}
}
