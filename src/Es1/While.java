package Es1;

public class While {
	public static void separatore() {
		System.out.println("Inserisci una stringa da separare: ");
		String a = Runnable.scan.nextLine();
		
		do {
			String[] b = a.split("");
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
			System.out.println("Inserisci una altra stringa da separare: ");
			
			a = Runnable.scan.nextLine();
			
			
		} while (!a.equals(":q"));
		System.out.println("fine");
	}
}
