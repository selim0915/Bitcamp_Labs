//�����ּ�
//���赵
public class Person {
	private int age; //����� ���̸� ������.(���̸� ���� ����)
	private String name; //����� �̸��� ������.(�̸��� ���� ����)
	
	// ������ �Լ� (Ư���ϴ�)
	public Person() {
		//��ü ������ �Բ� ���ÿ� ȣ��Ǵ� �Լ�
		// -����Ÿ���� ����.
		// -Ŭ�����̸��� ���� �̸��� ������.
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void personInfo() {
		System.out.println("����: "+ this.name +" ,"+this.age);
	}
}
