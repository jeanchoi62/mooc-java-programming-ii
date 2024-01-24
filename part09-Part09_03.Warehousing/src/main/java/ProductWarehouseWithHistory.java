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

public class ProductWarehouseWithHistory extends ProductWarehouse{
	private ChangeHistory list = new ChangeHistory();
	
	public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
		super(productName, capacity);
		addToWarehouse(initialBalance);
		
	}
	
	public String history() {
		return this.list + "";
	}
	
	public void addToWarehouse(double amount) {
		super.addToWarehouse(amount);
		this.list.add(getBalance());
	}
	
	@Override
	public double takeFromWarehouse(double amount) {
		this.list.add(super.getBalance()-amount);
		return super.takeFromWarehouse(amount);
		
	}
	
        public void printAnalysis() {
            System.out.println("Product: " + super.getName());
            System.out.println("History: " + history());
            System.out.println("Largest amount of product: " + this.list.maxValue());
            System.out.println("Smallest amount of product: " + this.list.minValue());
            System.out.println("Average: " + this.list.average());
        }

}
