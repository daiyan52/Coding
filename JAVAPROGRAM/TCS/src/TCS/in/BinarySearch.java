package TCS.in;

import java.util.Scanner;

public class BinarySearch {
	public static int bSearch(int arr[],int l,int r,int key) {
		if(r>=l) {
			int mid = (l+r)/2;
			if(arr[mid]==key)
				return mid;
			if(arr[mid]>key)
				return bSearch(arr,l,mid-1,key);
			return bSearch(arr,mid+1,r,key);
		}
		return -1;
		
	}
	public static void main(String[] args) {
		System.out.println("Enter the Array Size_");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter the Array Element_");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Enter key");
		int key = s.nextInt();
		int res = bSearch(arr,0,n-1,key);
		System.out.println(res);
	}
}
