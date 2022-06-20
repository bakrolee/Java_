import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 2, 8, 9, 8, 1));
		
		// 오름차순 정렬
		Collections.sort(list);
		System.out.println(list);
		
		// 전제조건 : 정렬이 되고, 중복되지 않으면 사용가능. (장점 : 빠르게 찾음, indexOf는 전체를 다 보기때문에 느림)
		int index = Collections.binarySearch(list, 8);
		System.out.println("8의 인덱스: " + index);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
		Collections.fill(list, 33);
		System.out.println(list);
		
		Collections.replaceAll(list, 33, 77);
		System.out.println(list);
		
//		list.clear();
		
		List<Integer> target = new ArrayList<>(Arrays.asList(90, 80, 70));
		Collections.copy(list, target);
		
		System.out.println(list);
	}
}










