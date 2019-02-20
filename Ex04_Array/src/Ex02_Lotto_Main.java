
public class Ex02_Lotto_Main {

	public static void main(String[] args) {
		// *****************************************************************
		// 1~45������ ���� �� 6���� �迭�� ��´�.
		// �ߺ����� ���ü��� �ִ�.������ �ȵȴ�.
		// 6���� ���� ������ �����Ѵ�.
		// �迭�� ����Ѵ�.

		int[] arr = new int[6];// ũ�Ⱑ 6�� �迭 ����

		// 1~45������ ������ �迭�� ��ƶ�
		// int su = (int)(Math.random()*45)+1;

		for (int i = 0; i < 6; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;
			// �ߺ� ����
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					i--;
					break;
				}
			}
		}
		System.out.println();

		// 6���� ���� ���� ������ �����Ѵ�.
		for (int i = 0; i < 6; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
