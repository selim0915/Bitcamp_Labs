
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Ex10_File_Sublist {

	static int totalFiles =0; //객체간 공유자원 아니고 static변수
	static int totaldirs=0;
	
	public static void main(String[] args) {
		if(args.length != 1) { //내용이없다면
			System.out.println("사용법: java [파일명] [경로명]");
			System.out.println("예시: java Ex10_File_Sublist C:\\Temp");
			System.exit(0); //프로세스 종료
		}
		
		File f = new File(args[0]); // args[0] > c:\\Temp
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		//이 시점에 printFileList() 호출
		printFileList(f);
		System.out.println("총 파일 수: " +totalFiles);
		System.out.println("총 폴더 수: " +totaldirs);
	}
	
	static void printFileList(File dir) {
		System.out.println("[Full Path : " + dir.getAbsolutePath() + "]");
		
		//Q
		List<Integer> subDir = new ArrayList<Integer>();
		File[] files = dir.listFiles(); //C:Temp 입력했다면 하위 자원을 배열로 받는다.
		
		//C:\\Temp	[0] a.txt
		//			[1] NEW
		//			[2] c.jpg 이런 정보를 파일 배열에담아서 관리하겠다.
		//			[3] OLD
		
		
		for(int i=0; i<files.length; i++) {
			String filename = files[i].getName(); //폴더명, 파일명이 넘어온다.
			if(files[i].isDirectory()) {
				filename = "<DIR> [" + filename + "]";
				
				//Q PONT
				subDir.add(i); //폴더면 정수값을 서브디렉토리에 추가
				
			}else {
				filename = filename + "/" + files[i].length() + "Byte";
			}
			System.out.println("  " + filename);
		}
		
		int dirnum = subDir.size();
		int filenum = files.length - dirnum;
		
		//누적값
		totaldirs += dirnum; //폴더누적개수
		totalFiles += filenum; //파일누적개수
		
		System.out.println("[Current dirnum] : "+ dirnum);
		System.out.println("[Current filenum] : "+filenum);
		System.out.println("*************");
		
		//Q
		for(int j=0; j<subDir.size(); j++) {
			int index = subDir.get(j);
			printFileList(files[index]); //재귀호출
		}
		
	}

}
