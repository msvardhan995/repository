package com.dxc.progs;

import java.util.Arrays;
import java.util.Scanner;

public class UnCuaght {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {22,34,36,93,98};
		System.out.println(Arrays.toString(arr));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the index:");
		int s=sc.nextInt();
		System.out.println("element in given index is:"+arr[s]);
		

	}

}
