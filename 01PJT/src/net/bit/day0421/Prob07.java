package net.bit.day0421;

public class Prob07 {

	public static void main(String[] args) {
		
		int year = 2010;
		int month = 2;
		int maxDay = 0;
		boolean yoonYear = false;
		
		if (year%4 == 0){
			yoonYear = true;
			if (year%100 == 0){
				yoonYear = false;
				if(year%400 == 0){
					yoonYear=true;
				}
			}			
		}		
		if (yoonYear){
			maxDay = 29;
		}else{
			maxDay = 28;
		}
		
		System.out.println(year + "��"+ month + "���� ������"+ maxDay + "�Դϴ�");
	}

}
