import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);  // input은 임의 작성한 이름
		int x;
		int y;
		int sum;
		
		System.out.print("첫 번째 숫자를 입력하시오: ");
		x = input.nextInt();  // 인풋 안에 있는 메소드를 호출하겠다. 
		
		System.out.print("두 번째 숫자를 입력하시오: ");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println(sum);
		
	}
}