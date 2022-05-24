// Not 연산자 : !

public class NotOperator {
	public static void main(String[] args) {
		boolean t = true;
		
		t = !t;
		System.out.println(t);
		
		/* 
		!((10 > 3) && (3 == 3));   // true에서 false가 됨.
		!(!(10 > 3) || (3 == 3));  // false
		 */
	}
}