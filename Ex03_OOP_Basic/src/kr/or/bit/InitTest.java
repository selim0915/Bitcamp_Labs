package kr.or.bit;

public class InitTest {
	public static int cv =1;//static����, class����(��������� �Ҽӵ� �ƴѰ�)
	public int iv=1; //������ʽ�ȭ( ���� �����ڰ� ����ߴ�. ������ )
	
	static { cv=2;}// static�ʱ�ȭ ��, class�ʱ�ȭ ��
	{ iv=2; } //instance�����ʱ�ȭ ��, ��ü�����ʱ�ȭ ��
	
	//������
	public InitTest() {
		//Ư¡ 
		//1.�Լ��̸��� Ŭ������ ����
		//2. Ŭ�����̸��� ()�߰�
		//3. �ν��Ͻ� �ʱ�ȭ�� ��ǥ
		iv =3;
	}
}
