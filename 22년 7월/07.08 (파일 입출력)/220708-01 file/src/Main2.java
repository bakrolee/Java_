import java.io.File;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		File file = new File(".\\");	// '.' = 현재 경로를 의미함. (=상대경로) / 내 기준으로 찾아감.
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		
		System.out.println(file.getAbsolutePath());		// 현재 경로의 절대 위치를 알려줌.
		try {
			System.out.println(file.getCanonicalPath());	// 위의 절대위치에서 우리가 해석하기 편하게 알려줌. / checked 예외이기 때문에 무조건 예외처리를 해줘야 함. 
		} catch (IOException e) { 	// 파일 입출력을 할 때 계속 IOEx~을 보게될 것. (이유 = 파일이라는 건 외부에서 불러오기때문에~~)
			e.printStackTrace();
		}
		
		
		File fileParent = new File("..\\");		// '..' = 상위 현재경로를 의미. 현재 경로에서 한 단계 위로 올라간 경로 (부모경로). 
		
		System.out.println(fileParent.getAbsolutePath());
		try {
			System.out.println(fileParent.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("파일3");
		try {
			File file3 = file.getCanonicalFile().getParentFile();
//			File file3 = file.getParentFile();	// 상대경로로 되어있으면 부모를 못 찾음. 
			System.out.println(file3.getAbsolutePath());
			System.out.println(file3.getCanonicalPath());
			System.out.println(fileParent.equals(file3));	// 표현 방식이 다르기 때문에 false.
			System.out.println(fileParent.compareTo(file3));
			
			System.out.println(fileParent.getCanonicalFile().equals(file3));	// 표현 방식만 맞춰주면 true.
			System.out.println(fileParent.getCanonicalFile().compareTo(file3));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
















