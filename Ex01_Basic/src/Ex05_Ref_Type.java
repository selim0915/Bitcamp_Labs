//Ŭ������ ���赵�̴�. 
//Ŭ������ Ÿ�Դϴ�.
//Ŭ����= ���赵= Ÿ��
//Ŭ������ �ݵ�� �޸𸮿� �÷��� ��밡���ϴ�.
//(���赵�� ������� ���� ����Ʈ�� ���°�)
//new�� ���ؼ� ���赵�� ������� ��üȭ�� �깰�� �����.

//���赵(�Ӽ�+���)�� �������Ѵ�.
class Apt2{
	int door; // ��ü���� (instance variable) : �ʱ�ȭ
	int window;
}

public class Ex05_Ref_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =100;
		//Apt2�� ���������Ÿ���̵ȴ�. (�������� Ÿ���� ������ִ� ����)
		Apt2 lg = new Apt2(); //lg������ Apt2��ü�� �ּҰ��� ���´�.
		// lg : ��������: �ּҰ��� ��������(��ü����)
		System.out.println("lg�������� �ּ�: "+lg);
		Apt2 ssapt = lg; //lg�� ������ �ּ� ssapt�� ��
		System.out.println("ss�������� �ּ�: "+ssapt);
		//���������� �Ҵ��� �ּҰ� �Ҵ�
		
		ssapt.window = 50;
		System.out.println("â���� ����" + ssapt.window + "," + lg.window);
		
		lg.door =10;
		System.out.println("â���� ����" + ssapt.door + "," + lg.door);
	}

}
