
public class Ex08_Static_Method {

	int iv =100;
	static int cv =200;
	
	void method(int a) {
		System.out.println("�Ϲ��Լ�"+a);
	}
	
	static void smethod() {
		System.out.println("static�Լ�");
	}
	public static void main(String[] args) {
		
		Ex08_Static_Method e = new Ex08_Static_Method();
		System.out.println("e.iv: "+e.iv);
		e.method(1);
		Ex08_Static_Method.smethod();
		
		System.out.println("Ex08_Static_Method.cv: "+Ex08_Static_Method.cv);
		
		// *static�Լ��� ����:
		// *���� ���� �ڿ��� ���ϰ� ���� ���ؼ�.
		//=>���� ���� �ڿ��� static���� ���°� ȿ�����̴�.
		
		//static �Լ��� heap�� �ø��ʿ� ����.
		// new�� heap�� �޸𸮸� �����ϴ� ������.
	}

}
