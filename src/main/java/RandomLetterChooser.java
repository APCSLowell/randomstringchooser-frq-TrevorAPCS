public class RandomLetterChooser extends RandomStringChooser
{
	public RandomLetterChooser(String str)
	{
		super(getSingleLetters());
	}
	
	
	public static String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = str.substring(i, i+1);
		}
		return letterArray;
	}
}
