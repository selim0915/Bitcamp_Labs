import java.util.ArrayList;

//Today Point
//generc
//JDK1.5부터 지원
//C#, JAVA의 필수 기능

//1.Object타입 저항하겠다. -> Ibject 타입 탈피
//2.타입을 강제하겠다. (타입의 안전성)
//3.형변환(casting)문제를 해결하겠다. -> 다운캐스팅 안 하겠다.

class MyGen<T>{ //Type parameter MyGen<E>
	T obj;
	
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

/*
 * MyGen<String> mygen = new MyGen<String>(); 
 * heap이라는 메모리에 로드될 때,
 * 
 * class MyGen{ //Type parameter MyGen<E> 
 * String obj;
 * 
 * void add(String obj) { 
 * this.obj = obj; 
 * }
 * 
 * String get() { 
 * return this.obj; 
 * } 
 * }
 */

/*
 * MyGen<Car> mygen = new MyGen<Car>(); 
 * heap이라는 메모리에 로드될 때,
 * 
 * class MyGen{ //Type parameter MyGen<E> 
 * Car obj;
 * 
 * void add(Car obj) { 
 * this.obj = obj; 
 * }
 * 
 * Car get() { 
 * return this.obj; 
 * } 
 * }
 */

class Person{
	int age=14;
	String name="a";
}

public class Ex06_Generic {

	public static void main(String[] args) {
		MyGen<String> mygen = new MyGen<String>(); //String이 T가된다.
		mygen.add("aaa"); //String만 쓴다.
		System.out.println(mygen.get()); //반환값도 String형으로 돌려준다.
		
		MyGen<String> my = new MyGen<>();
		my.add("1234");
		my.add("5678");
		System.out.println(my.get());
		
//		MyGen<Person> mygen2 = new MyGen<Person>();
//		mygen2.add(new Person()); //person객체만 가능
//		Person p = mygen2.get();
//		System.out.println(p.age);
		
		MyGen<Person> my2 = new MyGen<Person>();
		my2.add(new Person());
		Person p8 = my2.get();
		System.out.println(p8.name);
		
		
		
		
		
		System.out.println("--------------------");
		
		ArrayList<String> li = new ArrayList<String>(); 
		//ArrayList의 모든 객체가 String으로 변한다.
		li.add("a");
		li.add("b");
		for(String str : li) {
			System.out.println(str);
		}
		
		
		
		System.out.println("---------제너릭 쓴거 안쓴거 비교-----------");
		ArrayList list = new ArrayList();
		list.add(500);
		list.add(new Person());
		list.add("홍길동");
		
		//Quiz
		//개선된 for문을 사용해서 500, 100, 홍길동을 출력하세요.
		for(Object obj : list) {
			//System.out.println(obj);
			
			if(obj instanceof Person) {
				Person p2 = (Person)obj;
				System.out.println(p2.age);
			} else {
				System.out.println(obj);
			}
		}
		
		ArrayList<Person> alist = new ArrayList<Person>();
		alist.add(new Person());
		System.out.println(alist.get(0).age); //객체의 배열순서에 값
		
		
		
	}

}
