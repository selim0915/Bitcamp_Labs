//���� 300
//���� 3
//���߿� �ִ� �� 1000
//�Ž����� 100

import java.util.Scanner;
public class VendingMachine {

	public static void main(String[] args) {
		while (true) {
		int price, qt, money, change;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ������ �Է��ϼ���.");
		price = Integer.parseInt(sc.nextLine());
		System.out.println("������ ������ �Է��ϼ���.");
		qt = Integer.parseInt(sc.nextLine());
		System.out.println("���� ���� ���� �Է��ϼ���.");
		money = Integer.parseInt(sc.nextLine());
		
		change = money - price*qt;
		
		if (change >= 0) {	
	
			System.out.println("�ܵ��� " + change + "���Դϴ�.");
		} else {
			System.out.println("���� ���ڶ��ϴ�.");
			break;
		}
		}
		
	}

}
