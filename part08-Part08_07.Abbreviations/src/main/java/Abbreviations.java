import java.util.*;

public class Abbreviations {
	private HashMap<String, String> hmap;
	
	public Abbreviations() {
		this.hmap = new HashMap<>();
		
	}
	
	public void addAbbreviation(String abbreviations, String explanation) {
		hmap.put(abbreviations, explanation);
	}
	
	public boolean hasAbbreviation(String abbreviation) {
		if (this.hmap.containsKey(abbreviation)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String findExplanationFor(String abbreviation) {
		if (this.hmap.containsKey(abbreviation)) {
			return this.hmap.get(abbreviation);
		} else {
			return null;
		}
	}

}