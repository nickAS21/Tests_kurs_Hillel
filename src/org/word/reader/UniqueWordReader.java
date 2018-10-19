package org.word.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class UniqueWordReader {
	private Scanner scanner;
	private static final String [] CharsIgnore = {".", ",", "/", "-", ";", ":"};
	
	public UniqueWordReader (String fileName) throws FileNotFoundException{
		this.scanner = new Scanner(new FileInputStream(fileName), "UTF-8");
	}			
	
	public Set<String> readUniqueWords() throws IOException {
        Scanner scanner = this.scanner;
        HashSet<String> hashSetsUniqueWords = new HashSet<String>();
        while(scanner.hasNext()){
            String oneWord = scanner.next();
            hashSetsUniqueWords.add(wordWithoutCharsIgnore (oneWord));
        }
        scanner.close();
        return  hashSetsUniqueWords;
    }

	private String wordWithoutCharsIgnore (String wordWithIgnore) {	
		String wordWithoutIgnor = wordWithIgnore;
		for (String c : CharsIgnore) {
			wordWithoutIgnor = wordWithoutIgnor.replace(c, "");
		}
		wordWithoutIgnor = wordWithoutIgnor.toLowerCase();
		return wordWithoutIgnor;
	}
	


}
