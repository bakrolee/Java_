package kr.co.greenart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	@Autowired
	@Qualifier("myset")
	private MyDataRepository repo;
	
	public Iterable<Integer> numberService() {
		return repo.getMyNumbers();
	}
}
