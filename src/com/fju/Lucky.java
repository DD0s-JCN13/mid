package com.fju;
import java.util.Random;
import java.util.Scanner;
public class Lucky {
	public static void main(String[] args){
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("please enter a number:");
		String num =scan.nextLine();
		int code = Integer.parseInt(num);
		boolean yn =false;
		for(int i=1;i<=6;i++){
			int a = r.nextInt(10)+1;
			System.out.print(a + " ");
			if(i==6){
				System.out.println();
			}	
			if(a==code){
				yn=true;
			}
				
		}
		if(yn){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
	}

}
