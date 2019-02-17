package bean;

import org.springframework.beans.factory.annotation.Qualifier;

public class Injected {
	

	private int id;

	public Injected() {
		
	}
	
public Injected(int id ) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
