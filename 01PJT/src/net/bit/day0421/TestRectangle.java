package net.bit.day0421;

import java.util.Scanner;

import net.bit.day0421.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Rectangle rec1 = new Rectangle();
		System.out.println("ù��° ���簢���� ���� : ");
		rec1.setColor(keyboard.next());
		
		System.out.println("ù��° ���簢���� ���� : ");
		rec1.setWidth(keyboard.nextInt());
		
		System.out.println("ù��° ���簢���� ���� : ");
		rec1.setLength(keyboard.nextInt());
		
		Rectangle rec2 = new Rectangle();
		System.out.println("�ι�° ���簢���� ���� : ");
		rec2.setColor(keyboard.next());
		
		System.out.println("�ι�° ���簢���� ���� : ");
		rec2.setWidth(keyboard.nextInt());
		
		System.out.println("�ι�° ���簢���� ���� : ");
		rec2.setLength(keyboard.nextInt());
		
		System.out.println(rec1.getColor()+"���簢���� ���̴� " + rec1.area() + "�̰� �ѷ��� " + rec1.perimiter() + "�Դϴ�.");
		
		System.out.println(rec2.getColor()+"���簢���� ���̴� " + rec2.area() + "�̰� �ѷ��� " + rec2.perimiter() + "�Դϴ�.");
		
		if (rec1.area()> rec2.area()){
			System.out.println("ù ��° �簢���� �� ��° �簢������ �н��ϴ�");		
		}else{
			System.out.println("�� ��° �簢���� ù ��° �簢������ �н��ϴ�");
		}
		
		if (rec1.perimiter()> rec2.perimiter()){
			System.out.println("ù ��° �簢���� �� ��° �簢������ �ѷ��� ��ϴ�");		
		}else{
			System.out.println("�� ��° �簢���� ù ��° �簢������ �ѷ��� ª���ϴ�");
		}
		
		
	}

}
