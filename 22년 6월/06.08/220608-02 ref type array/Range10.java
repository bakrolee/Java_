public class Range10 {
	String[] count = new String[10];
	
	public Range10() {
		for (int i = 0; i < count.length; i++) {
			count[i] = "";
		}
	}
	
	public void count10(int[] target) {
		for (int i = 0; i < target.length; i++) {
			if (target[i] <= 10) {
				count[0] += "*";
			} else if (target[i] <= 20) {
				count[1] += "*";
			} else if (target[i] <= 30) {
				count[2] += "*";
			} else if (target[i] <= 40) {
				count[3] += "*";
			} else if (target[i] <= 50) {
				count[4] += "*";
			} else if (target[i] <= 60) {
				count[5] += "*";
			} else if (target[i] <= 70) {
				count[6] += "*";
			} else if (target[i] <= 80) {
				count[7] += "*";
			} else if (target[i] <= 90) {
				count[8] += "*";
			} else {
				count[9] += "*";
			}
		}
		
		int n = 1;
		for (int i = 0; i < target.length; i++) {
			System.out.printf("%d - %d: %s\n", 
					(10 * i) + n, (10 * i) + 10, count[i]);
		}
	}

}
