package practice.main.reverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class StringReverse {

	public static void main(String[] args) {
		String str = "TwoBeerOrNotTwoBeerShakespeer", nString = "";
		char ch;
		System.out.println("Original: ");
		System.out.println("TwoBeerOrNotTwoBeerShakespeer");

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			nString = ch + nString;

		}
		System.out.println("Reverse Word :  " + nString);

		reverseString("Not now");
		reverseString2("I love java");
	}

	public static void reverseString(String str1) {
		char[] tyy = str1.toCharArray();
		for (int i = tyy.length - 1; i >= 0; i--) {
			System.out.print(tyy[i]);
		}
		System.out.println();
	}

	public static void reverseString2(String str2) {
		char[] by = new char[str2.length()];
		int a = 0;
		for (int i = str2.length() - 1; i >= 0; i--) {
			by[a] = str2.charAt(i);
			System.out.print(by[a]);
			a++;
		}

	}

}