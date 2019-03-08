import java.util.Scanner;

public class Ex08_Printf_format {

	public static void main(String[] args) {
		// java.lang package �Ʒ� �ִ� �ڿ��� import ���� ���� ���̵� ��� �����ϴ�.
		// default�� open���ѳ��ұ� ����
		// C# : Console.WriteLine()
		// C# : Console.ReadLine()
		// Java : System.out.println();
		System.out.println("A"); // �ٹٲ�
		System.out.print("B");
		System.out.print("C");
		System.out.println("D");
		System.out.println("S");
		
		int num = 100;
		System.out.println(num);
		System.out.println("num ���� : " + num + "�Դϴ�");
		
		// ����(format) ���� (���)
		// %d(10���� ������ ����)
		// %f(�Ǽ���)
		// %s(���ڿ�)
		// %c(����)
		// Ư������: \t (Tab), \n (Newline)
		System.out.printf("num ���� : %d�Դϴ�\n", num);
		System.out.printf("num�� ���� [%d]�Դϴ�. �׸��� [%d]�� �־��.\n", num, 1000);
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f ���� ���� : %f�Դϴ�\n", f);
		
		System.out.printf("���ڿ� ���� %s�� ����ϰ� %d ���� ���� ���\n", "�ȳ�", 100);
		
		// cmd(console)���� ����ڰ� �Է��� ���� read�� �� �ִ�.
		// java.util.Scanner sc = new java.util.Scanner(System.in);
		// �� �ڵ�ó�� Ŭ������ ����Ϸ��� ����(package)�� ������ƾ� �Ѵ�.
		// ���� ������ ��ܿ� import java.util;
		Scanner sc = new Scanner(System.in); // �Է°��� ���� �� �ִ�.
		System.out.println("���� �Է��ϼ���");
		String value = sc.nextLine(); // ����ڰ� �Է��� ���� read
		System.out.println("�Է°�: " + value);
		
//		System.out.println("���ڰ��� �Է��ϼ���");
//		int number = sc.nextInt(); // ���ڰ����� �о���δ�.
//		System.out.println("number : " + number);

		// sc.nextFloat() Type ���� read�ϴ� �Լ��� �����Ѵ�.
		// ������ �ϴ� nextLine()�� ����ϰڴ�.
		// ������� : �׳� ���ڷ� �о�鿩�� �ʿ��ϴٸ� ��ȯ�ؼ� ����Ѵ�.
		
		////////////////////////////////////////////////
		// Today's Point
		// [[[���ڸ� ���ڷ�]]]
		// Integer.parseInt(s) ���ڸ� ������
		// Float.parseFloat(s) ���ڸ� float Ÿ���� �Ǽ���
		// Double.parseDouble(s) ���ڸ� double Ÿ���� �Ǽ���
		////////////////////////////////////////////////
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int number = Integer.parseInt(sc.nextLine());
		number += 100;
		System.out.println("���� : " + number);
		
		// ���ڸ� ���ڷ� (���� ����)
		String data = String.valueOf(1000);
		data += 100;
		System.out.println(data);
	}
}

