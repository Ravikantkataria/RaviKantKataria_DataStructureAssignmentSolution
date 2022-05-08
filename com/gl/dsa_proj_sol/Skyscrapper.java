package com.gl.dsa_proj_sol;

import java.util.Scanner;
import java.util.Stack;

public class Skyscrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Total Number of Floor in the building : ");
		int nof = scan.nextInt();
		System.out.println("Total Number of Floor in the Building : "+nof);		
		
		Stack Building = new Stack();
		int nos;
		for(int i=0;i<nof;i++)
		{
			System.out.println("Enter the floor size given on Day "+(i+1));
			nos = scan.nextInt();
			Building.add(nos);
		}
		
		System.out.println("The size given as Daily"+Building);
		
		Stack Building_Sort = new Stack();
		
		int length = Building.size();
		
		System.out.println("Total length of Stack : "+ length);
		
		System.out.println("Peak : "+Building.peek());
		
		for(int j=0;j<length;j++)
		{
				System.out.println("The value at Top is : "+Building.elementAt(j));
				
		}
		
	}

}
