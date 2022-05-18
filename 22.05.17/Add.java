public class Add {
    public static void main(String[] args) {
        int x; //변수 선언 (variable declare)
        int y;
        int sum;

	// 초기화(initialinze) : 변수에 제일 처음 값을 넣어주는 것을 뜻함.
        x = 100; //대입연산자 (assignment)
        y = 200;
        sum = x + y;
        
        System.out.println(sum);
        // return;     메소드를 종료시킴. 생략해도 됨. 아래쪽에 문장 적으면 안 됨.(에러 뜸)


	System.out.println(x - y);   // 일회용

	int minus;  		     // 다음에도 계속 쓰기 위함.
	minus = x - y;
	System.out.println(minus);
    }
}