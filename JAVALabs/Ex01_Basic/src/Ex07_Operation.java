// ������, ���

public class Ex07_Operation {

	public static void main(String[] args) {
		int sum = 0;
		// ���Կ����� (+=, -=, *=, /=) ����������
		sum += 1; // sum = sum + 1;
		sum -= 1; // sum = sum - 1;
		System.out.println("sum: " + sum);

		// ������ ��������
		// ������ ���ؼ� A+, B-, F
		// 94���̶��
		// 90�� �̻��̸� A, 95�� �̻��̸� A+\

		int score = 84;
		String grade = ""; // ���ڿ� �ʱ�ȭ
		System.out.println("����� ������ : " + score);

		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else {
			grade = "F";
		}
		System.out.println("����� ������ : " + grade + "�Դϴ�.");

		// �Լ� �ȿ��� syso > Ctrl + Space
		System.out.println();
		// �ڵ� �鿩���� �� ���� �� Ctrl + Shift + F

		// �б⹮(switch)
		int data = 100;
		switch (data) {
		case 100:
			System.out.println("100�Դϴ�");
			break;
		case 200:
			System.out.println("200�Դϴ�");
			break;
		case 300:
			System.out.println("300�Դϴ�");
			break;
		default:
			System.out.println("default");
			break;
		}

		// break ������ ��� �ȴ�
		switch (data) {
		case 100:
			System.out.println("100�Դϴ� ^^");
		case 90:
			System.out.println("90�Դϴ� ^^");
		case 80:
			System.out.println("80�Դϴ� ^^");
		default:
			System.out.println("default^^");
		}

		int month = 5;
		String res = ""; // �� ���ڿ��� �ʱ�ȭ

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			res = "31";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			res = "30";
			break;
		case 2:
			res = "29";
			break;
		default:
			res = "���� �ƴմϴ�";
		}
		System.out.println(month + "���� " + res + "�ϱ����Դϴ�.");

		// ��������
		// https://docs.oracle.com/javase/8/docs/api/index.html
		// package(���� : �� ������ ����)
		// Package ���� �ȿ��� : interface, class�� ��� �ִ�.
		// ���� �迭�� �۾�
		// java.lang.Math (Math Ŭ����)
		// ���� ������� �θ� ������ �ڿ��� ������ ������ �ִ���
		// random : a pseudorandom double greater than or equal to 0.0 and less than 1.0
		// ���� �߻� : return double (0.0 <= value < 1.0) >> 0.9999999...
		// public static double random() =>
		// ��Ģ : Ŭ������ new�� ���ؼ��� ��� ����

		// class�� static �ڿ��� ������ �ִٸ� new ���̵� ��� ����
		// java.lang.Math m = new java.lang.Math();
		// m.random();
		
		// import java.lang.*; ��Ģ Java ���Ͽ� default ����
		System.out.println("Math.random() : " + Math.random());
		System.out.println("Math.random() * 10 : " + Math.random() * 10);
		System.out.println("(int)(Math.random() * 10) : " + (int)(Math.random() * 10));
		// 0 ~ 9 ����
		System.out.println("(int)(Math.random() * 10) + 1 : " + ((int)(Math.random() * 10) + 1));
		// 1 ~ 10 ����
		
		int jumsu = ((int)(Math.random() * 10) + 1) * 100;
		System.out.println(jumsu);
		
		/*
		Quiz
		������� �ϴ� �ý����� ��ǰ ��÷ �ý����Դϴ�
		��ǰ ��÷�� 1000������ ������
		��ǰ���� Tv, NoteBook, �����, �ѿ켼Ʈ, ����
		��ǰ ��÷�� 900 ������ ������
		��ǰ���� NoteBook, �����, �ѿ켼Ʈ, ����
		��ǰ ��÷�� 800 ������ ������
		��ǰ���� �����, �ѿ켼Ʈ, ����
		��ǰ ��÷�� 700 ������ ������
		��ǰ���� �ѿ켼Ʈ, ����
		��ǰ ��÷�� 600 ������ ������
		��ǰ���� ����
		�� �ܴ� 100~500 ������ ĩ��
		
		����ڰ� �ͼ� ��ǰ �ý��� ����ϰ� �Ǹ� �����ϰ� 100~1000������ ������ ���´�
		*/
		
		String prize = "";
		
		switch (jumsu) {
		case 1000:
			prize += "Tv, ";
		case 900:
			prize += "NoteBook, ";
		case 800:
			prize += "�����, ";
		case 700:
			prize += "�ѿ켼Ʈ, ";
		case 600:
			prize += "����";
			break;
		default:
			prize += "ĩ��";
		}
		
		System.out.println(jumsu);
		System.out.println(prize);
	}

}
