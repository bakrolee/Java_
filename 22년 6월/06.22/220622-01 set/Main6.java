import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main6 {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		set.add("banana");
		set.add("carrot");
		set.add("apple");
		set.add("apple");
		
		// 추가된 순서가 그대로 유지된다! (HashSet과 차이점)
		for (String s : set) {
			System.out.println(s);
		}
		
		Set<String> set2 = new HashSet<>(Arrays.asList("apple", "donut", "egg", "fanta"));
		// Linked에 추가되면 순서 유지됨.
//		set.addAll(set2);
//		System.out.println(set);
		
		// HashSet에 추가되면 순서 다 날라감.
		set2.addAll(set);
		System.out.println(set2);
	}
}
