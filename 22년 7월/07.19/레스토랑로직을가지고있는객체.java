
public class 레스토랑로직을가지고있는객체 {
	private RestaurantsDao dao;

	public 레스토랑로직을가지고있는객체() {}
	
	public 레스토랑로직을가지고있는객체(RestaurantsDao dao) {
		super();
		this.dao = dao;
	}

	public void setDao(RestaurantsDao dao) {
		this.dao = dao;
	}
	
	public void 로직1() {
//		커넥션 열고
//		트랙잭션 제어
//		dao.read(커넥션)
//		dao.update(커넥션)
//		dao.delete(커넥션)
//		커밋
//		 -- 예외면 롤백
//		커넥션 닫기
	}
}
