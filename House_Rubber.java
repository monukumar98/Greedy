package Greedy;

import java.util.*;

public class House_Rubber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int excl = 0;
		int inl = arr[0];
		for (int i = 1; i < arr.length; i++) {
			int temp = inl;
			inl = Math.max(inl, excl + arr[i]);
			excl = temp;
		}
		
		System.out.println(inl);
		}
	}

}
