/*
 * ���Ǽ��迡��.. ���赵 �� �������̴�..  
 * ���� ���赵���� �������� ������ �ִ�..!
 * 
 * -�������� ���赵 �ۼ� ��..
 * ������ ���赵�� ������ �־�� �Ѵ�. ���ü� ������?
 * ������:
 * 1. ��Ӱ��� (is ~a) ������ �����̴�. ��� Ǯ���� ����̴�. (�θ� ����) ex:���� �����̴�ooo
 * 2. ���԰���(has ~a) ������ ������ ������ �ִ�. ��� Ǯ���� �����̴�. ��Ӿƴ�xx ex:���� ������ ������ �ִ�.xxx
 * class A{
 *  B b;
 * }
 * 
 * ------------------
 * 
 * �� Ʋ����, ���� Ŭ����
 * >>��� �����Դϴ�. (�������� �� extends ����)
 * ���� ���̴�.(is a)
 * ���� ����(x,y)�� ������ �ִ°�.
 * ���� ���� ������ �ִ�.(has a)
 * class��{
 *           �� ������;
 * }
 * 
 * ����, ��
 * ������ �� �̴�(is a)xxx
 * ������ ���� ������ �ִ�(has a)oo
 * class ����{  } , class �� { } 
 * class ����{
 * 	�� gun;
 * }
 * 
 * -------------------
 * 
 * ���� ���
 * ��, �簢��, �ﰢ���� ����� �ʹ�.
 * 
 * ��: �� ��, �������� �����Ѱ�, �׸���, ����
 * �ﰢ��: ������ ��, �׸���, ����
 * �簢��: �װ��� ��, �׸���, ����
 * �� ����: x��� y���� ���� ��.
 * 
 * ���� �����̴�.
 * �ﰢ���� �����̴�
 * �������� �����̴�.
 * ���� ����: �Ϲ�ȭ �� ������ ��ü������ �غ��� >> �и�: ����, �׸���.
 * 
 * ��:(��üȭ, Ư��ȭ �� �ڿ�) : ��üȭ�� �ڿ��� Ư���� ���� ã�´� >>  ���� �������� ���� ��ü���� Ư¡���ִ� �ڿ�,,
 * 
 * �� ����(x,y)
 * ���� ���̴�.(x)
 * �ﰢ���� ���̴�.(x)
 * ���� ���� ������ �ִ�.(o)
 * �ﰢ���� ���� ������ �ִ�.(O)
 * �簢���� ���� ������ �ִ�.(O) >>���԰���
 * 
 * 
 * �Ϲ�ȭ, �߻�ȭ�� �ڿ���: ����и� ã�´�:  shape(����, �׸���)
 * 							: point(x, y)
 * class Shape{
 * 
 *}
 *class Point{
 *
 *}
 *��üȭ Ư��ȭ(circle, triangle) ����� ����!
 */

// �߻�ȭ, �Ϲ�ȭ
class Shape{
	String color="gold";
	void draw() {
		System.out.println("������ �׸���.");
	}
}

class Point{
	int x;
	int y;
	
	Point(){
		//������
		//this.x =1;
		//this.y =2;
		this(1, 2);
	}
	
	Point(int x, int y){
		//������ �����ε�
		this.x =x;
		this.y =y;
	}
}

//���� ���弼��.
//���� ����(����, �������� ������ �ִ�.)
//���� �����̴�(is a) extands
//���� ���� ������ �ִ�. (has a) ��������
//���� Ư������ ��ü��: ������

class Circle extends Shape{
	Point center; //member filed (��ǰ) has ~a
	int r; //member filed (Ư����, ��üȭ)
	
	public Circle() {
		this.center = new Point(5, 8);
		this.r =10;
	}
	
	public Circle(Point center, int r) {
		this.center =center;
		this.r =r;
	}
}

//����1)
//�ﰢ�� Ŭ������ ���弼��.
//���� �ﰢ���� 3���� ��, ����, �׸��� ����� ������ �ִ�.
//shape, pointȰ�� �۾�
//3���� ��(x,y) (x,y) (x,y)
//default �ﰢ���� �׸��� �ְ�, 3���� ��ǥ���� ���� ���� �ִ�.

class triangle extends Shape {
	Point x; //����Ÿ��(�ʱ�ȭ)
	Point y;
	Point z;
	
	public triangle() {
//		this.x = new Point(10,20);
//		this.y = new Point(30,40);
//		this.z = new Point(50,60);
		this(new Point(10,20), new Point(30,40), new Point(50,60));
	}
	
	public triangle(Point x, Point y, Point z) {
		this.x = x; //�� ���� �ּҰ�(Point)
		this.y = y;
		this.z = z;
	}
	
	public void trianglePoint() {
		System.out.printf("x: (%d, %d)\n",x.x,x.y);
		System.out.printf("y: (%d, %d)\n",y.x,y.y);
		System.out.printf("z: (%d, %d)\n",z.x,z.y);
	}
}

class triangle2 extends Shape {
	Point[] pointarray; //����Ÿ��(�ʱ�ȭ)
	
	public triangle2() {
		//Point[] parray = new Point[] {new Point(1,2)...}
		this(new Point[] {new Point(1,2),new Point(3,4),new Point(5,6)});//�ּҰ� �Ҵ翡 �� ����
	}
	
	public triangle2(Point[] pointarray) {
		this.pointarray = pointarray;
	}
	
	public void triangle2Point() {
		for(Point point : pointarray) {
			System.out.println("��ǥ:" +point.x +"/"+point.y);
		}
	}
}

public class Ex02_Inherit_Composite {

	public static void main(String[] args) {
		
		Circle c =new Circle();
		c.draw();
		System.out.println(c.color);
		System.out.println(c.r);
		System.out.println(c.center.x);
		System.out.println(c.center.y);
		
		Point point = new Point(10,15);
		Circle c2 = new Circle(point,20);
		System.out.println(c2.color);
		System.out.println(c2.r);
		System.out.println(c2.center.x);
		System.out.println(c2.center.y);
		
		triangle t = new triangle();
		t.draw();
		System.out.println(t.color);
		t.trianglePoint();
		triangle t2 = new triangle(new Point(1,2), new Point(3,4), new Point(5,6));
		t2.trianglePoint();
		
		triangle2 t3 = new triangle2();
		t3.triangle2Point();
		
		//Point[] point2 = new Point[3];
		Point[] point2 = {new Point(9,9),new Point(8,8),new Point(7,7)};
		triangle2 t4 = new triangle2(point2);
		t4.triangle2Point();
	}

}




