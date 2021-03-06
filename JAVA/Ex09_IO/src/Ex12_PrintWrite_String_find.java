import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//특정 폴더에서 검색 할 단어가 주어지면
//그 단어가 포함 된 파일 목록 출력하기

public class Ex12_PrintWrite_String_find {

	String baseDir = "C:\\temp"; //검색할 디렉토리
	String word="hello"; //검색할 단어
	String save = "result.txt"; //검색결과를 출력 (???)
	
	public void Find() throws IOException{
		File dir = new File(baseDir); //정보얻기
		
		if(!dir.isDirectory()) { //파일만 볼거라 디렉토리는 상관없는 상황
			//디렉토리 아니야! > 메세지 띄우기 > 시스템종료
			System.out.println("baseDir :" + "is not directory or exist");
			System.exit(0);
		}
		
		PrintWriter writer = new PrintWriter(new FileWriter(save)); //없으면 생긴다
		BufferedReader br = null;
		
		File[] files = dir.listFiles(); //리스트에 있는 파일 다 가져오기 (배열에 담아서) //Temp폴더 하위에 있는 모든 자원
		for(int i=0; i<files.length; i++) {
			if(!files[i].isFile()) { //파일이 아니라면
				continue; // 지금 차례에 구문을 skip하겠다.
			}
			
			br = new BufferedReader(new FileReader(files[i]));
			//a.txt, b.txt를 읽을 준비를 마쳤다. (buffer를 이용하여 Line단위로)
			
			String line ="";
			while((line = br.readLine())!= null) {
				
				//Point
				if(line.indexOf(word)!= -1) {//indexOf(): 내가찾는 단어가1개라도  존재하면 1보다 큰값을 반환해주니까
					//if: 찾는단어가 1개라도 있으면 기록할것이다. ( result.txt)
					writer.write(word + "는 word= "+ files[i].getAbsolutePath()+"\n");
					//당신이 찾는 단어는 여기에 기록되어 있다.
				}
			}
			writer.flush();
		}
		br.close();
		writer.close();
		
	} //Find()함수를 사용할 때 예외처리를 반드시 하게 함
	
	public static void main(String[] args) {
		
		try {
			Ex12_PrintWrite_String_find StringFind = new Ex12_PrintWrite_String_find();
			StringFind.Find(); //메소드 호출
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

}
