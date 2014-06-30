package net.bit.day0421;

import java.util.Scanner;

import net.bit.day0421.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Rectangle rec1 = new Rectangle();
		System.out.println("첫번째 직사각형의 색깔 : ");
		rec1.setColor(keyboard.next());
		
		System.out.println("첫번째 직사각형의 세로 : ");
		rec1.setWidth(keyboard.nextInt());
		
		System.out.println("첫번째 직사각형의 가로 : ");
		rec1.setLength(keyboard.nextInt());
		
		Rectangle rec2 = new Rectangle();
		System.out.println("두번째 직사각형의 색깔 : ");
		rec2.setColor(keyboard.next());
		
		System.out.println("두번째 직사각형의 세로 : ");
		rec2.setWidth(keyboard.nextInt());
		
		System.out.println("두번째 직사각형의 가로 : ");
		rec2.setLength(keyboard.nextInt());
		
		System.out.println(rec1.getColor()+"직사각형의 넓이는 " + rec1.area() + "이고 둘레는 " + rec1.perimiter() + "입니다.");
		
		System.out.println(rec2.getColor()+"직사각형의 넓이는 " + rec2.area() + "이고 둘레는 " + rec2.perimiter() + "입니다.");
		
		if (rec1.area()> rec2.area()){
			System.out.println("첫 번째 사각형이 두 번째 사각형보다 넓습니다");		
		}else{
			System.out.println("두 번째 사각형이 첫 번째 사각형보다 넓습니다");
		}
		
		if (rec1.perimiter()> rec2.perimiter()){
			System.out.println("첫 번째 사각형이 두 번째 사각형보다 둘레가 깁니다");		
		}else{
			System.out.println("두 번째 사각형이 첫 번째 사각형보다 둘레가 짧습니다");
		}
		
		
	}

}
