import java.util.Scanner;

/*
 * ������ ��Ģ �����
 * �Է°� 3�� �ޱ� (nextLine())���� �ޱ� (����2, ��ȣ(opr))
 * ����: Integer.parseInt(), equals() Ȱ��
 * 
 * ���ȭ��
 * �Է°�:100
 * �Է°�: +(��ȣ)
 * �Է°�: 100
 * ������: 200
 * 
 * hint 
 * 1. if(){} else if(){}
 * 2. if(opr.equals("+")){}
 * 
 * String str = "+"
 * if(str.equals("+"){}
 */
public class Ex09_Operation_Quiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("��ȣ�� �Է��ϼ���");
		String opr = sc.nextLine();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int num2 = Integer.parseInt(sc.nextLine());
		
		int result  =0;
		if(opr.equals("+")) {
			result = num1+num2;
		} else if (opr.equals("-")) {
			result = num1-num2;
		} else if (opr.equals("*")) {
			result = num1*num2;
		} else if (opr.equals("/")) {
			result = num1/num2;
		} else {
			System.out.println("�ٸ� ��ȣ �Դϴ�.");
			return;
		}
		
		System.out.printf("�Է°�: %d \n "
				+ "��ȣ: %s \n "
				+ "�Է°�:%d \n"
				+ " ������: %d\n",num1, opr, num2, result);
	}
}
