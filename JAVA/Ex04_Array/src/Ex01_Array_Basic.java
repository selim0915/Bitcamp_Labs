import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * �迭�� ��ü�̴� (heap)�޸𸮿� ����
 * new��� �����ڸ� ���� ���������.
 */
public class Ex01_Array_Basic {

	public static void main(String[] args) {
		
		int[] score = new int[3];
		System.out.println("score���� (����): " +score[0]);
		System.out.println("score���� (����): " +score[2]);
		
		score[1] =333;
		//Array ������ ���� ������ �ִ�.
		//�� ���� ũ��� 4byte�̴�. (int=4byte)
		//������ �濡 ���� ������ ÷�ڷ� �Ѵ�: ÷�� or �ε���
		//�迭�� ���� ���� 0���� �����Ѵ�.
		//score[0], score[1], score[2]
		//�迭�� ����=length: 3��
		//�迭�� ������ ÷�ڰ���: length-1
		//�迭�� Ÿ���� default���� ������. ���� Ÿ���� ������0, �Ǽ��� 0.0, ���ڸ�null �׷���
		
		// *�迭���� ����
		//score[3] =500; //java.lang.ArrayIndexOutOfBoundsException: 3
		//���̰� ���� �ʽ��ϴ�.
		
		// ����ó���� ���ϸ�?
		// ���ܻ�Ȳ �߻�> ���α׷� ��������
		// �׷��� try, catch�� ������ ��ƾ� �Ѵ�.
		
		// array�� �� �´� �����?
		// for
		for(int i=0; i<score.length; i++) {
			System.out.printf("score[%d]=%d\t", i,score[i]);
		}
		
		System.out.println();
		
		//�迭�� ����ϴ� ���� ��� �� �����ִ� ���� Ŭ�������� �ִ�.(helperŬ����)
		String result = Arrays.toString(score); //[0, 333, 0]�̷��� �������ش�.
		System.out.println(result);
		
		score[0] =666;
		result = Arrays.toString(score);
		System.out.println(result);
		
		//����
		Arrays.sort(score); //������ ����
		result = Arrays.toString(score);
		System.out.println(result);
		
		
		
		// *�迭�� ����� ���
		int[] arr = new int[5]; //�⺻
		int[] arr2 = new int[] {100,200,300,400,500}; //��(�ʱⰪ)�� �����Ͽ� �����ϴ� ��
		int[] arr3 = {11,12,13,14,15}; //�����Ϸ��� ���������� new�� ���ش�.
		//javascript: var�� ����. Ÿ���� ����. (variable)
				// var cars = ["a","b","c"]
		
		for(int i=0; i<arr3.length; i++) {
			System.out.printf("arr3[%d]=%d\n",i, arr3[i]);
		}
		
		//Car c;
		//c=new Car();
		
		int[] arr4;//�迭���� �̷��� �ϸ� ���� null�� ���´�. (�����϶�)
		//System.out.println(arr4); //���������� �ʱ�ȭ ���� ������ ����Ҽ� ����.
		// **arr4 = {11,22,33}; //������ ���� �Ҵ��Ҷ��� ���� �ʴ´�. �ݵ�� new�� ����Ѵ�.
		arr4 = new int[] {21,22,23,24,25};
		
		int[] arr5 = arr4; //�ּҰ� �Ҵ� //arr5�� arr4��ü
		System.out.println(arr4== arr5);
		
		//�迭�� 8���� Ÿ������ �� ���� �� �ִ�.
		char[] ch = new char[10];

		for(int i=0; i<ch.length; i++) {
			System.out.printf("ch[%c]=%c\n",i, ch[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		int[] ar = new int[3]; //ũ�⸸ ���
		int[] ar2 = new int[] {1,2,3}; //�ʱ�ȭ����
		int[] ar3 = {1,2,3}; //�����Ϸ����� �����ϴ� �迭
	}

}
