package com.fju;
import java.util.Random;
public class DiceRoller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random dice = new Random();
		int count1 =0;
		int count2 =0;
		int count3 =0;
		int count4 =0;
		int count5 =0;
		int count6 =0;
		for(int i=1;i<=100;i++){
			int num1=dice.nextInt(6)+1;
			int num2=dice.nextInt(6)+1;
			int num3=dice.nextInt(6)+1;
			for(int k=1;k<=6;k++){
				if(k==1){
					if(num1==k&num2!=k&num3!=k){
					count1++;
					}
					if(num1!=k&num2==k&num3!=k){
					count1++;
					}
					if(num1!=k&num2!=k&num3==k){
					count1++;
					}
				}
				if(k==2){
					if(num1==k&num2!=k&num3!=k){
					count2++;
					}
					if(num1!=k&num2==k&num3!=k){
					count2++;
					}
					if(num1!=k&num2!=k&num3==k){
					count2++;
					}
				}
				if(k==3){
					if(num1==k&num2!=k&num3!=k){
					count3++;
					}
					if(num1!=k&num2==k&num3!=k){
					count3++;
					}
					if(num1!=k&num2!=k&num3==k){
					count3++;
					}
				}
				if(k==4){
					if(num1==k&num2!=k&num3!=k){
					count4++;
					}
					if(num1!=k&num2==k&num3!=k){
					count4++;
					}
					if(num1!=k&num2!=k&num3==k){
					count4++;
					}
				}
				if(k==5){
					if(num1==k&num2!=k&num3!=k){
					count5++;
					}
					if(num1!=k&num2==k&num3!=k){
					count5++;
					}
					if(num1!=k&num2!=k&num3==k){
					count5++;
					}
				}
				if(k==6){
					if(num1==k&num2!=k&num3!=k){
					count6++;
					}
					if(num1!=k&num2==k&num3!=k){
					count6++;
					}
					if(num1!=k&num2!=k&num3==k){
					count6++;
					}
				}
			}
			for(int j=1;j<=3;j++){
				if(j==1){
					System.out.print(num1);
				}
				else if(j==2){
					System.out.print(num2);
				}
				else if(j==3){
					System.out.println(num3);
				}
			}
			if(num1==num2&num1!=num3){
				if (num1==1) {
					count1=count1+2;
				}
				else if(num1==2) {
					count2=count2+2;
				}
				else if(num1==3) {
					count3=count3+2;
				}
				else if(num1==4) {
					count4=count4+2;
				}
				else if(num1==5) {
					count5=count5+2;
				}
				else if(num1==6) {
					count6=count6+2;
				}
				break;
			}
			else if(num1==num3&num1!=num2){
				if (num1==1) {
					count1=count1+2;
				}
				else if(num1==2) {
					count2=count2+2;
				}
				else if(num1==3) {
					count3=count3+2;
				}
				else if(num1==4) {
					count4=count4+2;
				}
				else if(num1==5) {
					count5=count5+2;
				}
				else if(num1==6) {
					count6=count6+2;
				}
				break;
			}
			else if(num2==num3&num2!=num1){
				if (num1==1) {
					count1=count1+2;
				}
				else if(num2==2) {
					count2=count2+2;
				}
				else if(num2==3) {
					count3=count3+2;
				}
				else if(num2==4) {
					count4=count4+2;
				}
				else if(num2==5) {
					count5=count5+2;
				}
				else if(num2==6) {
					count6=count6+2;
				}
				break;
			}
		}	
	System.out.println("1一共出現"+ count1 +"次");
	System.out.println("2一共出現"+ count2 +"次");
	System.out.println("3一共出現"+ count3 +"次");
	System.out.println("4一共出現"+ count4 +"次");
	System.out.println("5一共出現"+ count5 +"次");
	System.out.println("6一共出現"+ count6 +"次");
	

	}
}
