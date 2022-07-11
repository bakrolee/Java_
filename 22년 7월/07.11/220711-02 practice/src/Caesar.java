import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// p.644 예제2

public class Caesar {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		File origin = new File("d:\\filetest\\practice\\abc.txt");
		File code = new File("d:\\filetest\\practice\\abc2.txt");
		File decode = new File("d:\\filetest\\practice\\abc3.txt");
		
		// 파일 암호화 (외부 파일 -> 암호화된 방식으로 바꾼 후 -> 출력(내보내기))
		try {
			fr = new FileReader(origin);
			List<Character> list = new ArrayList<>();
			int ascii;
			char c;
			
			// 암호화
			while ((ascii = fr.read()) != -1) {
				if (ascii >= 65 && ascii <= 122) {
					c = (char) (ascii - 29);
					list.add(c);
				} else {
					c = (char) ascii;
					list.add(c);
				}
			}
			
			// 암호된 내용 출력
			fw = new FileWriter(code);
			
			for (int i = 0; i < list.size(); i++) {
				fw.append(list.get(i));
			}
			fw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		// 파일 복호화 (암호화된 파일 -> 복호화된 후 -> 출력(내보내기) )
		try {
			fr = new FileReader(code);
			int ascii;
			char c;
			List<Character> list = new ArrayList<>();
			
			// 복호화
			while ((ascii = fr.read()) != -1) {
				if (ascii >= 65 && ascii <= 122) {
					c = (char) (ascii + 29);
					list.add(c);
				} else {
					c = (char) ascii;
					list.add(c);
				}
			}
			
			// 암호된 내용 출력
			fw = new FileWriter("d:\\filetest\\practice\\abc3.txt");
			
			for (int i = 0; i < list.size(); i++) {
				fw.append(list.get(i));
			}
			fw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
