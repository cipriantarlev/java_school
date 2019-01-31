package homePractice;


public class SubStringExemple {

	public static void main(String[] args) {

		//getSmallestAndLargestFirst("welcometojava", 3);

	}

	public static String getSmallestAndLargestFirst(String s, int k) {
		String smallest = "";
		String largest = "";

		int a = s.length();

		java.util.List<String> myList = new java.util.ArrayList<>();

		for (int i = 0, j = k; i <= (a - k) & j <= a; i++, j++) {
			String intermediateString = s.substring(i, j);
			myList.add(intermediateString);
		}

		System.out.println(myList);
		myList.sort(java.util.Comparator.naturalOrder());
		System.out.println(myList);

		smallest = myList.get(a - 3);
		largest = myList.get(0);

		System.out.println(smallest + "\n" + largest);
		return smallest + "\n" + largest;
	}

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        int a = s.length();
        
        String[] myArray = new String[a];
        
        for (int i = 0, j = k; i <= (a - k) & j <= a; i++, j++) {
			String intermediateString = s.substring(i, j);
			int b = 0;
			myArray[0] = intermediateString;
			b++;
		}
        System.out.println(myArray);
        
        return smallest + "\n" + largest;
	}
}
