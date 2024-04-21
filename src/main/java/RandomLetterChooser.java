public class RandomLetterChooser extends RandomStringChooser
{
	private String[] letters;
	public RandomLetterChooser(String str)
	{ 
		letterArray = new String[str.length()];
		for(int i = 0; i < str.length(); i++){
			letters.add(str.substing(i, i + 1));
		}
	}
	
	
	public static String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = ""+str.charAt(i);
		}
		return letterArray;
	}
}
