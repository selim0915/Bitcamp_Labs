/*
 * 2. this(��ü>> �����ڸ� ȣ���ϴ� this)
 * ��Ģ : �����ڴ� ��ü ������ �Ѱ��� ȣ��
 * =>  ���������� this�� ����ϸ� �������� ������ �Լ��� ȣ�� ����
 * 
 * �����ھȿ� �ִ� �ڵ尡 �ݺ������� ���Ȱ��� ���� ���� �ʴ´�.
 *default: this.color = "red";
 *overloding: this.color = color;
 *
 *�Ҵ��� �ѹ��ϸ� ���ڴ�...
 *����� ������??
 *
 *
 */

class Zcar {
	String color;
	String geartype;
	int door;

	Zcar() { // �� ������� ����� �⺻ ��
//		this.color = "red"; //�ʵ� �ʱ�ȭ
//		this.geartype = "auto";
//		this.door =4;
		this("red", "auto", 4); // �ڱ� �ڽ��� ȣ��(������ �Լ��� �θ� �� �ִ�)
		System.out.println("default constructor");
	}

	public Zcar(String color, String geartype, int door) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloding constructor");
	}

	void print() {
		System.out.println(this.color + ", " + this.geartype + ", " + this.door);
	}
}

//�ڵ��� ������� (�ڵ��� �Ǹ� �� �⺻ �ɼ�): default , �⺻��...
class Zcar2 {
	String color;
	String geartype;
	int door;

	Zcar2() {
		this("red", 2); //������ �ִ� ���� ������ ����� ���ͼ� �Ʒ� �����ڸ� �ٽ� ������.
		// �ŰԺ��� ������ �ش��ϴ� ������ ��ġ�� ���� �̵�,
		System.out.println("default constructor");
	}
	
	Zcar2(String color, String geartype, int door) { //����, ���, �� ���ð���
		this.color = color;
		this.geartype = geartype;
		this.door =door;
		System.out.println("overloding constructor param3��");
	}
	
	Zcar2(String color, int door) { //������ ����� ���� ������ ���� ����
		this(color, "auto", door);
		System.out.println("overloding constructor param2��");
	}

	
	
	void print() {
		System.out.println(this.color + ", " + this.geartype + ", " + this.door);
	}
}

public class Ex16_this_Constructor_Call {

	public static void main(String[] args) {
		Zcar z = new Zcar(); // �⺻��
		z.print();

		Zcar z2 = new Zcar("blue", "auto", 10); // �����ε�
		z2.print();
		System.out.println();
		
		
		
		Zcar2 car = new Zcar2();
		car.print();
		System.out.println();
		
		Zcar2 car2 = new Zcar2("gold",2);
		car2.print();
		System.out.println();
		
		Zcar2 car3 = new Zcar2("pink", "manual",5);
		car3.print();
	}

}
