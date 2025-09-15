package strings;

/*public class Reverse_A_String {//with string methods
	public static void main(String[] args) {
		String str = "Javatechcommunity";
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(reversed);
	}
}*/
public class Reverse_A_String {//with out built in methods
	public static void main(String[] args) {
		String str = "Javatechcommunity";
		char[] ch = str.toCharArray();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
	}
}
