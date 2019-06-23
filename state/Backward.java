public class Backward implements Accelerated {

	@Override 
	public Accelerated backward(){
		return Accelerations.backward;
	}

	@Override 
	public Accelerated forward(){
		return Accelerations.halt;
	}
}