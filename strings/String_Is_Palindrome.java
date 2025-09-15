package strings;

import java.util.Scanner;

/*public class String_Is_Palindrome {//with string methods
	public static void main(String[] args) {
		String str = "malayalam";
		String reversed = new StringBuilder(str).reverse().toString();
		if(str.equals(reversed)) {
			System.out.println("is Palindrome");
		}
		else System.out.println("not palindrome");
	}
}*/
public class String_Is_Palindrome {//with out built in methods methods
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 while(true) {
		 System.out.println("Enter the string");
		String str = scanner.next();
		String org  = str;
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(org.equals(rev)) {
			System.out.println("Palindrome");
		}
		else System.out.println("not palindrome");
	}
	}
}
