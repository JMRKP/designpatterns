public class Move implements Accelerated {

	private Accelerated currentAcceleration;

	public Move(){
		this.currentAcceleration = Accelerations.halt;
	}

	@Override
	public Accelerated forward(){
		this.currentAcceleration = this.currentAcceleration.forward()
	}
	
	@Override
	public Accelerated backward(){
		this.currentAcceleration = this.currentAcceleration.backward()
	}	
}