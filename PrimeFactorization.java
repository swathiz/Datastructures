package prac;

import java.util.ArrayList;

public class PrimeFactorization {
	
	public static void main(String args[]) {
		
		System.out.println(find(12));
		
	}
	
private static ArrayList<Integer> find(int input) {
		
		ArrayList<Integer> output = new ArrayList<>();
		if(isPrime(input))
		{
			output.add(input);
			return output;
		}
		
			for(int n= 2;n<=input;n++)
			{
				if(isPrime(n)&&input%n==0)
				{
					input=input/n;
					System.out.println(n);
					output.add(n);
					
					
				}
				
			}
			if(input!=1)
			{
				output.add(input);
			}
			
		
		return output;
	}
	
	private static boolean isPrime(int num) {
		
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				return false;
			}
		
		}
		return true;
	}


}
