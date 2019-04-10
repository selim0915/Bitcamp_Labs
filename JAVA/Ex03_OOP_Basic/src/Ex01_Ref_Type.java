import kr.or.bit.Person; //������� �ʾƼ� ������� �ߴ°�..
import kr.or.bit.Tv;

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		//type + ����(Ŭ������ �ҹ��ڷ� ����)
		Person person; //stack ������ 4Byte�� �� ������ ���� �̸���(person) null;
		person = new Person(); //heap �޸𸮿� person��ü�� �����. person������ �ּҰ��� �Ҵ��Ѵ�.
		System.out.println("person: "+ person); //kr.or.bit.Person@15db9742
		
		person.age = 21;
		person.name = "woo se";
		person.print();
		System.out.println("person: "+ person.age + "/" +person.name);
		
		
		// person, person2: �ּҰ��� ������ ������ (RefŸ��: ����Ÿ��)
		Person person2 = new Person(); //����� �Ҵ��� ���ÿ�
		person2.name = "kim su";
		person2.age = 43;
		person2.print();
		
		int num  = 100; //local variable (��������) �޼ҵ�ȿ� ����, �ʱ�ȭ �ʿ�
		System.out.println(num); // num: ���� ��������� (ValueŸ��: ��Ÿ��)
		
		Person you = person; 
		//The local variable you may not have been initialized
		//����Ÿ���� �ʱ�ȭ��� ���� �ּҰ��� ������ ��.
		//�ּҰ��� ������ ���ؼ� new �� �ʿ��ϴ�.
		/*
		 * ���������� �ʱⰪ�� ������ ���� ���
		 * 1. new �����ڸ� ����Ѵ�
		 * 		( you = new Person();)
		 * 2. �ٸ� ���������� ������ �ּҸ� �Ҵ� ������ �ȴ�.
		 * 		( you = person;) //you, person�� �Ѹ��� �ȴ�.
		 */
		System.out.println("you: " +you);
		System.out.println("person: " + person);
		System.out.println("you == person: " + (you == person)); //==���� ��(�ּҰ��� ���ϰ� ��)
		
		Tv t = new Tv();
		t.brandname = "�Ｚ";
		System.out.println("�⺻ä��: " + t.ch); //0
		System.out.println("�귣��: " + t.brandname); //null
		
		
		t.ch_up(); //1
		System.out.println("���� �� ä��: "+ t.ch);
		
		System.out.println("����: "+ t.power);
		t.power_on();
		System.out.println("����: "+ t.power);
		t.ch_up(); //1
		t.ch_up(); //2
		t.ch_up(); //3
		System.out.println("���� �� ä��: "+ t.ch);
		t.ch_down(); //2
		System.out.println("���� �� ä��: "+ t.ch);
		t.power_off();
		
		System.out.println("����: "+ t.power);
		t.power_on();
		t.ch_up();
		System.out.println("���� �� ä��: "+ t.ch);
		
		
	}

}
