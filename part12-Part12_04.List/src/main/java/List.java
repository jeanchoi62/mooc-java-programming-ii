/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeanmac
 */

public class List <T>{
	private T[] list;
	private int firstFreeIndex;
	
	public List() {
		this.list = (T[]) new Object[10];
		this.firstFreeIndex = 0;
	}

	//add
	public void add(T t) {
		if (firstFreeIndex >= this.list.length) {
			grow();
			this.list[firstFreeIndex] = t;
			firstFreeIndex++;
		} else {
			this.list[firstFreeIndex] = t;
			firstFreeIndex++;
		}
		
	}
	
	
	//contains
	public boolean contains(T t) {
		
		for (int i=0; i < this.firstFreeIndex; i++) {
			if (this.list[i].equals(t)) {
				return true;
			}
		}
		return false;
	}
	
	//index at
	public int indexAt(T t) {
		if (contains(t)) {
			for (int i=0; i< this.list.length; i++) {
				if (this.list[i].equals(t)) {
					return i;
				}
			}
		} return -1;
	}
	
	
	
	
	//grow
	public void grow() {
		//copy and paste into 1.5 size array
		int newSize = this.list.length + this.list.length / 2;
	    T[] newList = (T[]) new Object[newSize];
	    for (int i = 0; i < this.list.length; i++) {
	        newList[i] = this.list[i];
	    }

	    this.list = newList;
	}
	
	
	//delete
	public void moveLeft(T t) {
		if (contains(t)) {
			// delete and move everything to the left
			int temp = indexAt(t);
			for (int i = temp; i < this.list.length; i++) {
				this.list[temp] = this.list[temp+1];
			}
			
		}
		
	}
	
	public T value(int i) {
		if (this.firstFreeIndex >= i) {
			return this.list[i];
		}
		return null;
	}
	
	public void delete(T t) {
		moveLeft(t);
		this.firstFreeIndex--;
	}
	

}

