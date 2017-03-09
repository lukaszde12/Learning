public class JavaLessonThree {
	public static void main(String[] args)
	{
		int randomNumber = (int) (Math.random() * 50);
		
		/* Relational Operators:
		 * Java has 6 relational operators
		 * >  : Greater Than
		 * <  : Less Than
		 * == : Equal To
		 * != : Not Equal To
		 * >= : Grater Than Or Equal To
		 * <= : Less Than Or Equal To
		 * 		 * 
		 */
		
		if (randomNumber < 25)
		{
			System.out.println("The random number is less than 25");
			
		}
		else if (randomNumber > 40)
		{
			System.out.println("The random number is greater than 40");
		}
	
		else if (randomNumber <= 18)
	{
		System.out.println("The random number is equal to 18");
	}
	
		else if (randomNumber >= 40)
	{
		System.out.println("The random number is not equal to 40");
	}
	
		else
	{
		System.out.println("Nothing Worked");
		
	}
		
		/* Logical Operators:
         *  Java has 6 logical operators
         *  !  : Converts the boolean value to its right to its opposite form ie. true to false
         *  &  : Returns true if boolean value on the right and left are both true (Always evaluates both boolean values)
         *  && : Returns true if boolean value on the right and left are both true (Stops evaluating after first false)
         *  |  : Returns true if either boolean value on the right or left are true (Always evaluates both boolean values)
         *  || : Returns true if either boolean value on the right or left are true (Stops evaluating after first true)
         *  ^  : Returns true if there is 1 true and 1 false boolean value on the right or left
         */

		
		if (!(false))
		{
			System.out.println("\nI turned false into true");
		}
		
		if ((false) | (true))
			
		{
			System.out.println("One is true");
		}
		
		System.out.println("The random number is " + randomNumber);
		
	}
}