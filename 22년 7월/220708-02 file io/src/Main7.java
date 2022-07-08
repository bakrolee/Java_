import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main7 {
	public static void main(String[] args) {
		Map<Integer, Set<Integer>> lotto = new LinkedHashMap<>();
		
		lotto.put(1000, new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
		lotto.put(1001, new HashSet<Integer>(Arrays.asList(7, 8, 9, 10, 11, 12)));
		lotto.put(1002, new HashSet<Integer>(Arrays.asList(13, 14, 15, 16, 17, 18)));
		
		// lotto.txt 출력
		// 1000 : [1, 2, 3, 4, 5, 6]
		// 1001 : [7, 8, 9, 10, 11, 12]
		// 1002 : [13, 14, 15, 16, 17, 18]
		
		File file = new File("d:\\filetest\\lotto.txt");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);
			
			// for each문
			Set<Integer> keySet = lotto.keySet();
			for (Integer i : keySet) {
				pw.println(i + " : " + lotto.get(i));
			}
			
			// iterator
//			Set<Integer> lottoKeySet = lotto.keySet();
//			Iterator<Integer> iter = lottoKeySet.iterator();
//			while (iter.hasNext()) {
//				Integer key = iter.next();
//				Set<Integer> value = lotto.get(key);
//				pw.println(key + " : " + value.toString());
//			}
			
//			노가다
//			pw.println(1000 + " : " + lotto.get(1000).toString());
//			pw.println(1001 + " : " + lotto.get(1001).toString());
//			pw.println(1002 + " : " + lotto.get(1002).toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
		
		PrintWriter pw2 = null;
		try {
			pw2 = new PrintWriter(new FileWriter(file, true)); // append에 true값을 주면 기존 파일에 추가 가능 (기존파일 내용 그대로 두고)
			pw2.println("새 번호 : 20, 30, 44, 45, 3, 2");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw2.close();
		}
	}
	
}
