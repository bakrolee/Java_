import java.util.ArrayList;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		// 위의 리스트에 10, 20, 30, 40
		for (int i = 1; i <= 4; i++) {
			list.add(i * 10);
		}
		// 모든 원소들을 출력해보세요
		System.out.println(list.toString());
		list.set(1, 15);
		System.out.println(list);
		
		System.out.println(list.contains(30));
		System.out.println(list.indexOf(30));
		
		list.remove(2);
		System.out.println(list);
		
		list.add(0, 0);
		System.out.println(list);
		
//		for (int i = 0; i < list.size(); i++) {
//			list.remove(i);
//		}
		list.clear();
		System.out.println("지운 결과 : " + list);
		
//		System.out.println(list.size() == 0);
		System.out.println(list.isEmpty());
	}
}






