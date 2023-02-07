package org.howard.edu.hw2;

import java.util.HashMap;
import java.io.FileNotFoundException;
import java.util.*;
public class WordCounting {
	public static void main(String[] args) {
		FileReader fr = new FileReader();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		try {
			String wordstxt_file_string = fr.readToString("main/resources/words.txt");
			String[] separated_string = wordstxt_file_string.toLowerCase().split(" ");
			for(int x = 0; x < separated_string.length; x++) {
				if (separated_string[x].length() > 3) {
					if (map.get(separated_string[x]) == null) {
						map.put(separated_string[x], 1);
					}
					else {
						map.put(separated_string[x], map.get(separated_string[x]) + 1);
					}
				} 
				
			}
			for (String i : map.keySet()) {
				System.out.println(i + " " + map.get(i));
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("Unable to open resource");
		}
	}
}
