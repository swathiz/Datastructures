package gs;

import java.util.Arrays;

public class SumFrac {
	
	public static void main(String[] args) {
		int[] f1 = {0,2};
		int[] f2 = {0,6};
		
		int[] result = addFractions(f1,f2);
		System.out.println(Arrays.toString(result));
		
	}
	
	public static int[] addFractions(int[] f1,int[] f2) {
		int p1 = f1[0];
		int q1 =f1[1];
		int p2 = f2[0];
		int q2 = f2[1];
		if(q1 == 0 || q2 ==0) {
			return null;
		}
		int d[] = {0,0}; 
		if(p1==0||p2==0) {
			return d;
		}
		int cd = q1*q2;
		int newp1 = p1*q2;
		int newp2 = p2*q1;
		
		int snumerator = newp1+newp2;
		
		int gcd = findGcd(snumerator,cd);
		
		int simpleNu = snumerator/gcd;
		int simpleDe = cd/gcd;
		
		int[] result = {simpleNu,simpleDe};
		return result;
		
	}
	
	public static int findGcd(int a,int b) {
		//a=8,b=12
		while(b!=0) { //b -4
			int temp = b; //temp =12,4
			b = a%b;//8%12 - 4,12%4 -0
			a = temp;//a=12,a=4
		}
		
		return a;
	}
}
