
public class Ex04_DataType {
	public static void main(String[] args) {
	    byte b = 100;
	    System.out.println(b);
	    
	    int i = 12345;
	    System.out.println(i);
	    
	    long l = 100000000000L; // ���� ���ͷ��� int
	    System.out.println(l);
	    
	    float f = 3.14f; // �Ǽ� ���ͷ��� double
	    System.out.println(f);
	    
	    double d = 3.141924567;
	    System.out.println(d);
	    
	    boolean bo = true;
	    
	    char ch = 'A';
	    
	    String str = "ȫ�浿";
	    
	    // Tip) Java Ư������ ���: \ ��������
	    
	    char sing = '\''; // ���� �Է��� ���� ���̴�.
	    System.out.println(sing);
	    
	    // ȫ"��"�� >> ��ü�� ������(��)
	    String name = "ȫ\"��\"��";
	    System.out.println(name);
	    
	    // ȭ�鿡 C:\Temp��� ���ڿ��� ����غ�����.
	    String path = "C:\\Temp";
	    System.out.println(path);
	}
}
