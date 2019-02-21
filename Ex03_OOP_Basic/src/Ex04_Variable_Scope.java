
//������ Ŭ���� (Ex04_Variable_Scope.java�ȿ� )
class Variable{
	int iv;
	/*
	 * 1. iv: memberfield, instance variable
	 * 2.		 ����� ����: ������ �������(����:����,����,����(��ǰ))
	 * 3.		Ư¡: �ʱⰪ�� ������ �ִ�. (Ŭ�����ȿ� ����� ���� ������), �ʱ�ȭ�� ���� �ʴ´�.(�����Ǵ� ��ä������ �ٸ����� ������ ������)
	 * 4.		��������: (memory�� �ö󰡴� ����): Variavle�� new��� �����ڸ� ���� heap�� ��ü�� ����� ����,		
	 * 
	 * �ʱⰪ(�⺻��): ����:0, �Ǽ�:0.0, BOOLEAN:false, ���ڿ�=NULL
	 */
	static int cv;
	/*
	 * 1. cv: class variable, static variable, �����ڿ� �̶�� �θ�
	 * 2.		����� ����: ������ ������� => �����Ǵ� ��� ��ü�� �����ϴ� �ڿ��� �����. => ��ü�� �����ڿ�
	 * 3. 		Ư¡: ���ٹ���� Ư���ϴ�(�������� ���ٹ��� ����������) =>Ŭ�����̸�.static�ڿ�(Variable.cv)
	 * 			=> ��ü�� ����� �����ʾƵ� ������ �����ϴ�. (ex: Math.random())
	 * 4.		��������: ���α׷��� ����� �� class loder system�� ���ؼ� class area=mrthod area�ȿ� ������ �ø���
	 * 					Ŭ������ �÷��� Ŭ�����ȿ� static�ڿ��� ������ �ִٸ�, static�ڿ��� �޸𸮿� �ø���(nenory load).
	 * 					=> static�� ��ü ���������� �޸𸮿� ���� �ö󰣴�.
	 */
	void method() {
		int Iv=0; 
		/*l
		 * ocal variable ��������, �ʱ�ȭ�ʷ�
		 * Ư¡: �ʱ�ȭ�� �ݵ�� �ʿ��ϴ�
		 * ��������: �Լ��� ȣ��Ǹ� ������, �Լ��� �����ϸ� �Ҹ� (stack�� ����)
		 */
	}
}

public class Ex04_Variable_Scope {

	public static void main(String[] args) {
		
//		Variable.cv = 100; //static����
//		
//		System.out.println("Variable.cv : "+Variable.cv );
//		Variable v = new Variable();
//		v.iv = 200;
//		v.cv = 500;
//		System.out.println("v.cv: "+Variable.cv);
		
		System.out.println("Variable.cv : "+Variable.cv);
		Variable v = new Variable();
		System.out.println(v.cv);
		Variable v2 = new Variable();
		System.out.println(v.cv);
	}

}
