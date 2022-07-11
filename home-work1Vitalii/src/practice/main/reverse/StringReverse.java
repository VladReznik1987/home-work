package practice.main.reverse;

public class StringReverse {

	public static void main(String[] args) {
		String str = "TwoBeerOrNotTwoBeerShakespeer", nString = "";
		char ch;
		System.out.println("Original: ");
		System.out.println("TwoBeerOrNotTwoBeerShakespeer");

		for (int i = 0; i < str.length(); i++) {
ch=str.charAt(i);
nString = ch+nString;
System.out.println(ch);
System.out.println(nString);
		}
		System.out.println("Reverse Word :  " + nString);
	}

}
