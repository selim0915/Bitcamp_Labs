import java.util.Arrays;

//�迭�� ���� �� �ִ� Ÿ����
//8���� �⺻Ÿ��+ String+ ���������Ŭ����

class Person{
	String name;
	int age;
}

public class Ex04_Object_Array {

	public static void main(String[] args) {
		int[] intarr = new int[10];
		boolean[] booarr = new boolean[5];
		System.out.println(Arrays.toString(booarr));
		
		Person[] objarr = new Person[3];
		System.out.println(Arrays.toString(objarr));
		//����Ÿ�� �迭�� ���� ����� ���� �濡 ��ü�� �ξ��ִ� �۾��� �ʿ��ϴ�.
		
		objarr[0] = new Person(); //�ּҰ��� ������ �ִ� ��
		objarr[1] = new Person();
		objarr[2] = new Person();
		System.out.println(Arrays.toString(objarr));
		
		//��ü�迭�� �ι� �۾��ؾ��Ѵ�.
		// 1. �游��� (�游 ���� ����null)
		// 2. ��ü�ּ� �ֱ�
		
		objarr[0].name = "ȫ�浿";
		objarr[0].age =100;
		System.out.println(objarr[0].name + objarr[0].age);
		
		System.out.println("�迭: "+objarr);
		for(int i=0; i<objarr.length; i++) {
			System.out.println(objarr[i].name+"/"+objarr[i].age);
		}
		
		//1. int[] arr = new int[5];
		Person[] parray = new Person[5];
		for(int i=0; i<parray.length; i++) {
			parray[i] = new Person();
			System.out.println("�ּҰ�: "+parray[i]);
		}
		
		// 2. int[] arr = new int[] {10,20,30};
		Person[] array2 = new Person[] {new Person(),new Person(),new Person()};
		
		//3. int[] arr = {10,20,30};
		Person[] array3 = {new Person(),new Person(),new Person()};
		
		
		
		
	}

}
