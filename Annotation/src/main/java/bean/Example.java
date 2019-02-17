package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;


public class Example {

	
	private int id;
	
	@Autowired
	@Qualifier("example2")
	private Injected injected;
	
	public Example() {}
	
	public Example(int id,Injected injected) {
		this.id=id;
		this.setInjected(injected);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Required
	public Injected getInjected() {
		return injected;
	}

	public void setInjected(Injected injected) {
		this.injected = injected;
	}
	
	
}
