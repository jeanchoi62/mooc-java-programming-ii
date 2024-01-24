import java.util.*;


public class IOU {
	private HashMap<String, Double> hashmap;
	
	public IOU() {
		this.hashmap = new HashMap<>();
	}
	
	public void setSum(String toWhom, double amount) {
		//if there is no duplicate key
		hashmap.put(toWhom, amount);
		//create new hashmap
	}
	
	public double howMuchDoIOweTo(String toWhom) {
		double output = 0;
		for (String key : hashmap.keySet()) {
			if(key.equals(toWhom)) {
				output = hashmap.get(key);
			} else {
				output = hashmap.getOrDefault(toWhom, 0.00);
			}
		}
		return output;
		
	}
	

}
