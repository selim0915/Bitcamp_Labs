import kr.or.bit.Boat;
import kr.or.bit.Book;
import kr.or.bit.Movie;

/*
 * �ʱ�ȭ != ����Ʈ
 * int[] arr = new int[5]
 * �ʱ�ȭ: ������ �� �Ҵ� ex: arr[0]=100;
 *    : member field�� �ʱ�ȭ�� �Ѵ�.
 *    1. Ư���� ������ ������ �Լ�(�ʱ�ȭ)
 *  2. �ʱ�ȭ(instance variable:member field)�� �ʱ�ȭ
 *  
 *  -�Ϲ��Լ��� �ٸ���
 *=> �Լ��� �̸��� ���� �Ǿ� �ִ�. (Ŭ���� �̸��� �Ȱ��ƾ� �Ѵ�.) 
 * ������ �Լ�(�Լ���: �Ķ���Ͱ� �ִ°�) => constructor: �ʱ�ȭ�Լ�
 * => �������Լ��� return type(x), void(x)�� ����. : �������� default�� void
 * 	why: ��ü�� ����� ���� ���ÿ� ����Ǵ� ���� ( ���������� ������ �ִ�.) �׷��� ���� ����(�ѱ�) ���� ��� ���ϰ��� �����ȴ�.
 * 
 * ����: �����Ǵ� ��ü���� �ٸ� �ʱⰪ�� ��� ���� ��
 * 
 * ������ �Լ�(�ϳ��� �̸����� �������� ����� ����� �ִ�. �굵 �Լ��� �����ε��� �����ϴ�)
 * ������ �����ε�: param�� ������ Ÿ��
 * ����: Car c = new Car("color"); //�Ķ����1���� ���� �� �ִ� �����ڰ� ������ �ȴ�.
 * 1. stack�� c��� ���� ���� default: null
 * 2. new�� ���� heap�� CarŸ���� ��ü ���� >������ ����� memberfield�� �ø���. >�������Լ� ȣ��(�ε��� ����ʵ带 �ʱ�ȭ �Ѵ�.)
 * 3. class ������ default�����ڴ� ���� ����. (���� ���� �������� �ʾƵ� �����Ϸ��� �˾Ƽ� ���� �� �ش�.)
 * 
 * tip: ������ �Լ��� �����ε��� ���� ������ ������ �پ���.
 */

class Car{
	String name;
	//���� �������� �ʾƵ� �����Ϸ��� �����ڰ� �ִٰ� �����Ѵ�.
	//Car() {}
	//���� ������ default�� ��������.
}

class Car2{
	String name;
	Car2(){ //default constructor
		System.out.println("���� ������ ������ �Լ�");
		System.out.println("brfore: "+name);
		name = "pony";
		System.out.println("after: "+name);
	}
}

class Car3{
	int number;
	//�������: �ڵ�󿡼�  default�����ڴ� �Ϲ������� ����,
	Car3(){
		
	}
}

class Car4{
	int door;
	int wheel;
	
	Car4(){
		//default
		System.out.println("car4: default");
	}
	
	Car4(int num){
		//overLoading
		door = num;
		System.out.println("overloding door: "+door);
	}
	
	Car4(int num, int num2){
		//overLoging
		door = num;
		wheel = num2;
		System.out.println("overloding door: "+door+"/"+wheel);
	}
	
	//�����ε� ������ �Լ��� �ۼ��ߴٸ�, default�����ڴ� ���� �ۼ��Ͽ��� �Ѵ�.
	//�׷��� new Car(); �̷��� ������ ���Ѵ�.
	// �ݵ�� ���� ���� �����ϰ� �ȴ�. (�������� ��� �ȴ�)
}

class Apt{
	String color;
	
	Apt(String color){
		this.color = color;
	}
}
//1.Ŭ���� ������ �����ε� �����ڰ� �ϳ��� �����Ѵٸ�, default �����ڴ� �ڵ� �������� �ʴ´�.(
//(�����Ϸ�)�� �ڵ����� ������ �ʴ´�.
//why: ���赵�� �������� �ο��ϱ� ����,(���� �Ѵ�θ� ǥ�� �Ҽ� �ְ�),
//     => ��: ������ �����ε� ���ǰ� �ϰڴ�.

class Apt2{
	String color;
	
	Apt2(){
		//�������� ����.
	}
	
	Apt2(String color){
		this.color = color;
	}
}

// 1. class���� �� ������ �Լ� �������� ������... (default ������ �ڵ�����) 
//     ex: class Tv {String name;}
// 2. class���� �� �����ε� ������ �Լ��� �ϳ��� ����... 
//     ex: class Tv {String name; Tv(String n){name=nl} }
// 3. class ���� �� default, �����ε� ������ �Լ� �Ѵ� ����... (���� ���� ���´� �ƴ�)
//       �ʿ信 ���� ��� �� �ִ�.
//     ex: class Tv {String name; Tv(){} Tv(String n){name=nl} }
public class Ex13_Constructor_Function {

	public static void main(String[] args) {
		Car c = new Car();
		Car2 c2 = new Car2();
		Car3 c3 = new Car3();
		Car4 c4 = new Car4(); //defaultȣ���ؼ� ��ü ����
		Car4 c5 = new Car4(200); //param 1�� ȣ���ؼ� ��ü ����
		Car4 c6 = new Car4(200,40); //param 2�� ȣ���ؼ� ��ü ����
		
		Apt apt = new Apt("blue");
		Apt2 apt2 = new Apt2();
		
		Book b = new Book("�����",1200);
		b.bookprint();
		System.out.println("�̸�:"+b.getName() +" ,����"+ b.getPrice());
		
		Book b2 = new Book("��û��",800);
		b2.bookprint();
		System.out.println("�̸�:"+b2.getName() + " ,����"+ b2.getPrice());
		
		
		Movie m = new Movie("�ܿ�ձ�", "�ִ�", "����", "�����", "2018-09-15");
		m.movieInfo();
		
		
		Boat b3 = new Boat("���� ��",2,200,180000,2);
		System.out.println(b3.getName());
		System.out.println(b3.getDoor());
		System.out.println(b3.getMaxp());
		System.out.println(b3.getPrice());
		System.out.println(b3.getTon());
		
		
		
		
		
	}
}
