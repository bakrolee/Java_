import java.io.File;

public class Main {
	public static void main(String[] args) {
//		File file = new File("d:\\Royb\\test.txt");
//		
//		System.out.println(file.getName());
//		System.out.println(file.getPath());
//		System.out.println(file.exists());
//		
//		File f2 = new File("d:\\Royb\\asdf.txt"); // 실제 파일이 아니라, 외부의 파일과 소통할 수 있는 객체.
//		
//		System.out.println(f2.getName());
//		System.out.println(f2.getPath());
//		System.out.println(f2.exists());
		
		File dir = new File("d:\\Royb");
		System.out.println(dir.getName());
		System.out.println(dir.getPath());
//		System.out.println(dir.exists());
		
		System.out.println("파일임? " + dir.isFile());
		System.out.println("디렉? " + dir.isDirectory());
	}
}
