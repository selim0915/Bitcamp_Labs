/*
 * �������̵�
 * Today Point:[��Ӱ���]������ �������̵�override (����� ������ �������̵�� ����) : ��Ӱ��迡�� �޼ҵ带 ������ �ϴ� ��� 
 * -��Ӱ��迡�� �ڽ�Ŭ������ �θ�Ŭ������ �޼ҵ带 ������
 * 
 * ������? ��?
 * �Լ��� (�Ķ���Ϳ� ����)���´� ��ȭ���� ���븸 �ٲ�°�.. => ���°� �ٲ�� �����ε�..
 * 			: Ʋ�� ��ȭ�� �ƴ϶� ������ ��ȭ{�Լ��� ������ ������ �ٲ�� ��}
 * 
 * ������ �ϴ¹��?
 * ����) ��Ӱ��迡����!
 * 1. �θ��Լ��� �̸��� �����ؾ� �Ѵ�.
 * 2. �θ��Լ��� �Ķ���Ͱ� ���� �ؾ� �Ѵ�.
 * 3. �θ��Լ��� ���� Ÿ���� ���� �ؾ� �Ѵ�.
 * 4. �ᱹ���� {} ������ �ȿ� ���븸 �ٲ�� ��.
 * 
 */

class Point2{
	int x=4;
	int y=5;
	String getPosition() {
		return "x:"+this.x+" y: "+this.y;
	}
}

//������ ���� �ʿ������� �ΰ��� Point2�� ���� �����;���..!
class Point3D extends Point2{
	int z=6;

//	@Override
//	String getPosition() {
//		return super.getPosition(); //�ȿ� ���� �ٲٱ�
//	}
	//�� �ϳ��� �̸��� ���� �Լ��� ����� ���� �ʾ�..!
	//�θ� ������ �ִ� �Լ��� ���� => �������̵�
	//�����Ǹ� �����ϴ� ��� !! => override (������̼�)
	//Annotation (�߻�ȭ�� �ִ�): �ڹٿ��� �ڹ��ڵ常���� ���� �� �� ���� �ΰ����� ������ [�����Ϸ�], [���� ��]���� �˷��ִ� ���(���)
	
	//@Override
	@Override
	String getPosition() {
		return "x:"+this.x+" y: "+this.y+" z: "+this.z;
	}
	
}

public class Ex04_Inherit_override {

	public static void main(String[] args) {
		Point3D point = new Point3D();
		point.x=3;
		point.y=6;
		point.z=9;
		System.out.println(point.getPosition());
	}

}
