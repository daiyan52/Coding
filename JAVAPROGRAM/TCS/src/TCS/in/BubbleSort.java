package TCS.in;

import java.util.Scanner;

public class BubbleSort {
	public static void bSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					arr[j]=arr[j]^arr[j+1];
					arr[j+1]=arr[j]^arr[j+1];
					arr[j]=arr[j]^arr[j+1];
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter Array Size_");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter arrray Element");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		bSort(arr);
	}
}
