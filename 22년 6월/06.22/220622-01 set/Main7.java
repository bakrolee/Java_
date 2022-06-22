import java.util.Set;
import java.util.TreeSet;

public class Main7 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add(50);
		set.add(17);
		set.add(2);
		set.add(22);
		set.add(30);
		
		for (int i : set) {
			System.out.println(i);
		}
		
		System.out.println(set.toString());
	}
}
