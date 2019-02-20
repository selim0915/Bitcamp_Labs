/*
 * ��ü������(OOP) 3�� Ư¡
 * 1. ��Ӽ�
 * 2. ������
 * 3. ĸ��ȭ(����ȭ)
 * 
 * [���]
 * : java > child extends Base (child�� Base�� Ȯ���Ų��)
 * : c# >  child : Base 
 * 1.Ư¡: ���߻���� �ȵ�(���⼺ ������ ����Ѱ����,,), ���� ����� ��Ģ
 * ��, �� ȯ���� ��� �ް� �ʹٸ�? => ������ ����� ����ؼ� ���� ����� �����Ѵ�.
 * )) ���߻���� �����ϴ� ������ �ڿ��� �ִ� => Interface
 * 
 * 2. �ǹ�: [���뼺] >> �ݺ����� �ڵ带 ������� �ʰڴ�. (�θ� ���� �ڵ带 �����ڵ��..)
 * ����: �ʱ� ������� �ð��� �δ㽺���� �� �ִ�.
 * 
 * ���뼺�� ����ؾ��� ��??? ����ܰ� >> ���(�ð�, ����и�, �߻�ȭ)
 * 
 * 
 * �޸𸮿� �ö󰡴� ������ ��� �ɱ�?? //�θ� ������ ������ �������� �ʴ�.
 */

class GrandFather{
	public int gmoney=5000;
	private int pmoney =50000;
	//private�� �Ǿ������� 2���� ���忡�� ���� �ȵȴ�.
	//2. �������� ���� �Ұ�
	//3.��Ӱ��� ���� �Ұ�
	public GrandFather() { //������
		System.out.println("�Ҿƹ��� ������");
	}
}
class Father extends GrandFather{
	public int fmoney=1000;
	public Father() {
		System.out.println("�ƹ���������");
	}
}
class Child extends Father{
	public int cmoney=100;
	public Child() {
		System.out.println("�ڽĻ�����");
	}
}

public class Ex01_Inherit {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.gmoney); //�Ҿƹ��� ���� ����
		System.out.println(c.fmoney); //�ƹ��� ���� ����
		System.out.println(c.cmoney); //������ ����
		//System.out.println(c.pmoney); //private�� ���� �Ұ�! ��ӵ� ���� ����
	}

}
