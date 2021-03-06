import java.io.IOException;

public class Ex03_Exception_finally {

	static void startInstall() {
		System.out.println("INSTALL");
	}
	
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	
	static void fileDelete() {
		System.out.println("DELETE FILES");
	}
	
	public static void main(String[] args) {

		try {
			copyFiles();
			startInstall();
			
			//개발자가 임의로 예외를 만들 수 있다.
			//A, B, C 정상입력,, D라고 입력하면 비정상으로 하고 싶다..
			// => 특수한 경우를 예외로 만들 수 있다.
			// => ==사용자 예외 던지기 (예외객체 생성 > 예외객체를 개발자가 직접 생성(new))
			
			//throw new IOException("Install 처리 중 문제 발생"); //필요한 객체 만들어서 던지기 
			//*throw new IOException()
			
		} catch(Exception e) {
			System.out.println("예외 메세지 출력: "+e.getMessage());
		} finally {
			//예외가 발생하던, 발생하지 않던 강제적 실행 블록
			fileDelete();
		}
		
		//주의사항
		//함수종료 return;  //catch문내에 return이 있으면 원래는 메임함수 구문이 종료되야하는데.. 그와중에 finally는 실행한다.
		//함수가 종료되더라도 finally는 실행 된다.
		
		System.out.println("MAin End");
		
	}

}
