import java.io.File;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest");
		System.out.println("있냐? " + file.exists());
		System.out.println("폴더임? " + file.isDirectory());
		System.out.println("파일임? " + file.isFile());
		
		boolean result = file.mkdir();	//
		System.out.println("생성여부: " + result);
		
		// d드라이브 filetest 폴더에 abc 폴더 생성
		File abc = new File("d:\\filetest\\abc");
		abc.mkdir();
		
		File file2 = new File("d:\\filetest\\abc\\..\\def");  
		file2.mkdir();
		try {
			System.out.println(file2.getCanonicalPath());  // 보기 편하게 나타내줌.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		File file3 = new File(file2.getCanonicalFile());  // 파일 객체를 반환해줌.
		
		File textFile = new File("d:\\filetest\\mytext.txt");
		try {
			boolean result2 = textFile.createNewFile();  // 해당 경로에 파일을 생성해줌(확장자도 자유롭게 정할 수 있음). 생성 여부를 boolean값으로 반환. 
			System.out.println("생성됨? " + result2);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
