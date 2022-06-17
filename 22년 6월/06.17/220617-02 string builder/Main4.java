import java.util.StringTokenizer;

// 아이유가 금요일을 몇 번 언급하였는가?
// 시계는 몇번 언급하였는가?

public class Main4 {
	public static void main(String[] args) {
		String friday = "월요일엔 아마 바쁘지 않을까\r\n" + 
				"화요일도 성급해 보이지 안 그래\r\n" + 
				"수요일은 뭔가 어정쩡한 느낌\r\n" + 
				"목요일은 그냥 내가 왠지 싫어\r\n" + 
				"우 이번 주 금요일\r\n" + 
				"우 금요일에 시간 어때요 oh\r\n" + 
				"주말까지 기다리긴 힘들어\r\n" + 
				"시간아 달려라 시계를 더 보채고 싶지만\r\n" + 
				"(Mind control)\r\n" + 
				"일분 일초가 달콤해\r\n" + 
				"이 남자 도대체 뭐야\r\n" + 
				"사랑에 빠지지 않곤 못 배기겠어 (못 배기겠어)\r\n" + 
				"온 종일 내 맘은 저기 시계바늘 위에 올라타\r\n" + 
				"한 칸씩 그대에게 더 가까이\r\n" + 
				"Na na na na na\r\n" + 
				"Na na na na na na\r\n" + 
				"Na na na na na\r\n" + 
				"La la la la la la la\r\n" + 
				"La la la la la la la la la\r\n" + 
				"우 이번 주 금요일\r\n" + 
				"우 금요일에 시간 어때요 oh\r\n" + 
				"딱히 보고 싶은 영화는 없지만\r\n" + 
				"딱히 먹고 싶은 메뉴는 없지만\r\n" + 
				"주말까지 기다리긴 힘들어\r\n" + 
				"시간아 달려라 시계를 더 보채고 싶지만\r\n" + 
				"(Mind control)\r\n" + 
				"일분 일초가 달콤해\r\n" + 
				"이 남자 도대체 뭐야\r\n" + 
				"사랑에 빠지지 않곤 못 배기겠어 (겠어)\r\n" + 
				"온 종일 내 맘은 저기 시계바늘 위에 올라타\r\n" + 
				"한 칸씩 그대에게 더 가까이\r\n" + 
				"나 뭔가에 홀린 것 같아\r\n" + 
				"이 여잔 도대체 뭐야\r\n" + 
				"사랑해주지 않고는 못 배기겠어\r\n" + 
				"돌아오는 이번 주 금요일에 만나요\r\n" + 
				"그 날 내 맘을 더 가져가줘요\r\n" + 
				"Na 더 가까이 (na na na na) 더 가까이\r\n" + 
				"Na na na na na na 더 가까이 더 가까이 와요\r\n" + 
				"Na na na na na 더 가까이\r\n" + 
				"La la la la la la la la la\r\n" + 
				"La la la la la la la la la";
		
		String reFriday = friday.replaceAll("금요일", "3");
		String reClock = friday.replaceAll("시계", "4");
		
		StringTokenizer st = new StringTokenizer(reFriday, "3");
		StringTokenizer st2 = new StringTokenizer(reClock, "4");
		
		System.out.println(st.countTokens() - 1);
		System.out.println(st2.countTokens() - 1);
		
//		int countFri = 0;
//		while (st.hasMoreTokens()) {
//			String result = st.nextToken();
//			System.out.println(result);
//			
//			countFri++;
//			System.out.println("확인" + countFri);
//		}
//		System.out.println(countFri);
	}
}
