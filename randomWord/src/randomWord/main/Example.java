package randomWord.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Example {

	public static void main(String[] args) {
		String[] word = { "Cat", "Dog", "Turtlre", "Elephant", "Lion", "Tiger", "Human", "Batman", "Supermen" };
		ArrayList<String> list = new ArrayList<String>();
		list.add("Cat");
		list.add("Tom");
		list.add("Superman");
		list.add("Batman");
		list.add("Yana");
		list.add("Dima");
		list.add("Dog");
		list.add("Elephant");

		Random(list);
	}

	public static void Random(ArrayList<String> words) {

		System.out.println(words.size());
		while (words.size() > 0) {

			Random ran = new Random();
			int h = ran.nextInt(words.size());
			System.out.println(words.remove(h));
		}
	}
}
