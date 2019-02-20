package kr.or.bit;

import java.util.Random;
import java.util.Scanner;

// Lotto ���赵 �����
// ���� ����: Lotto lotto = new Lotto();
// lotto.SelectLottoNumber(); >>�޴�����
// 1 ���� �Է��ϸ� >> selectBasicNumber(); �Լ� ȣ��(�ǹ�ȣ ����)
// 2 ���� �Է��ϸ� >> ȭ�� ���
// 3 ���� �Է��ϸ� >> ���α׷� ����
public class Lotto {
	private Scanner scanner; // ��ǰ����
	private Random r; // ��ǰ���� //r.nextInt(45) //0~44 //+1 ���ָ� 0~45
	private int[] numbers; // ���¹�ȣ
	private int[] count;

	public Lotto() {
		// Ư���� ������ ������ �ִ� �Լ�: member field �ʱ�ȭ
		// ������ �Լ� constructor
		scanner = new Scanner(System.in); // �ʱ�ȭ�� �ǹ�: ���������� �ּҰ��� ���� ��
		r = new Random();
		numbers = new int[6]; // �ζ�
		count = new int[45];
	}

	// �޴� ���
	private void showMenu() {
		System.out.println("******�ζ�����******");
		System.out.println("1.�ζ���÷ �ϱ�");
		System.out.println("2.���α׷� ����");
	}

	// �Է¹��� �� �˻�
	private int MenuMethod(Scanner scanner) {
		showMenu();

		int menu = 0;
		do {
			menu = Integer.parseInt(scanner.nextLine());
			try {
				if (menu >= 1 && menu <= 2) {
					break;
				} else {
					throw new Exception("���� �����߻�");
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("catch��: 1,2 �޴��� �߸� �����߾��");
			}
		} while (true);

		return menu;
	}

	public void selectBasicNumber() {
		escape: while (true) {
			int menu = MenuMethod(scanner);
			switch (menu) {
			case 1:
				sortMethod(numbers);
				// selectBasicLottoSort(numbers);
				selectBasicLottoPrint(numbers); // ���
				break;
			case 2:
				System.out.println("switch: ���α׷� ����");
				break escape;
			// System.exit(0);
			default:
				System.out.println("1~4�߿� ���ڸ� �Է��ϼ���.");
			}
		}
	}

	// �� �ζ� ��ȣ�� �����ϰ� �ߺ����� �����ϴ� �Լ�
	public void selectBasicLottoNumber(Random r, int[] numbers) {
		for (int i = 0; i < 6; i++) {
			numbers[i] = r.nextInt(46); // 0~45
			// �ߺ� ����
			for (int j = 0; j < i; j++) {
				if (numbers[j] == numbers[i]) {
					i--;
					break;
				}
			}
		}
	}

	// �ζ� ���� ������� ����
	public void selectBasicLottoSort(int[] numbers) {
		for (int i = 0; i < 6; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}

	// �ζ� ���
	public void selectBasicLottoPrint(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}

	// ����(��� �Լ�) (6���� ���� ���ؼ� 6���� ���� ����� ������
	// 5���� ũ�ų� ���� 10���� �۰ų� ������ ��ȣ ����
	// (avg >= 5 && avg <= 10) ... �� ������ �ƴϸ� ������
	private boolean checkAverage(int[] numbers) {
		int sum = 0;
		int average = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		average = sum / numbers.length;
		return (average >= 5 && average <= 10); // ����� 5,6,7,8,9,10�̸� TRUE ����
	}

	// ������ �����ϴ� ��ȣ �̱�
	public void sortMethod(int[] numbers) {
//		for (int i = 0; i < 6; i++) {
//			numbers[i] = r.nextInt(45) + 1; // 0~45
//			if (i > 0) {
//				for (int j = i - 1; j < i; j++) {
//					if ((numbers[j] - numbers[i]) != -1) {
//						i--;
//						break;
//					} 
//					if(numbers[i] >= 42) {
//						numbers[i] = 1;
//					}
//				}
//			}
//		}

//		int temp = 1;
//		for (int i = 0; i < 1; i++) {
//			numbers[i] = (int) (Math.random() * 45) + 1;
//			for (int j = 1; j < numbers.length; j++) {
//				numbers[j] = numbers[j - 1] + 1;
//				if (45 < numbers[j - 1] + 1) {
//					numbers[j] = temp;
//					temp++;
//				}
//			}
//		}

		int temp = 1;
		for (int i = 0; i < 1; i++) {
			numbers[i] = (int) (Math.random() * 45) + 1;
			for (int j = 1; j < numbers.length; j++) {
				numbers[j] = numbers[j - 1] + 1;
				if (45 < numbers[j - 1] + 1) {
					numbers[j] = temp;
					temp++;
				}
			}
		}

	}
}
