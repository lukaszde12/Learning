class Zgadywanka {
	Gracz p1;  //skladowe klasy przechowujace obiekty Gracz
	Gracz p2;
	Gracz p3;
	
	public void rozpocznijGre() {
		p1 = new Gracz();  //tworzymy 3 obiekty Gracz i zapisujemy je w 3 skladowych
		p2 = new Gracz();
		p3 = new Gracz();
		
		int typp1 = 0;   // Deklaracja 3 zmiennych w ktorych przechowujemy trzy liczby wytypowane przez poszczegolnych graczy
		int typp2 = 0;
		int typp3 = 0;
		
		boolean p1odgadl = false; //Deklaracja 3 zmiennych, ktore beda przechowywac wartosci True lub False w zaleznosci od odpowiedzi konkretnego gracza
		boolean p2odgadl = false;
		boolean p3odgadl = false;
		
		int liczbaOdgadywana = (int) (Math.random() *10 );
		System.out.println("Myœlê o liczbie z zakresu od 0 do 9..."); //Wyznaczenie liczby jaka musza odgadnac gracze
		
		while(true) {
			System.out.println("Nale¿y wytpowaæ liczbê: " + liczbaOdgadywana );
			
			p1.zgaduj(); //wywolanie metody zgaduj() kazdego z graczy
			p2.zgaduj();
			p3.zgaduj();
			
			typp1 = p1.liczba;  //odczytanie skladowych obiketow graczy
			System.out.println("Gracz pierwszy wytypowal liczbe: " + typp1);
			
			typp2 = p2.liczba;
			System.out.println("Gracz drugi wytypowal liczbe: " + typp2);
			
			typp3 = p3.liczba;
			System.out.println("Gracz trzeci wytypowal liczbe: " + typp3);
			
			if (typp1 == liczbaOdgadywana) {
				p1odgadl = true;
			}
			if (typp2 == liczbaOdgadywana) {
				p2odgadl = true;
			}	
			if (typp3 == liczbaOdgadywana) {
				p3odgadl = true;
			}
			
			if (p1odgadl || p2odgadl || p3odgadl) {
				
				System.out.println("Mamy zwyciezce!");
				System.out.println("Czy gracz pierwszy wytypowal poprawnie? " + p1odgadl);
				System.out.println("Czy gracz drugi wytypowal poprawnie? " + p2odgadl);
				System.out.println("Czy gracz trzeci wytypowal poprawnie? " + p3odgadl);
				System.out.println("Koniec gry");
				break; // Gra skonczona, zatem wychodzimy z petli while
			} else {
				System.out.println("Gracze beda musieli sprobowac jeszcze raz.");
			}  // koniec if - else
		} //koniec while
	 } //koniec metody rozpocznijGre
	} // koniec klasy

class Gracz {
int liczba = 0; // tu jest zapisywana typowana liczba
public void zgaduj() {
liczba = (int) (Math.random() * 10);
System.out.println("Typuje liczbe: " + liczba);
}
}
class StarterGry {
public static void main(String[] args) {
Zgadywanka gra = new Zgadywanka();
gra.rozpocznijGre();
}
}
