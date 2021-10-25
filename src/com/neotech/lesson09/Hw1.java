package com.neotech.lesson09;

public class Hw1 {

	public static void main(String[] args) {
		// Print numbers from 1 to 50 except those that are divisible by 3

		
		System.out.println();
		//USING WHILE LOOP
		
		
				int i = 1;
				while(i<=50)
				{
					
					if(i % 3 == 0)
					{
						//3,6,9,12
						i++;
						continue;
					}
					else
					{
						System.out.print(i + " ");
					}		
					i++;
				}
				
				System.out.println();
				//USING DO WHILE
				
				int j = 1; 
				
				do {
					
					if(j % 3 == 0)
					{
						j++;
						continue;
					}
					
					System.out.print(j + " ");
					j++;
					
				}while(j<=50);
				
				System.out.println();
				//USING FOR LOOP
				
				for (int k = 1; k <=50; k++)
				{
					if(k % 3 == 0)
					{
						continue;
					}
					System.out.print(k + " ");
				}
	
				System.out.println();
				//USING FOR LOOP WITHOUT "CONTINUE"
				for(int i1=1; i1<=50; i1++) {
					if(i1%3!=0) {
						System.out.print(i1+" ");
						
					}
				}
	
	}

}
