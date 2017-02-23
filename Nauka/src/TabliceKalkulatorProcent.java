public class TabliceKalkulatorProcent
{
	public static void main(String[] args)
	{
		final double PROCENT = 1;
		final int ILOSCPROCENT = 6;
		final int LATA = 10;
		
// Ustawienie stóp oprocentowania na wartoœci w przedziale 10 – 15%.
		
		double[] stopaProcent = new double[ILOSCPROCENT];
		for (int j = 0; j < stopaProcent.length; j++)
			stopaProcent[j] = (PROCENT + j) / 100.0;
		double[][] wartosc = new double[LATA][ILOSCPROCENT];
		
// Ustawienie sald pocz¹tkowych na 10 000.
		
		for (int j = 0; j < wartosc[0].length; j++)
			wartosc[0][j] = 40000;
		
// Obliczenie odsetek dla przysz³ych lat.
		for (int i = 1; i < wartosc.length; i++)
		{
			for (int j = 0; j < wartosc[i].length; j++)
			{
				
// Pobranie sald z minionego roku z poprzedniego wiersza.
				
				double staraWartosc = wartosc[i - 1][j];
				
// Obliczenie odsetek.
				
				double interest = staraWartosc * stopaProcent[j];
				
// Obliczenie tegorocznego salda.
				
				wartosc[i][j] = staraWartosc + interest;
			}
		}
		
//Wydruk jednego wiersza stóp oprocentowania.
		
		for (int j = 0; j < stopaProcent.length; j++)
			System.out.printf("%9.0f%%", 100 * stopaProcent[j]);
		System.out.println();
		
//Wydruk tabeli sald.
		for (double[] wiersz : wartosc)
		{
			
//Wydruk wiersza tabeli.
			
			for (double b : wiersz)
				System.out.printf("%10.2f", b);
			System.out.println();
		}
}
}