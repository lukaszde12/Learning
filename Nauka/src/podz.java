

public class podz {
	public static void main (String[] args) {
		int x = 1;
		for (x=1; x<20; x++) {
			while (x%3==0 && x<20) {
				System.out.println(x);
				x++;
			}
		}
	}
}