//package kr.or.bit;
//
//import java.util.Scanner;
//
//public class Display {
//
//	public static void main(String[] args) {
//		Coffee c = new Coffee();
//		c.displayCoffee();
//	}
//
//}
//
//// 
//class Coffee {
//	private Coffee[][] coffees;
//
//	public Coffee[] displayCoffee() {
//		System.out.println("������������������������������");
//		System.out.println("��  Ŀ ��  �� ��	  ��");
//		System.out.println("��=============��");
//		System.out.println("�� 1.�Ƹ޸�ī��	  ��");
//		System.out.println("��	          ��");
//		System.out.println("�� 2.īǪġ��	  ��");
//		System.out.println("��			  ��");
//		System.out.println("�� 3.ī���ī	  ��");
//		System.out.println("��-------------��");
//		System.out.println("�� 4. ��  ��	  ��");
//		System.out.println("������������������������������");
//
//		
//		int menu = 0;
//		do {
//			try {
//				Scanner sc = new Scanner(System.in);
//				System.out.println("�޴��� ������ �ּ���.");
//				menu = Integer.parseInt(sc.nextLine());
//				if (menu >= 1 && menu <= 4) {
//					break;
//				} else {
//					throw new Exception("�����߻�");
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//				System.out.println("�޴��� �߸� �����߾��");
//				System.out.println("1,2,3,4 �߿� �������ּ���");
//			}
//		} while (true);
//
//		
//		while(true) {
//			switch (menu-1) {
//			case 1: return coffees[menu] break;
//			case 2: coffees[menu] break;
//			case 3: coffees[menu] break; 
//			case 4: System.out.println("���α׷� ����"); break;
//			}
//			System.exit(0);
//		}
//	}
//	
//	
//	
//	
//	
//	
//	
//}