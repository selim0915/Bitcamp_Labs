/*
 * this
 * 1.��ü �ڽ��� ����Ű�� ��. =>  ��ü�� ������ ������ �����ɰŶ�� �����ϰ� ���� �ڿ��� ����Ұ�.
 * 2. this ��ü �ڽ�(�����ڸ� ȣ���� �� �ִ�):
 *   ��Ģ��? => ��ü ������ ��  ������ �Լ��� �Ѱ��� ȣ�� ����
 *   *���ܷ� this�� ����ϸ� �������� ������ ȣ���� ����
 */

class Test6{ //this�� Ŭ������ ���� �ɱ�..? Ŭ���� �ʵ带 ����Ű�� ����?
	int i;
	int j;
	Test6(){
		
	}
	Test6(int i, int j){
		this.i=i;
		this.j=j;
	}
	public void print() {
		System.out.println(i+", "+j);
	}
	public void thisPrint() {
		System.out.println(this);
		System.out.println(this.i + ", "+this.j);
	}
}

class SoCar{
	String color;
	String geartype;
	int door;
	
	SoCar(){
		this.color = "red";
		this.geartype = "auto";
		this.door =2;
	}
	
	SoCar(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	
	void print() {
		System.out.println(this.color + "/" + this.geartype
				+ "/" + this.door);
	}
}

public class Ex15_this {

	public static void main(String[] args) {
		Test6 t6 = new Test6(100,200);
		t6.print();
		System.out.println("t6: "+t6);
		t6.thisPrint();
		
		SoCar sc = new SoCar();
		sc.print();
		SoCar sc2 = new SoCar("bule","auto",4);
		sc2.print();
	}

}
