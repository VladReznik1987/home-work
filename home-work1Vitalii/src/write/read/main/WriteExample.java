package write.read.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteExample {

	public static void main(String[] args) throws IOException {
		File myObj = new File("C:\\Users\\rezni\\Downloads\\words.txt");
		List<String> dictionaryList = createdictionary(myObj);
		System.out.println(createdictionary(myObj).size());
		List<String> newWordList = match(dictionaryList, "ap");
		for (String string : newWordList) {
			System.out.println(string);
		}
		String phraseString = ">";
		printDictionary(dictionaryList, phraseString);
	}

	public static List<String> createdictionary(File myObj) throws FileNotFoundException {
		Scanner myReader = new Scanner(myObj);
		List<String> word = new ArrayList<String>();
		try {

			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				word.add(data);
			}
		} finally {
			myReader.close();
		}
		return word;

	}

	public static List<String> match(List<String> dictionary, String word1) {
		List<String> newDictionary = new ArrayList<>();
		for (String string : dictionary) {
			if (string.startsWith(word1) && newDictionary.size() <= 11) {
				newDictionary.add(string);
			}
		}

		return newDictionary;

	}

	public static void printDictionary(List<String> dictionarList, String phraseString) {
		List<String> scanDictionary = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("write some String:");
		int intValue;
		boolean correctInput = false;
		while (!correctInput) {
			try {
				phraseString = scanner.nextLine();
				intValue = Integer.parseInt(phraseString);
				System.out.println("Can't use numbers");
				correctInput = true;
			} catch (NumberFormatException e) {
				System.out.println("there is a selection of words starting with your characters");
			}
			for (String string : dictionarList) {
				if (string.startsWith(phraseString) && scanDictionary.size() < 10) {
					scanDictionary.add(string);
					System.out.println(string);
				}
			}
			scanDictionary.clear();
		}
	}
}
