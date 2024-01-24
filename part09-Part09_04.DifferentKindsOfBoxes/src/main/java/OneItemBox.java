import java.util.ArrayList;

public class OneItemBox extends Box{ 
	private Item oneItem;
	
	public OneItemBox() {
		//has capacity of exactly one item which cannot be switched
		this.oneItem = null;
	}
	
    public void add(Item item) {
    	if (this.oneItem == null) {
    		this.oneItem = item;
    	}
    }

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            if (this.oneItem == null) {
            	this.oneItem = item;
            	break;
            }
        }
    }

    public boolean isInBox(Item item) {
    	if (this.oneItem == null) {
    		return false;
    	}
    	if (this.oneItem.equals(item)) {
    		return true;
    	} 
    		return false;
    	
    }

 
}
