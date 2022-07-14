import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
//			br.readLine(); // 한줄에 있는 걸 다 읽을 수 있음.
			
			String line;
			while ((line = br.readLine()) != null) {  // 파일 다 읽으면 마지막에 null을 반환
				System.out.println(line);
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
