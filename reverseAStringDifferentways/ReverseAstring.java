package reverseAStringDifferentways;


public class ReverseAstring {
	public static void main(String[] args) {
		String str = "Qwerty",nstr="";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println(nstr);
			
		
		/*
		 * char[] charArr = str.toCharArray(); for (int i = charArr.length - 1; i >= 0;
		 * i--) System.out.print(charArr[i]);
		 */
	}
}