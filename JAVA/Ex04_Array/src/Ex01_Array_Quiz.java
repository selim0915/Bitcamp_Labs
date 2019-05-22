
public class Ex01_Array_Quiz {

	public static void main(String[] args) {
		// ���а� �л����� �⸻��� ��������
		// ����� ����ؼ� max�� �ִ밪,min�� �ּҰ��� ����Ͻÿ�.
		int[] score = new int[] { 79, 88, 97, 54, 56, 95 };

		int max = score[0];
		int min = score[0];

		for (int i = 0; i < score.length; i++) {
			max = (max < score[i]) ? max = score[i] : max;
			min = (min > score[i]) ? min = score[i] : min;
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);

		// 10���� ���� 1~10���� �ʱ�ȭ
		int[] number = new int[10];

		for (int i = 0; i < number.length; i++) {
			number[i] += i;
			System.out.println("number[" + i + "] : " + number[i]);
		}

		// ��� �л��� �⸻��� ���������Դϴ�. (5����)
		// ���� ��
		// ������ ��
		// ������ ���
		int sum = 0;
		float average = 0f;
		int[] jumsu = { 100, 55, 90, 60, 78 };

		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
			if (i == jumsu.length - 1) {
				average += sum / (float) jumsu.length;
			}
		}

		System.out.println("�� ���� ��: " + jumsu.length);
		System.out.println("������ ��: " + sum);
		System.out.println("������ ���: " + average);

		// ��������
		// 1~45������ ���� �� 6���� �迭�� ��´�.
		// �ߺ����� ���ü��� �ִ�.������ �ȵȴ�.
		// 6���� ���� ������ �����Ѵ�.
		// �迭�� ����Ѵ�.
		int[] lotto = new int[6];
		// ��ȣ ���� (�ߺ��� ����)
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1; // ���� ����
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--; // point
					break;
				}
			}
		}
		// �����ϱ�
		for (int i = 0; i < lotto.length; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		// ����ϱ�
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}

	}

}
