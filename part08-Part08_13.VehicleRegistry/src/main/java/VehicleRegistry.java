import java.util.*;

public class VehicleRegistry {
	private HashMap<LicensePlate, String> hmap;
	
	public VehicleRegistry() {
		this.hmap = new HashMap<>();
		
	}
	
	public boolean add(LicensePlate licensePlate, String owner) {
		boolean output = false;
		//if license plate doesn't have owner, add owner to license plate and return true
		if (!(this.hmap.containsKey(licensePlate))) {
			hmap.put(licensePlate, owner);
			output = true; 
		}
		//else if license already has owner attached method returns false and does nothing
		else if (this.hmap.containsKey(licensePlate)) {
			output = false;
		}
		
		return output;
	}
	
	public String get(LicensePlate licensePlate) {
		String output = "";
		
		//if car isn't in the registry method returns null
		if(!(this.hmap.containsKey(licensePlate))) {
			output = null;
		}
		//returns owner of the car corresponding to the license plate
		else if (this.hmap.containsKey(licensePlate)) {
			output = this.hmap.get(licensePlate);
		}
		return output;
	}
	
	public boolean remove(LicensePlate licensePlate) {
		boolean output = false;
		//returns false is license plate was not in registry
		if (!(this.hmap.containsKey(licensePlate))) {
			output = false; 
		}
		//else removes license plate and attached data fromregistry
		else if (this.hmap.containsKey(licensePlate)) {
			this.hmap.remove(licensePlate);
			output = true;
		}
		
		return output;
		
	}
        
        public void printLicensePlates() {
		for (LicensePlate key: hmap.keySet()) {
			System.out.println(key);
		}
	}
	
	public void printOwners() {
		ArrayList<String> owners = new ArrayList<>();
		//only repeat each owner once
		
		for (LicensePlate key: hmap.keySet()) {
			if (owners.contains(hmap.get(key))) {
				continue;
			} else {
				owners.add(hmap.get(key));
			}
		}
		
		for (int i = 0; i < owners.size(); i++) {
			System.out.println(owners.get(i));
		}
	}

}