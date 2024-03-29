import java.util.*;

public class Program {
	
	public static void printKeys(HashMap<String,String> hashmap) {
		for (String key: hashmap.keySet()) {
			System.out.println(key);
		}
	}
	
	public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
		
		for (String key: hashmap.keySet()) {
			//if the key value equals the text
			if (key.contains(text)) {
				System.out.println(key);
			} 
		}
		
	}
	
	public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
		for (String key : hashmap.keySet()) {
			if (key.contains(text)) {
				System.out.println(hashmap.get(key));
			}
		}
		
	}
	

}