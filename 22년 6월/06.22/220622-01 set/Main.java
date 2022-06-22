import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		boolean b1 = set.add("qwer");
		boolean b2 = set.add(Integer.valueOf(10));
		boolean b3 = set.add("qwer");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println(set.size());
		
		System.out.println(set.toString());
		
//		set.get(0);
		for (Object o : set) {
			System.out.println(o);
		}
		
		Iterator<Object> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
