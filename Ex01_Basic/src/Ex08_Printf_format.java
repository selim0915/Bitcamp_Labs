import java.util.Scanner;

public class Ex08_Printf_format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//java.lang package �Ʒ� �ִ� �ڿ� (import)���� ���� ���� ��밡��
		//default�� open�Ǿ� �־:)
		
		//C# : Console.WriteLine()
		//C# : Console.ReadLine()
		//java : System.out.println()
		
		System.out.println("A");
		System.out.print("B");
		System.out.print("C");
		System.out.println("D");
		System.out.println("E");
		
		int num=100;
		System.out.println(num);
		System.out.println("num: "+num);
		
		//����(format)
		System.out.printf("num���� %d �Դϴ�.\n",num);
		
		/*
		 *  %d (10���� ������ ����)
		 *  %f (�Ǽ�)
		 *  %s (���ڿ�)
		 *  %c (����)
		 *  Ư������ : \t ��, \n �ٹٲ�
		 */
		System.out.printf("num���� [%d] �Դϴ�. �׸��� [%d]�� �־��.", num, 1000);
		
		float f =3.14f;
		System.out.println(f);
		System.out.printf("f������ ���� : %1.5f �Դϴ�.\n", f);
		
		System.out.printf("���ڿ� ���� %s�� ����ϰ� %d ���� ���� ���\n","�ȳ缼��",101);
		
		//cmd(console)���� ����ڰ� �Է��� ���� read �ؿ���
		//java.util.Scanner sc = new java.util.Scanner(System.in);
		//�� �ڵ�ó�� Ŭ������ ����Ϸ��� ������ ������ƾ��Ѵ�. 
		//java.lang�� �ڵ� ���µǾ��ִ�.
		// �׿ܿ��� ���� ��ܿ� import�� �� ���ƾ��Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڰ��� �Է��ϼ���");
		String value = sc.nextLine(); //����� ���� read
		System.out.println("�Է°�: "+ value);
		
		//System.out.print("���ڰ��� �Է��ϼ���");
		//int number = sc.nextInt();
		//System.out.println("�Է°�: "+ number);
		
		//Ÿ�Ժ��� �д� �Լ��� ���� �����Ѵ�.
		//������ �ϴ� nextLine�� ���°ɷ�
		//�������: ���ڷ� read�ϰ� �ʿ�� ���ڷ� ��ȯ�Ѵ�.
		//sc.hasNextBoolean()
		//sc.hasNextByte(radix)
		//sc.hasNextFloat()
		
		//*���ڸ� ���ڷ� �ٲٴ� ���
		// Integer.parseInt(s)
		// ���ڸ� �Ǽ���
		// Float.parseFloat(s)
		// Double.parseDouble(s)
		
		System.out.print("���ڸ� �Է��ϼ���");
		int number =Integer.parseInt(sc.nextLine());
		System.out.println("���ڰ�: "+ number);
		
		// *���ڸ� ���ڷ� ��ȯ
		String data = String.valueOf(1000);
		System.out.println(data);
	}

}




