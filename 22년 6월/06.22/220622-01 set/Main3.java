import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("가", "나", "다", "다", "가", "다", "라"));
		
		Set<String> set = new HashSet<>(list);
		
//		for (int i = 0; i < list.size(); i++) {
//			set.add(list.get(i));
//		}
//		
		System.out.println(set);
	}
}
