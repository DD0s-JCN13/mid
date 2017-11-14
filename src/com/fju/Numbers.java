package com.fju;


import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.print("Please enter a number:");
		String type = t.nextLine();
		int num = Integer.parseInt(type);
		for (int i=1;i<=num;i++){
			System.out.print(i+ " ");
			if(i%5 ==4){
				System.out.print("#"+ " ");
			}
			if(i>=10){
				break;
			}
		}
	}
}