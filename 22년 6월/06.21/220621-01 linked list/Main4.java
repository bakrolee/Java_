import java.util.Deque;
import java.util.LinkedList;

public class Main4 {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<>();
		// 원소 추가
		stack.push("10");
		stack.push("20");
		stack.push("30");
		
		// 원소 빼내기 (맨 마지막 순서)
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
