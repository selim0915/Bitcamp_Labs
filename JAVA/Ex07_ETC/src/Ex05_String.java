//String 클래스
//이 수업을 듣고 string는 클래스다 라는 사실을 잊으세요
//String 을 8가지 기본타입처럼 써랏..

//1. String 클래스: 데이터 저장 (heap) : 자료구조 : char[] 배열을 사용해서 String을 관리

//2. String ename = "a길동"; 
// 내부적으로: [a][길][동]

//3. String s = new String("ABCD");

public class Ex05_String {

	public static void main(String[] args) {
		String str = "ABCD";
		System.out.println(str.length()); //length : 방몇개니? 길이몇이니?
		//String이 내부적으로 char[]배열로 정리되니까 가능 한 일..
		System.out.println(str.toString()); 
		//Object의 toString을 재정의해서..
		//배열의 모든값을 재 배열해서 사용함.
		//그래서 주소값이 아니라 값이 배열처럼 이어져서 출력된거..
		
		String str1 ="AAA";
		String str2 ="AAA";
		System.out.println(str1==str2); //값이 같니?
		//String은 같은 값이면 같은 저장소를 쓴다.
		System.out.println("str1: "+ str1.toString());
		System.out.println("str2: "+ str2.toString());
		System.out.println(str1.equals(str2));
		
		System.out.println();
		
		String str3 = new String("BBB"); //new는 무조건 주소를 새로 만든다.
		String str4 = new String("BBB");
		System.out.println(str3==str4); //값이 같니?
		//String은 같은 값이면 같은 저장소를 쓴다.
		System.out.println("str3: "+ str3.toString());
		System.out.println("str4: "+ str4.toString());
		System.out.println(str3.equals(str4));
		
		String str5 = "A";
		str5 += "B";
		str5 += "c";
		str5 += "D";
		str5 += "E";
		str5 += "F";
		System.out.println(str5);
		
		String str6 = "hello";
		
	}

}
