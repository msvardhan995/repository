package com.dxc.progs;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the account balance");
		int bal=input.nextInt();
		System.out.println("enter the product cost");
		int cost=input.nextInt();
		
		int bonus=input.nextInt();
		System.out.println("bonus you get if you  buy Rs > 500 product:"+bonus);
		try {
			if(bal<cost)
			{
				ArithmeticException ae = new ArithmeticException("Low balance"+bal);
				throw ae;
			}
			bal=bal-cost;
			if(cost>500) {
				bal=bonus+bal;
			}
			
			System.out.println("Balance of your account after you bought:"+bal);
			
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		finally {
			System.out.println("Thankyou for visiting banking");
		}
		
	}

}
