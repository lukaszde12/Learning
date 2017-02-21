/**
 * 
 * automat tworzy komentarz
 *
 */
import java.util.Date;
public class Zakuc
{
	public static void main (String[] args)
	{ 
		System.out.println("Nie powiemy 'Witaj, swiecie!'");
		System.out.printf("%1$s %2$te %2$tB %2$tY", "Data:", new Date());
		
		// komentarze klepac czasem trzeba! Pisze sie je od znaku do konca wiersza!
		
		/* komentarz 
		 * w bloku tresci
		 * moze miec pare linii
		 */
		
		
		/*
		 * zmienne w Java
		 * 
		 * 
		 * int (2mld cyfr 4 bajty)
		 * short (32tys 2 bajty)
		 * long (pierdyliard 8 bajtow)
		 * byte (127 cyfr)
		 * float (zmiennoprzecinkowe 6-7 cyfr, 4 bajty)
		 * double (pierdyliard, 8 bajtow)
		 * char (jednostka kodowa UTF-16)
		 * boolean (true i false)
		 * 
		 * final (mozna tylko raz przypisac wartosc)
		 * 
		 * Scanner (czytanie danych, in.nextLine wczytanie linii)
		 * Scanner in = new Scanner(Paths.get("mojplik.txt"));  wczytanie pliku
		 * PrintWriter out = new PrintWriter("mojplik.txt");     zapisanie do pliku
		 * 
		 * 
		 */
	}
}