public class Krasomowca {
	public static void main (String[] args) {
		
// Trzy grupy s��w, kt�re b�d� wybierane do zadania!
		String[] listaSlow1 = {"architektura wielowarstwowa", "30000 metr�w", "rozwi�zanie B-do-B", "aplikacja kliencka", "interfejs internetowy", "inteligentna karta", "rozwi�zanie dynamiczne", "sze�� sigma", "przenikliwo��"};
		String[] listaSlow2 = {"zwi�ksza mo�liwo�ci", "poprawia atrakcyjno��", "pomna�a warto��", "opracowana dla", "bazuj�ca na", "rozproszona", "sieciowa", "skoncentrowana na", "podniesiona na wy�szy poziom", "skierowanej", "udost�pniona"};
		String[] listaSlow3 = {"procesu", "punktu wpisywania", "rozwi�zania", "strategii", "paradygmatu", "portalu", "witryny", "wersji", "misji"};
	int lista1Dlugosc = listaSlow1.length;
	int lista2Dlugosc = listaSlow2.length;
	int lista3Dlugosc = listaSlow3.length;
	
	int rnd1 = (int) (Math.random() * lista1Dlugosc);
	int rnd2 = (int) (Math.random() * lista2Dlugosc);
	int rnd3 = (int) (Math.random() * lista3Dlugosc);
	
String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + " " + listaSlow3[rnd3];

System.out.println("To jest to, czego nam trzeba: " + zdanie);
		
	}
}