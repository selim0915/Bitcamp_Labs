import java.util.Scanner;

public class Ex09_Operation_Quiz {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first, second;
		String opr;
		
		System.out.print("> �Է°�: ");
		first = Integer.parseInt(sc.nextLine());
		System.out.print("> �Է°�(��ȣ): ");
		opr = sc.nextLine();
		System.out.print("> �Է°�: ");
		second = Integer.parseInt(sc.nextLine());
		
		int result = 0;
		if (opr.equals("+")) {
			result = first + second;
		} else if (opr.equals("-")) {
			result = first - second;
		} else if (opr.equals("*")) {
			result = first * second;
		} else if (opr.equals("/")) {
			result = first / second;
		} else {
			System.out.println("�ùٸ� �����ڸ� �Է����ּ���.(+, -, *, /)");
			//key point(���⼭�� main �Լ�)
			//return Ű���� : [�Լ�����]�� ������ > main �Լ� Ż�� > ����
			return;
		}
		
		System.out.println("> ������: " + result);
	}
}
