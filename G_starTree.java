package com.one.day;

import java.util.Scanner;

public class G_starTree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력한 값의 트리가 나옵니다: ");
		int row = sc.nextInt();

		for(int r=0; r< row; r++) {
			
			for(int w = 0; w < row - r; w++) {
				System.out.print(" "); }
		
			for(int x= 0; x < (2*r+1) ; x++) {

				System.out.print("*"); 
			}

			System.out.println();
		}

	}

}
