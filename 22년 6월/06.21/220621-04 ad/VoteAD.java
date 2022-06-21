import java.time.LocalDate;

public class VoteAD implements LeafletHandler {
	private LocalDate day;
	
	public VoteAD(LocalDate day) {
		super();
		this.day = day;
	}

	@Override
	public String give() {
		return "투표 날짜: " + day;
	}
}
