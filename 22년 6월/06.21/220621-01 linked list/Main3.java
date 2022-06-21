import java.util.LinkedList;
import java.util.Queue;

public class Main3 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		// 원소 추가하기 (offer : 추가가 안 될 때 (잘못된 원소 파라미터 입력) false 반환)
		queue.add("원소1");
		queue.offer("원소2");
		
		System.out.println(queue);
		
		// 원소 빼내기. (poll : 비어있으면 null값 반환)
		String elem1 = queue.poll();
		String elem2 = queue.remove();
		
		System.out.println(elem1);
		System.out.println(elem2);
		
		System.out.println(queue.size());
	}
}
