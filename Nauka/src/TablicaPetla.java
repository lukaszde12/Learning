public class TablicaPetla {
	public static void main (String args[]) {
		int tab[] = new int[20];
		for(int t = 0; t < 20; t++){
			tab[t] = t + 1;}
		int i = 0;
			while(i < tab.length){
				System.out.println("tab[" + i + "] = " + tab[i]); 
				i++;
}
}
}






/* Tab ntego stopnia, wypelnic i zrobic kopiaTab ntego stopnia, skopiowac z Tab i odwrocic
 * 
 * Porzadek malejacy: 
 * 
  
int tablica[] = new int[20];
for(int i = 0; i < 20; i++){
tablica[i] = 20 - i;
}
System.out.println("Zawartoœæ tablicy:");
for(int i = 0; i < 20; i++){
System.out.println("tablica[" + i + "] = " + tablica[i]);
}


Kopiowanie tablicy

int[] kopiatab = Arrays.copyOf(tab, tab.length);

 * 
 * 
 * 
 */
