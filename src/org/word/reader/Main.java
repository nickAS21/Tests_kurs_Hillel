package org.word.reader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		final String ver = "01 from 18/10/2018";
		if (args.length == 2 
				&& args[0] != null && !args[0].isEmpty() 
				&& args[1] != null && !args[1].isEmpty()) {			
			try {
				String fileNameIn = args[0];
				String fileNameOut = args[1];				
				UniqueWordReader nextWord = new UniqueWordReader(fileNameIn);
				Set<String> allwordsIgnores = nextWord.readUniqueWords();			
				if (fileNameOut != null && !fileNameOut.isEmpty()) {
					FileOutputStream writer = new FileOutputStream(fileNameOut, true);
					for (String allwordsIgnore : allwordsIgnores) {
						allwordsIgnore += "\n";
						writer.write(allwordsIgnore.getBytes("UTF-8"));
						writer.flush();
					}
					writer.close();
					String info = "The program to find all distinct words from a text file - finished."+ "\n" +
							"All single words - see file: " + fileNameOut;
					System.out.println(info);
				}				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("JWordReader.jar <fileNameIn> <fileNameOut>");
		}
	}
}
