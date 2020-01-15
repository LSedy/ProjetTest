package com.crm.formation;

public class TableMultiTest {

	public static void main(String[] args) {
		{
			final int N_MAX = 4;
			final int F_MAX = 10;
			
			int n = 2;
			while (n <= N_MAX)
			{
				int fact = 1;
				System.out.print ("Table de ");
				System.out.print (n);
				System.out.print (" : ");
				
				while (fact <= F_MAX)
				{
					System.out.print (n * fact);
					System.out.print (" ");
					fact++;
				}
				System.out.println();
				n++;
				}
			}
		}
}