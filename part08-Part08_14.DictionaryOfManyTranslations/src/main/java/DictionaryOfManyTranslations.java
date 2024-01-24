import java.util.*;

public class DictionaryOfManyTranslations {
	private HashMap<String, ArrayList<String>> hmap;
	
	public DictionaryOfManyTranslations() {
		this.hmap = new HashMap<>();
	}
	
	public void add(String word, String translation) {
		this.hmap.putIfAbsent(word, new ArrayList<>());
		
		ArrayList<String> translations = this.hmap.get(word);
		translations.add(translation);
	}
	
	public ArrayList<String> translate(String word) {
		//if no translations, return empty list
		ArrayList<String> list = new ArrayList<>();
		if (!(this.hmap.containsKey(word))) {
			return list;
		} else {
			for (int i = 0; i < this.hmap.get(word).size(); i ++) {
				list.add(this.hmap.get(word).get(i));
			}
		}
		//returns a list of translations added for the word
		return list;
	}
	
	public void remove(String word) {
		if (this.hmap.containsKey(word)) {
			this.hmap.remove(word);
		}
	}
}