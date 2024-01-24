/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.util.Scanner;
import java.io.*;
import java.util.List;
import java.util.*;
import java.util.HashMap;

public class SaveableDictionary {
    private HashMap<String, String> list = new HashMap<>();
    private String file;
    
    public SaveableDictionary() {
    }
    
    public SaveableDictionary(String file) {
        this.file = file;
    }
    
    
    
    public boolean save() {
    	try {
    	File file = new File(this.file);
    	
    	PrintWriter writer = new PrintWriter(file);
    	Iterator iter = this.list.entrySet().iterator();
    	
    	while (iter.hasNext()) {
    		Map.Entry mapElement = (Map.Entry)iter.next();
    		writer.println(mapElement.getKey() + ":" + mapElement.getValue());
    	}	
    	writer.close();
    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    }
    
    public boolean load() {
    	try {
    	File file = new File(this.file);
    	Scanner scanner = new Scanner(file);
    	
    	while (scanner.hasNextLine()) {
    		String line = scanner.nextLine();
    		String parts[] = line.split(":");
    		
    		this.list.put(parts[0], parts[1]);
    	}	
    	
    	} catch (Exception e) {
    		return false;
    	}
    	return true;
    }
    
    public void add(String words, String translation) {
        if (this.list.containsKey(words) || this.list.containsKey(translation)) {
            return;
        } 
        this.list.put(words, translation);
    }
    
    public String translate(String word) {
        if (this.list.containsValue(word)) {
        	for (String s: this.list.keySet()) {
        		if (this.list.get(s).equals(word)) {
        			return s;
        		}
        	}
        	
        } 
        return this.list.get(word);
        
    }
    
    public void delete(String word) {
    	if (this.list.containsKey(word)) {
    		this.list.remove(word);
    	}
    	else if (this.list.containsValue(word)) {
        	for (String s: this.list.keySet()) {
        		if (this.list.get(s).equals(word)) {
        			this.list.remove(s);
        			break;
        		}
        	}
        	
        } else {
        	return;
        }
        
    }
    
}
