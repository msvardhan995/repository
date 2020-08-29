package com.dxc.progs;

import java.util.Scanner;

public class ThrowDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the account balance");
		int bal=input.nextInt();
		System.out.println("enter the product cost");
		int cost=input.nextInt();
		
		try {
			if(bal<cost)
			{
				ArithmeticException ae = new ArithmeticException("Low balance"+bal);
				throw ae;
			}
			bal=bal-cost;
			
			
			System.out.println("Balance of your account after you bought:"+bal);
			
		}
		catch(Exception ae) {
			ae.printStackTrace();
			System.out.println("Balance is:"+bal);
		}
		finally {
			System.out.println("Thankyou for visiting banking");
		}
		
	}

}
