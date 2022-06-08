public class Main2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		
		// arr과 똑같은 배열을 하나 만들고 싶을때
		
		//1번
//		int[] copy = arr; 
//		
//		arr[0] = 1000;  // 같은 인스턴스를 참조하고 있기 때문에 copy도 원소값이 변함.
//		
//		for (int i = 0; i < copy.length; i++) {
//			System.out.println(copy[i]);
//		}
		
		// 2번
		int[] copy = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		
		arr[0] = 1000; // copy에 영향을 미치지 않음.
		
		for (int i = 0; i < copy.length; i++) {
			System.out.println(copy[i]);
		}
	}
}
