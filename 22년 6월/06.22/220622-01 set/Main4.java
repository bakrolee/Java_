import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
		
		// 합집합 (중복 날림)
		Set<Integer> setUnion = new HashSet<>();
		setUnion.addAll(setA);
		setUnion.addAll(setB);
		System.out.println(setUnion);
		
		// 교집합 (중복되지 않는 부분 날림)
		Set<Integer> setDuplicate = new HashSet<>();
		setDuplicate.addAll(setA);
		setDuplicate.retainAll(setB);
		System.out.println(setDuplicate);
		
		// 차집합 (겹치는 부분만 날리고 나머지)
		Set<Integer> setLeftOuter = new HashSet<>();
		setLeftOuter.addAll(setA);
		setLeftOuter.removeAll(setB);
		System.out.println(setLeftOuter);
		
		// 같은 집합인지 확인하기 (원소만 같으면 같은 집합으로 판단함)
		Set<Integer> setSame = new HashSet<>(Arrays.asList(7,6,5,4,3,2,1));
		System.out.println(setSame.equals(setUnion));
	}
}
