package homePractice;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if (s.trim().equals("")) {
			System.out.println("0");
		} else {
			
		
		String delims = "[\\W]+";
		String s2 = s.trim();
		String s3 = s2.replaceAll("_", "!");
		String[] myArray = s3.split(delims);

		
		
			System.out.println(myArray.length);

			for (String intermediataString : myArray) {
				System.out.println(intermediataString);
			}
		}
		scan.close();
	}

}
