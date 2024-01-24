/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeanmac
 */
public class MyMyHash<K,V> {
	private MyArrayList<MyHash<K, V>>[] values;
	private int firstFreeIndex;
	
	public MyMyHash() {
		this.values = new MyArrayList[32];
		this.firstFreeIndex = 0;
	}

	public V get(K key) {
	    int hashValue = Math.abs(key.hashCode() % this.values.length);
	    if (this.values[hashValue] == null) {
	        return null;
	    }

	    MyArrayList<MyHash<K, V>> valuesAtIndex = this.values[hashValue];

	    for (int i = 0; i < valuesAtIndex.size(); i++) {
	        if (valuesAtIndex.value(i).getKey().equals(key)) {
	            return valuesAtIndex.value(i).getValue();
	        }
	    }

	    return null;
	}
	
	private MyArrayList<MyHash<K, V>> getListBasedOnKey(K key) {
	    int hashValue = Math.abs(key.hashCode() % values.length);
	    if (values[hashValue] == null) {
	        values[hashValue] = new MyArrayList<>();
	    }

	    return values[hashValue];
	}

	private int getIndexOfKey(MyArrayList<MyHash<K, V>> myList, K key) {
	    for (int i = 0; i < myList.size(); i++) {
	        if (myList.value(i).getKey().equals(key)) {
	            return i;
	        }
	    }

	    return -1;
	}

	
	private void grow() {
	    // create a new array
	    MyArrayList<MyHash<K, V>>[] newArray = new MyArrayList[this.values.length * 2];

	    for (int i = 0; i < this.values.length; i++) {
	        // copy the values of the old array into the new one
	        copy(newArray, i);
	    }

	    // replace the old array with the new
	    this.values = newArray;
	}
	
	private void copy(MyArrayList<MyHash<K, V>>[] newArray, int fromIdx) {
	    for (int i = 0; i < this.values[fromIdx].size(); i++) {
	        MyHash<K, V> value = this.values[fromIdx].value(i);

	        int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
	        if(newArray[hashValue] == null) {
	            newArray[hashValue] = new MyArrayList<>();
	        }

	        newArray[hashValue].add(value);
	    }
	}
	
	public void add(K key, V value) {
	    MyArrayList<MyHash<K, V>> valuesAtIndex = getListBasedOnKey(key);
	    int index = getIndexOfKey(valuesAtIndex, key);

	    if (index < 0) {
	        valuesAtIndex.add(new MyHash<>(key, value));
	        this.firstFreeIndex++;
	    } else {
	        valuesAtIndex.value(index).setValue(value);
	    }

	    if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
	        grow();
	    }
	}
	
	public V remove(K key) {
	    MyArrayList<MyHash<K, V>> valuesAtIndex = getListBasedOnKey(key);
	    if (valuesAtIndex.size() == 0) {
	        return null;
	    }

	    int index = getIndexOfKey(valuesAtIndex, key);
	    if (index < 0) {
	        return null;
	    }

	    MyHash<K, V> pair = valuesAtIndex.value(index);
	    //valuesAtIndex.remove(pair);
	    return pair.getValue();
	}

}