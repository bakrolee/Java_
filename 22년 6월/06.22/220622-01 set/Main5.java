import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main5 {
	public static void main(String[] args) {
		// 중복되지 않는 1 ~ 45 사이의 정수 6개를 가지는 집합 
		// 로또 만들기
		Set<Integer> lotto = new HashSet<>();
		Random random = new Random();
		
		while (lotto.size() < 6) {
			lotto.add(1 + random.nextInt(45));
		}
		System.out.println(lotto);
		
		// 로또 정렬하기
		List<Integer> list = new ArrayList<>(lotto);
		Collections.sort(list);
		System.out.println(list);
	}
}
