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
		 * TABLICE
		 * 
		 * int[] a = new int[100];   deklaracja pol tablicy
		 * int[] smallPrimes = { 2, 3, 5, 7, 11, 13 };   szybka deklaracja zmiennych
		 * for (int i = 0; i < 100; i++) a[i] = i;  zapelnienie tablicy od 0-99
		 * for (int i = 0; i < a.length; i++)   System.out.println(a[i]);  Info o liczbie elementow w tablicy
		 * 
		 * 
		 * OBIEKTY
		 * 
		 * KLASA
		 * nowy obiekt za pomoca KONSTRUKTORÓW (specjalna metoda inicjujaca obiekty)
		 * 
		 * METODY definiujemy poprzez Nazwa_Zmiennej.Nazwa_Metody(Parametry Metody);
		 * 
		 * 
		 * 
		 * 
		 */
	}
}