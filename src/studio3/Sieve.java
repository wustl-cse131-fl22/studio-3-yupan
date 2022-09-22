package studio3;

import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Set the largest number");
		int	num = scan.nextInt();
		
		boolean [] arr= new boolean[num+2]; // start from 2, skip [0][1]
		
		for (int i = 2;i <= arr.length-1;i++ ) // length need to +1 to include the last value to the list
		{
			arr[i]= true;			
		}

		//2n
		for (int i = 3; i <= arr.length-1;i++)
		{
			if ( i%2==0)
			{
				arr[i]=false;
			}			
		}
		// 3n
		for (int i = 4; i <= arr.length-1;i++)
		{
			if ( i%3==0)
			{
				arr[i]=false;
			}			
		}
		
		// 5n
		for (int i = 6; i <= arr.length-1;i++)
		{
			if ( i%5==0)
			{
				arr[i]=false;
			}			
		}		
		// 7n
		for (int i = 6; i <= arr.length-1;i++)
		{
			if ( i%7==0)
			{
				arr[i]=false;
			}			
		}
		
		
	    for (int i=0; i <= arr.length-2;i++)
        {
	    	int value = i;
	    	
        	System.out.println(value+" "+arr[i]);
        }
		
		
		
	}

}
