import java.util.*;
public class Wpisz {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Pobranie pierwszej porcji danych
		System.out.print("Jak siê nazywasz? ");
		String nazwa = in.nextLine();
		
		// Pobranie drugiej porcji danych
				System.out.print("Ile masz lat? ");
				int wiek = in.nextInt();
				
				System.out.println("Witaj uzytkowniku" + nazwa + ". W przysz³ym roku bêdziesz mieæ " + (wiek + 1) + " lat");
				
	}
}