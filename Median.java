package gs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Median {
	
	public static void main(String[] args) {
		int[] num1 = {1,2};
		int[] num2 = {3,4};
		
	
		
		System.out.println(getMedian(num1,num2));
	}
	
	public static double getMedian(int[] num1,int[] num2) {
		if((num1==null && num2 == null)||(num1.length == 0 && num2.length==0)) {
			return 0;}
		int m = num1.length;
		int n = num2.length;
		int[] merged = new int[m+n];
		int i=0,j=0,k=0;	
		while(i<m && j<n) {
			if(num1[i]<num2[j]) {
				merged[k] = num1[i];
				k++;
				i++;
			}else {
				merged[k] = num2[j];
				k++;
				j++;
			}}
		while(i<m) {merged[k] = num1[i];
		i++;k++;}
		while(j<n) {merged[k] = num2[j]; 
		j++;k++;}
		double median;
		if(merged.length % 2 == 0) {
			int mi1 = merged.length/2-1;
			int mi2 = merged.length/2;
			median = (merged[mi1]+merged[mi2])/2.0;
			return median;
		}else {
			int mi2 = merged.length/2;
			median = merged[mi2];
			return median;
		}
	}

}
