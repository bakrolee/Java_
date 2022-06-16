package membership2;

import java.util.Comparator;

public class SortWeight implements Comparator<Member> {

	@Override
	public int compare(Member m1, Member m2) {
		if (m1.getWeight() > m2.getWeight()) {
			return 1;
		} else if (m1.getWeight() < m2.getWeight()) {
			return -1;
		} else {
			return 0;
		}
	}
}
