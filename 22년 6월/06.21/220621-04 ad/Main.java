import java.time.LocalDate;

//  interface LeafletHandler {
//	  String give();
//  }

// 일수 광고 전단지 제공자 (구현체 1)
// 전화번호가 포함되어야 함.

// 선거 광고 전단지 제공자 (구현체 2)
// 선거 날짜가 포함되어야 함.

// ==========
// 광고 대행사
// 일수광고/ 선거광고

public class Main {
	public static void main(String[] args) {
		AdCompany c = new AdCompany(new FinancialAD("010-5484-8877"));
		c.consoleAd();
		
		c.setAd(new VoteAD(LocalDate.now()));
		c.consoleAd();
	}
}
