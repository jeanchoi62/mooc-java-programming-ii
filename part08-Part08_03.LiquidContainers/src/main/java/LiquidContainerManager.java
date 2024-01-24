
public class LiquidContainerManager {
	int containerOne = 0;
	int containerTwo = 0;
	
	public LiquidContainerManager() {
	}
	
	public void add(int amount) {
		if (containerOne + amount >= 100) {
			containerOne = 100;
		} else {
			containerOne += amount;
		}
	}
	
	public void move(int amount) {
		if (amount >= containerOne) {
			if (containerTwo + containerOne >= 100) {
				containerTwo = 100;
				containerOne = 0;
			} else {
			containerTwo = containerTwo + containerOne;
			containerOne = 0;
			}
		} else {
			if (containerTwo + amount >= 100) {
				containerTwo = 100;
				containerOne -= amount;
			} else {
			containerTwo += amount;
			containerOne -= amount;
			}
		}
	}
	
	public void remove(int amount) {
		if (containerTwo - amount <= 0) {
			containerTwo = 0;
		} else {
			containerTwo -= amount;
		}
	}
	
	public String toString() {
		return "First: " + containerOne + "/100 \nSecond: "
				+ containerTwo + "/100";
	}

}
