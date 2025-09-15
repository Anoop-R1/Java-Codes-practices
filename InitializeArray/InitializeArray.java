package InitializeArray;

import java.util.stream.IntStream;

public class InitializeArray {
	public static void main(String[] args) {
		int arr[] = IntStream.range(1, 6).toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print('\n');
		int arr1[]= IntStream.rangeClosed(1, 5).toArray();
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.print('\n');
		int arr2[]=IntStream.of(1,2,3,4,5).toArray();
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}