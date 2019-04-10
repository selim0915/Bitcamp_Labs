/*
 * �Ȱ��� �ڵ带 �ݺ��ϱ⺸�� �ѹ��� ���°� �ϱ� ������ ����Ѵ�.
 * �迭�� ����Ͽ�, ����, ������ �Ҽ� ������ �ϴ� ����!
 * �ϳ��� ������ ���·� �ϳ��� �ٲ���Ҷ� ��ø�����ۿ� ����.
 * ��ü�� �ʱ�ȭ�� new�� ���� �޸𸮸� �Ҵ��ϴ°��� �ʱ�ȭ�̴�.
 */
class Car{
	int door;
	String color;
}

public class Ex06_Array {

	public static void main(String[] args) {
		// 2���� (�����)
		// int[][] =>�տ��� ��, �ڿ��� ��

		int[][] score = new int[3][2];
		System.out.println(score[0][0]);
		System.out.println(score[2][1]);

		score[0][0] = 100;
		score[0][1] = 200;
		score[1][0] = 300;
		score[1][1] = 400;
		score[2][0] = 500;
		score[2][1] = 600;

		System.out.println(score.length); // length�� ���� ���̸� �˷��ش�.
		System.out.println(score[0].length); // ���� ��ġ�� ����� ���� �˼� �ִ�.

		// �� �׷���? �׸��� �׷�����

		// ���ǰ���: �迭�̸�.length
		// ���ǰ���: �迭�̸�[���].length

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				// System.out.printf("score[%d][%d] = %d\n",i,j,score[i][j]);
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}

		// Today point
		// Array(����:����) > colletion����
		// ������ for��
		// c#: for(Type ������ in �迭) {��±���}
		// JAVA: for(Type ������ : �迭) {��±���}
		// javascript: for(Type ������ in �迭) {��±���}

		int[] arr3 = { 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

		// ������ for��
		for (int value : arr3) { // :�ڿ� ���� �� �������� �ڿ��� ���� ��
			System.out.println(value);
		}

		String[] strarr = { "A", "B", "c", "D", "ff" };
		for (String val : strarr) {
			System.out.println(val);
		}

		// ����
		// 1��
		int[][] score3 = new int[][] { { 11, 12 }, { 13, 14 }, { 15, 16 }, };

		for (int[] values : score3) { // :�ڿ� ���� �� �������� �ڿ��� ���� ��
			for (int val : values) {
				System.out.println(val);
			}
		}

		
		//��ü�迭
		Car[] cararr = new Car[2];
		cararr[0] = new Car();
		cararr[0].color = "red";
		cararr[0].door =4;
		
		cararr[1] = new Car();
		cararr[1].color = "green";
		cararr[1].door =2;
		
		//�Ϲ� for���� ����ؼ� �ڵ����� ����� ���� ������ ����ϼ���.
		for(int i=0; i<cararr.length; i++) {
			System.out.println(cararr[i].color+"/"+cararr[i].door);
		}
		
		for(Car val : cararr) {
			System.out.println(val.color+"/"+val.door);
		}
		
		
		
		
		
	}

}