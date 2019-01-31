package homePractice;



public class JavaAnagrams {

	public static void main(String[] args) {
		
		isAnagram("Mama", "mama");
	}
	static boolean isAnagram(String a, String b) {
		 boolean ok = true;
	        
		 	String a1 = a.toLowerCase();
		 	String b1 = b.toLowerCase();
		 
	        char [] myArrayA = a1.toCharArray();
	        char [] myArrayB = b1.toCharArray();
	        
	        java.util.Arrays.sort(myArrayA);
	        java.util.Arrays.sort(myArrayB);
	        
	       System.out.println(java.util.Arrays.toString(myArrayA));
	       System.out.println(java.util.Arrays.toString(myArrayB));
	        
	        String str1 = String.valueOf(myArrayA);
	        String str2 = String.valueOf(myArrayB);
	        System.out.println(str1);
	        System.out.println(str2);
	        
	        if (str1.equals(str2)) {
	        	System.out.println("Anagram");
	           return ok;
	        }else {
	        	System.out.println("NOt Anagram");
	           return false;
	        }
	}
}
