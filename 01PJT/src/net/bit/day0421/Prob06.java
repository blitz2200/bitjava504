package net.bit.day0421;

public class Prob06 
{
	public static void main(String[] args) 
	{
		int[] array = {3,24,1,55,17,43,5};
		for (int i=0;i<7 ; i++){
			for (int j=0;j<6; j++){
				int temp1 = array[j];
				int temp2 = array[j+1];
				
				if (array[j]>array[j+1]){
					array[j] = temp2;
					array[j+1] = temp1;
				}//if
			}//inner for
			
		}//outer for
		for (int i=0;i<7 ; i++){
		System.out.println(array[i]);
		}
		

	}//main
}//class
