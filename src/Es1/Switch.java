package Es1;

public class Switch {

	public static String funzioneSwitch(int n) {
		switch (n) {
		case 0:

			return "zero";
		case 1:

			return "uno";
		case 2:

			return "due";
		case 3:

			return "tre";
		default:
			return "ERRORE, il numero passato non è tra 0 e 3";
		}
	}

}
