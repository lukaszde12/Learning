public class HelloWorldByte
{
	public static void main(String[] args)
	{
				
		byte bigByte = 127;
		short bigShort = 32767;
		int bigInt = 210000000;
		long bigLong = 922000000000000L;
		float bigFloat = 3.14F;
		double bigDouble = 3.1488237;
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean trueOrFalse = true;
		
		char randomChar = 66;
		char anotherChar = 'A';
		
		char escapedChars = '\\';
				
		String randomString = "I'm a random string";
		String anotherString = "Stuff";
		
		String andAonotherString = randomString + ' ' + anotherString;
		
		String byteString = Byte.toString(bigByte);
		String shortString = Short.toString(bigByte);
		String intString = Integer.toString(bigInt);
		String longString = Byte.toString(bigByte);
		String floatString = Byte.toString(bigByte);
		String booleanString = Byte.toString(bigByte);
		
		double aDoubleValue = 30000000000000000.144354354;
		int DoubleToInt = (int) aDoubleValue;
		
		int  stringToInt = Integer.parseInt(intString);
		
	//	paresShort, parseLong, ParseByte, ParseFloat, ParseDouble, parseBoolean

		System.out.println(andAonotherString);
		System.out.println(DoubleToInt);
		System.out.println(stringToInt);
		
		
		
	}
	
}