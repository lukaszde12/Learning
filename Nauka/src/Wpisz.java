import java.util.*;
public class Wpisz {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Pobranie pierwszej porcji danych
		System.out.print("Jak si� nazywasz? ");
		String nazwa = in.nextLine();
		
		// Pobranie drugiej porcji danych
				System.out.print("Ile masz lat? ");
				int wiek = in.nextInt();
				
				System.out.println("Witaj uzytkowniku" + nazwa + ". W przysz�ym roku b�dziesz mie� " + (wiek + 1) + " lat");
				
	}
}