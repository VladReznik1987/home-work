package printString;

public class print {
	public static void main(String[] args) {
		String word = "TOMY";
		swap(word);
	}
	public static void swap(String word) {
		char[] str = word.toCharArray();
		for (int index = 0; index < str.length; index++) {
			for (int i = 0; i < str.length - 1; i++) {
				char swap = str[i];
				str[i] = str[i + 1];
				str[i + 1] = swap;
				System.out.println(str);
			}
		}
	}
}
