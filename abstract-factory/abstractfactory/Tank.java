package abstractfactory;

public class Tank implements Vehicle {

	@Override
	public void move() {
		System.out.println("I go by " + this.getClass().getName());
	}

}
