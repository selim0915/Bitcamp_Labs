package kr.or.bit;

//������ ���� (��������)
//�̱���: ��ü�� �ϳ��� ���� �����ϰڴ�.

//�ϳ��� ��ü�� �����ؼ�(�����ϰڴ�..)
// �� ������ ����ϸ� �ϳ��� ��ü�� ����ϰڴٴ� ������ �ʿ��ϴ�.

//static(��ü�� ���� �ڿ�)

//TODO : JDBC��ﶧ (DB�����ϸ鼭 ������ٴ�..)
public class Singleton {
	private static Singleton p; 
	//Singleton ����ϸ� method area������ �ö��ִ�.
	//�׷��� private�� ������ �Ұ��ϴ�.
	
	private Singleton() {} //�����ڸ� private�� ���ٴ�..! 
	//�����ڰ�() private���� new�� ������ �ʴ´�.
	//1. �����ڸ� ���� ������..!
	
	public static Singleton getInstance() {
		if(p==null) {
			p=new Singleton(); //������ ȣ���Ѱ�(private Ŭ���� ���ο��� �����ϴϱ�..)
		}
		return p;
	}
}
