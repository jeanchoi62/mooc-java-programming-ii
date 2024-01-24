import java.util.*;

public class StorageFacility {
	private HashMap<String, ArrayList<String>> hmap;
	
	public StorageFacility() {
		this.hmap = new HashMap<>();
	}
	
	public void add(String unit, String item) {
		this.hmap.putIfAbsent(unit, new ArrayList<>());
		
		ArrayList<String> list = this.hmap.get(unit);
		list.add(item);
	}
	
	public ArrayList<String> contents(String storageUnit) {
		ArrayList<String> list = new ArrayList<>();
		
		if (!(this.hmap.containsKey(storageUnit))) {
			return list;
		}
		
		else if (this.hmap.containsKey(storageUnit)) {
			for (int i = 0; i < this.hmap.get(storageUnit).size(); i++) {
				list.add(this.hmap.get(storageUnit).get(i));
			}
		}
		
		return list;
	}
	
	public void remove(String storageUnit, String item) {
		//removes given item from storage unit
		if (this.hmap.containsKey(storageUnit)) {
			//if the arraylist contains the value "item"
			for (int i = 0; i < this.hmap.get(storageUnit).size(); i++) {
				if (this.hmap.get(storageUnit).get(i).equals(item)) {
					//only removes one item (if there are duplicates, only remove one and the rest remains
					this.hmap.get(storageUnit).remove(i);
					//if the storage unit is empty after removal, remove storage unit
					if (this.hmap.get(storageUnit).size() == 0) {
						this.hmap.remove(storageUnit);
					}
					break;
				}
			}
		}
	}
	
	
	public ArrayList<String> storageUnits() {
		ArrayList<String> nonEmptyUnits = new ArrayList<>();
		for (String key : this.hmap.keySet()) {
			if (this.hmap.get(key).size() == 0) {
				continue;
			} else {
				nonEmptyUnits.add(key);
			}
		}
		
		return nonEmptyUnits;
	}

}