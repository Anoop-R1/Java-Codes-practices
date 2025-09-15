package reverseAStringDifferentways;

public class Stringbuilder {
	public static void main(String[] args) {
		String input = "springjava";
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		//StringBuffer sb=new StringBuffer(input);
		sb.reverse();
		System.out.println(sb);
	}
}