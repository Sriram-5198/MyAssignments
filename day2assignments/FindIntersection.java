package week1.day2assignments;

import java.util.Iterator;

public class FindIntersection {

	public static void main(String[] args) {
		
//		 * Pseudo Code
//		 * a) Declare An array for {3,2,11,4,6,7};	 
//		 * b) Declare another array for {1,2,8,4,9,7};
//		 * c) Declare for loop iterator from 0 to array length
//		 * d) Declare a nested for another array from 0 to array length
//		 * e) Compare Both the arrays using a condition statement 
//		 *  f) Print the first array (shoud match item in both arrays)
		
		int firstArr[]={3,2,11,4,6,7};
		int secondArr[]={1,2,8,4,9,7};
		
		int len=firstArr.length;
		int len1 = secondArr.length;
		
		boolean flag=false;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len1; j++) {
				
				if (firstArr[i]==secondArr[j]) {
					System.out.println("Intersection Num: " + firstArr[i]);
					flag=true;
				}
				
			}
			
		}
         if(flag==false) {
        	 System.out.println("No intersection");
         }
	}

}
