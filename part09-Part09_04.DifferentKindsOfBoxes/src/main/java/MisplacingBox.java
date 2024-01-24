/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeanmac
 */
import java.util.ArrayList;

public class MisplacingBox extends Box {
	private ArrayList<Item> items;
	
	public MisplacingBox() {
		this.items = new ArrayList<>();
	}
	
    public void add(Item item) {
    	items.add(item);
    }

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
    	return false;
    }

}
