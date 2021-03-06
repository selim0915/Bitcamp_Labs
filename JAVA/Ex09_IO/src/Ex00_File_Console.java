import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex00_File_Console {
	
	public static void main(String[] args) throws IOException {
		// java ExDos C:\Temp mkdir newDir
		// java ExDos C:\Temp rename file.txt file2.txt
		// java ExDos delete new.txt

		if (args.length >= 4 ) {
			 System.out.println("사용법 : [java파일명] [디렉토리경로] mkdir [생성디렉토리명]");
			 System.out.println("사용법 : [java파일명] [디렉토리경로] time");
			System.out.println("예시: java Ex10_File_Sublist type C:\\Temp\\a.txt");
			System.exit(0);
		}
		
//		File f = new File(args[1]);
//        if(!f.isDirectory()) { //존재하지 않거나 디렉토리 아니라면
//            System.out.println("유효하지 않은 디렉토리입니다");
//            System.exit(0);
//        }
        
        if(args[0].equals("mkdir")) 
        {
            String path = "";
            path = args[1];
            File newfile = new File(path);
            if(newfile.exists()) {
                System.out.println("이미 존재하는 디렉토리입니다");
            }
            else {
                newfile.mkdir();
            }
        }
        
		if (args[0].equals("time")) {
			//System.out.println("time 연습");
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.ss");
			String strDate = sd.format(new Date());
			System.out.println("현재 시간: " +strDate);
		}
		
		if (args[0].equals("type")) {
			String path = "";
            path = args[1];
            
    		FileReader fr = new FileReader(path);
    		BufferedReader br = new BufferedReader(fr);
			
			String line="";
			for(int i=0; (line =br.readLine())!= null; i++) { //string은 값이 없음 표시를 null로 한다.
				System.out.println(line);
			}
			
			br.close();
			fr.close();
			
		}
		
		if (args[0].equals("rename")) {
			String oldpath = "";
			String newpath = "";
			
			oldpath = args[1];
			File oldfile = new File(oldpath);
			newpath = args[2];
			File newfile = new File(newpath);
			if(newfile.exists()) {
                System.out.println("이미 존재하는 디렉토리입니다");
            }
            else {
                //newfile.rename();
            }
		}
		
		if(args[1].equals("delete")) {
			String path="";
			path = args[1];
			
			File newfile = new File(path);
			if(!newfile.exists()) {
				System.out.println("존재하지 않눈 파일입니다.");
			} else {
				newfile.delete();
			}
		}
		
		if(args[1].equals("copy")) {
			String path1="";
			path1 = args[1];
			String path2="";
			path2 = args[1];
			
			FileInputStream fi = new FileInputStream(path1);
			FileOutputStream fo = new FileOutputStream(path2);
			
			int data =0;
			while((data = fi.read())!=-1) {
				fo.write(data);
			}
			
			fi.close();
			fo.close();
			System.out.println("복사완료");
		}
		
		
		
		
	}

}
