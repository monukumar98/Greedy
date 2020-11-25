package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Metting_Room {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start[] = new int[n];
		int end[] = new int[n];
		for (int i = 0; i < end.length; i++) {

			start[i] = sc.nextInt();
			end[i] = sc.nextInt();
		}
		Arrays.sort(start);
		Arrays.sort(end);
		int i = 0;
		int j = 0;
		int curr_room_booked = 0;
		int max_room = 0;
		for (; i < start.length && j < end.length;) {
			if (start[i] < end[j]) {
				curr_room_booked++;
				i++;
			} else {
				curr_room_booked--;
				j++;
			}
			max_room = Math.max(max_room, curr_room_booked);
		}
		System.out.println(max_room);
	}

}
