package com.gl.dsa_proj_sol;
import java.lang.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class Skyscrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Total Number of Floor in the building : ");
		int nof = scan.nextInt();
		System.out.println("Total Number of Floor in the Building : "+nof);		
		
	//Enter the Floor Size and Read the value
		int day;
		Stack Day = new Stack();
		for(int i =0;i<nof;i++)
		{
			System.out.println("Enter the floor size given on Day" +(i+1));
			day=scan.nextInt();
			Day.push(day);
		}
		
		// Keep data into Stack for Sorting			
		Stack SortDay = new Stack();
		for (int d=0;d<nof;d++)
		{
			SortDay.push(Day.elementAt(d));
		}
		int size = SortDay.size();
		
		// Sort the Stack
		SortDay.sort(null);
		System.out.println("Sorted Day");
		System.out.println(SortDay);
		
		
		//System.out.println("Peek:"+SortDay.elementAt(2));
		
		
		// Printing the specific day
		System.out.println("****************************");
		System.out.println("The order of construction is as follows :");
		System.out.println("****************************");
		Stack stack = new Stack();
		int k,t,total_size;
		
		for(int j=0;j<size;j++)
		{
			 //System.out.println("Outer Lood for Day elements:"+Day.elementAt(j));
			 // If we got the value at the first place
		 	 if(Day.elementAt(j)==SortDay.peek())
			 {	 				
		 			
				//If we got the value at Last
				 if(j==size-1)
				 {
					 k=j+1;
					 //System.out.println("Peek Value:"+stack.peek());
					 System.out.println("Day"+k+":");
					 stack.push(Day.elementAt(j));
					 stack.sort(null);
					 while(!stack.empty())
					 { 
						 System.out.print((int)stack.pop() + ", ");
					 }
					 System.out.println("");
					 System.out.println("------------");
					 SortDay.pop();
					 continue;
				 }
				 else
					 // If we get the value in between.
				 {	 k=j+1;
				     stack.push(Day.elementAt(j));
				     stack.sort(null);
				     total_size = stack.size();
				     //System.out.println("Total Stack Size : "+total_size);
				     System.out.println("Day"+k+":");
				     for(int p=total_size-1;p>=0;p--) 
				     {
				    	if(stack.elementAt(p)==SortDay.peek())
				    	{
				    	  System.out.print(stack.elementAt(p) + ",");
				    	  stack.pop();
				    	  SortDay.pop();
				    	}
				    	else
				    		break;
				    	
				     }
				     //SortDay.pop();
				     System.out.println("");
				     System.out.println("-------------");
				     continue;
				 }
			 }
			 else
				stack.push(Day.elementAt(j));
		 	    t=j+1;
		 	    System.out.println("Day"+t+":");
		 	    System.out.println("--------------");
		 
		}
	
		
		
	}
}
		
	