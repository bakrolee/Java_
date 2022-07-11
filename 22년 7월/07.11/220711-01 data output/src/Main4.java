import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main4 {
	public static void main(String[] args) {
		DataInputStream dis = null;
		List<Student> list = new ArrayList<>();
		
		try {
			dis = new DataInputStream(new FileInputStream(new File("d:\\filetest\\student.dat"))); // 그냥도 되네? new file 안 하고
			
			while (true) {
				String name = dis.readUTF();	// 데이터의 타입 순서와 다르게 가지고 오면, 이상하게 해석을 해서 데이터를 가져옴.
				int age = dis.readInt();
				double score = dis.readDouble();
				
				Student s = new Student(name, age, score);
				list.add(s);
			}
		} 
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (EOFException e) {
//			System.out.println("학생 정보를 파일 끝까지 읽음");
//		} 
		catch (IOException e) {
			System.out.println(e.getClass());  // 예외가 너무 길면 그냥 부모 예외로 통치고, 어떤 곳에서 예외 발생했는지 메소드로 확인 가능.
//			e.printStackTrace();
		} finally {
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(list);
	}
}
