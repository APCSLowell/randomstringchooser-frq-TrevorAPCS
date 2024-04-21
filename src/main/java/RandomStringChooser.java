import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> words;
	public RandomStringChooser(String[] strings){
		words = new ArrayList<String>();
		for(String s : strings){
			words.add(s);
		}
	}
	public String getNext(){
		if(words.size() == 0){
			return "NONE";
		}
		else{
			int temp = (int)(Math.random() * words.size());
			String chosenWord = words.remove(temp);
			return chosenWord;
		}
	}
}
