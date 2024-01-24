/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeanmac
 */
import java.util.*;

public class ChangeHistory {
	private ArrayList<Double> list;
	
	public ChangeHistory() {
		this.list = new ArrayList<>();
		
	}
	
	public void add(double status) {
		this.list.add(status);
	}
	
	public void clear() {
		this.list.clear();
	}
	
	public double maxValue() {
		double max = 0;
		if (this.list.size() == 0) {
			return max;
		}
		
		for (Double o: this.list) {
			if (o > max) {
				max = o;
			}
		}
		
		return max;
	}
	
	public double minValue() {
		if (this.list.size() == 0) {
			return 0;
		}
		
		double min = this.list.get(0);
		for (Double o: this.list) {
			if (o < min) {
				min = o;
			}
		}
		
		return min;
		
	}
	
	public double average() {
		if (this.list.size() == 0) {
			return 0;
		}
		
		double total = 0;
		for (Double o: this.list) {
			total += o;
		}
		
		return total/this.list.size();
		
	}
	
	@Override
	public String toString() {
		String output = " ";
		for (Double o: this.list) {
			output += o + ", ";
		}
		
		//return output;
                return "" + this.list;
	}
}
