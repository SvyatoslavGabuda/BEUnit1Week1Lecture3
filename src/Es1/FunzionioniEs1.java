package Es1;

public class FunzionioniEs1 {
	public static boolean stringaPariDispari(String a) {
		if (a.length() % 2 == 0) {
			return true;

		} else {
			return false;
		}

	}

	public static boolean annoBisestile(int a) {
		if (a % 4 == 0 | a % 100 == 0 && a % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
