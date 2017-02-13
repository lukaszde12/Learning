public class GeneratorTreningu {
	public static void main (String[] args) {
		
		String[] listaSlow1 = {"linie zakrêtów", "stójka na stoj¹co", "stójka na siedz¹co", "krawê¿niki", "wheelie", "hamowanie"};
		String[] listaSlow2 = {"niskie siod³o", "wysokie siod³o", "ty³ek nisko nad ko³em", "jazda na stoj¹co", "koncentracja"};
		String[] listaSlow3 = {"zmiany biegów przed zakrêtem", "podjazd na piony", "bunny hop", "endo", "prêdkoœæ w zakrêcie", "uœlizgi ko³a w zakrêcie"};
		String[] listaSlow4 = {"hamowanie bokiem", "pionowe œciany", "schody", "jazda na przednik kole", "jazda do ty³u"};
		
	int lista1Dlugosc = listaSlow1.length;
	int lista2Dlugosc = listaSlow2.length;
	int lista3Dlugosc = listaSlow3.length;
	int lista4Dlugosc = listaSlow4.length;
	
	int rnd1 = (int) (Math.random() * lista1Dlugosc);
	int rnd2 = (int) (Math.random() * lista2Dlugosc);
	int rnd3 = (int) (Math.random() * lista3Dlugosc);
	int rnd4 = (int) (Math.random() * lista4Dlugosc);
	
String zdanie = listaSlow1[rnd1] + " + " + listaSlow2[rnd2] + " + " + listaSlow3[rnd3] + " + " + listaSlow4[rnd4];

System.out.println("Dziœ dorzucê nastêpuj¹ce skilsy do treningu: " + zdanie);
		
	}
}