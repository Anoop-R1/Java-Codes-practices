package strings;

/*public class Count_Vowels_And_Consonants {//with string methods
	public static void main(String[] args) {
		String str = "Javacommunity";
		str = str.toLowerCase();
		int vowels=0,consonents=0;
		for(char ch:str.toCharArray()) {
			if("aeiou".indexOf(ch) !=-1) {
				vowels++;
			}else if (ch >= 'a' && ch <= 'z'){
				consonents++;
			}
		}
		System.out.println(vowels);
		System.out.println(consonents);
	}
}*/
public class Count_Vowels_And_Consonants {
	public static void main(String[] args) {
		String str = "Javacommunity";
		str = str.toLowerCase();
		int vowels=0,consonents=0;
		for(int i=0;i<str.length()-1;i++) {
			char ch=str.charAt(i);
			if(ch =='a' ||ch =='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}else if (ch >= 'a' && ch <= 'z'){
				consonents++;
			}
		}
		System.out.println(vowels);
		System.out.println(consonents);
	}
}
