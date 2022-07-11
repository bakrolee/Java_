import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// p.644 예제 1

public class Numbers {
	public static void main(String[] args) {
		BufferedReader br = null;
		List<Integer> listInt = new ArrayList<>();
		
		try {
			br = new BufferedReader(new FileReader("d:\\filetest\\practice\\numbers.txt"));
			String s;
			while ((s = br.readLine()) != null) {
				listInt.add(Integer.valueOf(s));
			}
			Collections.sort(listInt);
			System.out.println(listInt);
			
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
		
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter("d:\\filetest\\practice\\sort_numbers.txt");
			
			for (int i = 0; i < listInt.size(); i++) {
				pw.println(listInt.get(i));
			}
			pw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
}
