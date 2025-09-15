package Optional;

public class ForEach {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 6, 5 };
		int sum=0;
		for (int e : arr) {
		sum=sum+e;	
		}
		System.out.println(sum);
	}
}