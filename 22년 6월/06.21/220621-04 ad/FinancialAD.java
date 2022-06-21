
public class FinancialAD implements LeafletHandler {
	private String tel;
	
	public FinancialAD(String tel) {
		super();
		this.tel = tel;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String give() {
		return tel;
	}
}
