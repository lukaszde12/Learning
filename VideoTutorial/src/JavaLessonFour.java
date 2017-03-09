import java.util.Scanner;

public class JavaLessonFour {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main (String[] args)
	
	{
		
	String conYorN = "Y";
	
	int h = 1;
	
	while (conYorN.equalsIgnoreCase("y"))
	{
		
		System.out.println(h);
		System.out.println("Continue y or n? ");
		conYorN = userInput.nextLine();
		h++;
	}
	
	}
}