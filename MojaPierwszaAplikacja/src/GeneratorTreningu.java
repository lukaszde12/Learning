public class GeneratorTreningu {
	public static void main (String[] args) {
		
		String[] listaSlow1 = {"linie zakr�t�w", "st�jka na stoj�co", "st�jka na siedz�co", "kraw�niki", "wheelie", "hamowanie"};
		String[] listaSlow2 = {"niskie siod�o", "wysokie siod�o", "ty�ek nisko nad ko�em", "jazda na stoj�co", "koncentracja"};
		String[] listaSlow3 = {"zmiany bieg�w przed zakr�tem", "podjazd na piony", "bunny hop", "endo", "pr�dko�� w zakr�cie", "u�lizgi ko�a w zakr�cie"};
		String[] listaSlow4 = {"hamowanie bokiem", "pionowe �ciany", "schody", "jazda na przednik kole", "jazda do ty�u"};
		
	int lista1Dlugosc = listaSlow1.length;
	int lista2Dlugosc = listaSlow2.length;
	int lista3Dlugosc = listaSlow3.length;
	int lista4Dlugosc = listaSlow4.length;
	
	int rnd1 = (int) (Math.random() * lista1Dlugosc);
	int rnd2 = (int) (Math.random() * lista2Dlugosc);
	int rnd3 = (int) (Math.random() * lista3Dlugosc);
	int rnd4 = (int) (Math.random() * lista4Dlugosc);
	
String zdanie = listaSlow1[rnd1] + " + " + listaSlow2[rnd2] + " + " + listaSlow3[rnd3] + " + " + listaSlow4[rnd4];

System.out.println("Dzi� dorzuc� nast�puj�ce skilsy do treningu: " + zdanie);
		
	}
}