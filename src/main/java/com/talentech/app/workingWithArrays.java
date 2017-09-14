package com.talentech.app;

public class workingWithArrays {
	
	public void reverseArray() {
		
		int myArray[] = {2,5,3,8,6,9};
		int aLen=myArray.length;  //to find the length of the array
		
		System.out.println("Before Swapping:2,5,3,8,6,9 ");
		for(int j=0; j<aLen/2; j++) {
			
			int temp=myArray[j];
			myArray[j]=myArray[aLen-1-j];
			myArray[aLen-1-j]=temp;
		}// end of for loop
		
		System.out.print("After Swapping: ");
		for (int c=0;c<aLen;c++) {
			System.out.print(myArray[c]+" ");
		}
		
		
	}

}
