
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main7 {
	public static void main(String[] args) {
		// 2의 배수 5개를 가지는 리스트
		List<Integer> listTwos = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
		// 7의 배수 5개를 가지는 리스트
		List<Integer> listSevens = new ArrayList<>(Arrays.asList(7, 14, 21, 28, 35));
		// 위의 2개 리스트 통합한 리스트
		List<Integer> listAll = new ArrayList<>();
		listAll.addAll(listTwos);
		listAll.addAll(listSevens);
		// 3번 리스트를 오름차순으로 정렬된 원소를 가지는 리스트
		List<Integer> ordered = new ArrayList<>(listAll);
		Collections.sort(ordered);
		
		System.out.println(listAll);
		System.out.println(ordered);
		
	
		// (Random 객체를 사용하여) 0 ~ 10사이의 난수(정수형)를 6개 가지는 리스트 (각 숫자값은 중복되지 않아야 함)
		List<Integer> listRandom = new ArrayList<>();
		Random random = new Random();
		while (listRandom.size() < 6) {
			int result = random.nextInt(11);
			if (!listRandom.contains(result)) {
				listRandom.add(result);
			}
		}
		System.out.println(listRandom);
	}
}	
